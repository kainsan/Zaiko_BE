package com.project.Zaiko.repository;

import com.project.Zaiko.dto.InventoryInputDTO;
import com.project.Zaiko.dto.InventoryInputPlanFlatDTO;
import com.project.Zaiko.jpa.InventoryInputEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryInputRepository extends JpaRepository<InventoryInputEntity, Long> {

    @Query("""
    select new com.project.Zaiko.dto.InventoryInputDTO(i, s1.supplierCode, s1.supplierName, r1.repositoryCode, r1.repositoryName, d1.destinationCode, d1.departmentName,ce.customerCode,ce.customerName)
    from InventoryInputEntity i
    left join SupplierEntity s1 on i.planSupplierId = s1.supplierId
    left join RepositoryEntity r1 on i.planRepositoryId = r1.repositoryId and i.companyId = r1.companyId
    left join SupplierDeliveryDestEntity d1 on i.planSupplierDeliveryDestinationId = d1.deliveryDestinationId
    left join CustomerEntity ce on i.productOwnerId = ce.customerId
    """)
    Page<InventoryInputDTO> getAllInventoryInputs(Pageable pageable);

    @Query("""
    select new com.project.Zaiko.dto.InventoryInputDTO(i, s1.supplierCode, s1.supplierName, r1.repositoryCode, r1.repositoryName, d1.destinationCode, d1.departmentName,ce.customerCode,ce.customerName)
    from InventoryInputEntity i
    left join SupplierEntity s1 on i.planSupplierId = s1.supplierId
    left join RepositoryEntity r1 on i.planRepositoryId = r1.repositoryId and i.companyId = r1.companyId
    left join SupplierDeliveryDestEntity d1 on i.planSupplierDeliveryDestinationId = d1.deliveryDestinationId
    left join CustomerEntity ce on i.productOwnerId = ce.customerId
    where
    (:actualRepositoryId is null or i.actualRepositoryId = :actualRepositoryId)
    and (:planRepositoryId is null or i.planRepositoryId = :planRepositoryId)
    /* Customer */
    and (:customerCodeFrom is null or ce.customerCode >= :customerCodeFrom)
    and (:customerCodeTo is null or ce.customerCode <= :customerCodeTo)
    and (:customerName is null or ce.customerName like concat('%', :customerName, '%'))
    /* Delivery */
    and (:deliveryCodeFrom is null or d1.destinationCode >= :deliveryCodeFrom)
    and (:deliveryCodeTo is null  or d1.destinationCode <= :deliveryCodeTo)
    and (:deliveryName is null or d1.departmentName like concat('%', :deliveryName, '%'))
    /* Date */
    and (:inputActualDateFrom is null  or i.inputActualDate >= :inputActualDateFrom)
    and (:inputActualDateTo is null or i.inputActualDate <= :inputActualDateTo)
    and (:inputPlanDateFrom is null  or i.inputPlanDate >= :inputPlanDateFrom)
    and (:inputPlanDateTo is null or i.inputPlanDate <= :inputPlanDateTo)
    /* Status */
    and (:isClosed is null
    or :isClosed = 'ALL'
    or (:isClosed = 'UNCLOSED' and i.isClosed = '0')
    or (:isClosed = 'CLOSED' and i.isClosed = '1'))
    /* Product filter (EXISTS for performance) */
    and (:productCodeFrom is null and :productCodeTo is null and :productName is null
        or exists (
            select 1 from ProductEntity p
            left join InventoryPlanInputDetailEntity ipe on p.productId = ipe.productId
            left join InventoryActualInputDetailEntity iae on p.productId = iae.productId
            where (ipe.inventoryInputId = i.inventoryInputId or iae.inventoryInputId = i.inventoryInputId)
            and p.delFlg = '0'
            and (:productCodeFrom is null or p.productCode >= :productCodeFrom)
            and (:productCodeTo   is null or p.productCode <= :productCodeTo)
            and (:productName     is null or p.name1 like concat('%', :productName, '%'))
        )
    )
    /* Receipt */
    and (:receiptStatus is null
    or :receiptStatus = 'ALL'
    or (:receiptStatus = 'NOT_YET' and i.sumActualQuantity = 0)
    or (:receiptStatus = 'REMAINING' and i.sumActualQuantity < i.sumPlanQuantity)
    or (:receiptStatus = 'DONE' and i.sumActualQuantity >= i.sumPlanQuantity))
    
    and (:receiptType is null
    or :receiptType = 'ALL'
    or (:receiptType = 'PLAN' and i.inputPlanDate is not null and i.inputPlanDate != '')
    or (:receiptType = 'ACTUAL' and i.inputActualDate is not null and i.inputActualDate != ''))
    /* Slip */
    and (:slipNoFrom is null or i.slipNo >= :slipNoFrom)
    and (:slipNoTo is null or i.slipNo <= :slipNoTo)
    /* Supplier */
    and (:supplierCodeFrom is null or s1.supplierCode >= :supplierCodeFrom)
    and (:supplierCodeTo is null or s1.supplierCode <= :supplierCodeTo)
    and (:supplierName is null or s1.supplierName like concat('%', :supplierName, '%'))
    and i.delFlg = '0'
    """)
    Page<InventoryInputDTO> searchInventoryInputs(
            Long actualRepositoryId,
            Long planRepositoryId,
            String customerCodeFrom,
            String customerCodeTo,
            String customerName,
            String deliveryCodeFrom,
            String deliveryCodeTo,
            String deliveryName,
            String inputActualDateFrom,
            String inputActualDateTo,
            String inputPlanDateFrom,
            String inputPlanDateTo,
            String isClosed,
            String productCodeFrom,
            String productCodeTo,
            String productName,
            String receiptStatus,
            String receiptType,
            String slipNoFrom,
            String slipNoTo,
            String supplierCodeFrom,
            String supplierCodeTo,
            String supplierName,
            Pageable pageable);

    @Query("""
    select new com.project.Zaiko.dto.InventoryInputPlanFlatDTO(
        i, d1.destinationCode, d1.departmentName, s1.supplierCode, s1.supplierName, ce.customerCode, ce.customerName, r1.repositoryCode, r1.repositoryName,
        ipe, p.productCode, p.name1, r2.repositoryCode ,r2.repositoryName, l.locationCode, u1.unitName, u2.unitName, u3.unitName, p.standardInfo, p.dateTimeMngType, p.isDateTimeMng, p.isNumberMng,
        ipe.totalPlanQuantity, p.isPackCsInput, p.isPackBlInput, p.isPieceInput,
        ipe.csPlanQuantity, ipe.blPlanQuantity, ipe.psPlanQuantity,
        (select sum(iae.totalActualQuantity) from InventoryActualInputDetailEntity iae where iae.planDetailId = ipe.planDetailId and iae.delFlg = '0')
    )
    from InventoryInputEntity i
    left join InventoryPlanInputDetailEntity ipe on i.inventoryInputId = ipe.inventoryInputId
    left join SupplierDeliveryDestEntity d1 on i.planSupplierDeliveryDestinationId = d1.deliveryDestinationId
    left join SupplierEntity s1 on i.planSupplierId = s1.supplierId
    left join CustomerEntity ce on i.productOwnerId = ce.customerId
    left join RepositoryEntity r1 on i.planRepositoryId = r1.repositoryId and i.companyId = r1.companyId
    left join ProductEntity p on ipe.productId = p.productId and p.isSet = '0'
    left join RepositoryEntity r2 on ipe.repositoryId = r2.repositoryId and ipe.companyId = r2.companyId
    left join LocationEntity l on ipe.locationId = l.locationId
    left join UnitNameEntity u1 on p.packCsUnitCode = u1.unitCode
    left join UnitNameEntity u2 on p.packBlUnitCode = u2.unitCode
    left join UnitNameEntity u3 on p.pieceUnitCode = u3.unitCode
    where i.inventoryInputId = :id and i.delFlg = '0'
    """)
    List<InventoryInputPlanFlatDTO> getInventoryInputById(Long id);
}
