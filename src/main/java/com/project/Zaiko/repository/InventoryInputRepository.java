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

    @Query(
        value = """
        SELECT DISTINCT
            i.inventory_input_id          AS inventoryInputId,
            i.actual_repository_id        AS actualRepositoryId,
            i.actual_slip_note            AS actualSlipNote,
            i.actual_supplier_delivery_destination_id AS actualSupplierDeliveryDestinationId,
            i.actual_supplier_id          AS actualSupplierId,
            i.actual_supplier_slip_no     AS actualSupplierSlipNo,
            i.company_id                  AS companyId,
            i.contact_status              AS contactStatus,
            i.create_by                   AS createBy,
            i.create_date                 AS createDate,
            i.create_slip_type            AS createSlipType,
            i.del_flg                     AS delFlg,
            i.free_item1                  AS freeItem1,
            i.free_item2                  AS freeItem2,
            i.free_item3                  AS freeItem3,
            i.input_actual_date           AS inputActualDate,
            i.input_plan_date             AS inputPlanDate,
            i.input_status                AS inputStatus,
            i.is_closed                   AS isClosed,
            i.plan_repository_id          AS planRepositoryId,
            i.plan_slip_note              AS planSlipNote,
            i.plan_supplier_delivery_destination_id AS planSupplierDeliveryDestinationId,
            i.plan_supplier_id            AS planSupplierId,
            i.plan_supplier_slip_no       AS planSupplierSlipNo,
            i.product_owner_id            AS productOwnerId,
            i.slip_no                     AS slipNo,
            i.sum_actual_quantity         AS sumActualQuantity,
            i.sum_plan_quantity           AS sumPlanQuantity,
            i.update_by                   AS updateBy,
            i.update_date                 AS updateDate,

            s.supplier_code               AS supplierCode,
            s.supplier_name               AS supplierName,
            r.repository_code             AS repositoryCode,
            r.repository_name             AS repositoryName,
            d.destination_code            AS destinationCode,
            d.department_name             AS departmentName,
            c.customer_code               AS customerCode,
            c.customer_name               AS customerName

        FROM t_inventory_input i

        INNER JOIN (
            SELECT ipd.inventory_input_id
            FROM t_inventory_plan_input_detail ipd
            JOIN m_product p ON p.product_id = ipd.product_id
            WHERE p.del_flg = '0'
              AND (:productCodeFrom IS NULL OR p.product_code >= :productCodeFrom)
              AND (:productCodeTo   IS NULL OR p.product_code <= :productCodeTo)
              AND (:productName     IS NULL OR p.name1 LIKE CONCAT('%', :productName, '%'))

            UNION

            SELECT iad.inventory_input_id
            FROM t_inventory_actual_input_detail iad
            JOIN m_product p ON p.product_id = iad.product_id
            WHERE p.del_flg = '0'
              AND (:productCodeFrom IS NULL OR p.product_code >= :productCodeFrom)
              AND (:productCodeTo   IS NULL OR p.product_code <= :productCodeTo)
              AND (:productName     IS NULL OR p.name1 LIKE CONCAT('%', :productName, '%'))
        ) filtered_product
            ON i.inventory_input_id = filtered_product.inventory_input_id

        LEFT JOIN m_supplier s
               ON i.plan_supplier_id = s.supplier_id
        LEFT JOIN m_repository r
               ON i.plan_repository_id = r.repository_id
              AND i.company_id = r.company_id
        LEFT JOIN m_supplier_delivery_dest d
               ON i.plan_supplier_delivery_destination_id = d.delivery_destination_id
        LEFT JOIN m_customer c
               ON i.product_owner_id = c.customer_id

        WHERE i.del_flg = '0'
          AND (:actualRepositoryId IS NULL OR i.actual_repository_id = :actualRepositoryId)
          AND (:planRepositoryId   IS NULL OR i.plan_repository_id   = :planRepositoryId)
          AND (:customerCodeFrom IS NULL OR c.customer_code >= :customerCodeFrom)
          AND (:customerCodeTo   IS NULL OR c.customer_code <= :customerCodeTo)
          AND (:customerName     IS NULL OR c.customer_name LIKE CONCAT('%', :customerName, '%'))
          AND (:deliveryCodeFrom IS NULL OR d.destination_code >= :deliveryCodeFrom)
          AND (:deliveryCodeTo   IS NULL OR d.destination_code <= :deliveryCodeTo)
          AND (:deliveryName     IS NULL OR d.department_name LIKE CONCAT('%', :deliveryName, '%'))
          AND (:inputActualDateFrom IS NULL OR i.input_actual_date >= :inputActualDateFrom)
          AND (:inputActualDateTo   IS NULL OR i.input_actual_date <= :inputActualDateTo)
          AND (:inputPlanDateFrom   IS NULL OR i.input_plan_date   >= :inputPlanDateFrom)
          AND (:inputPlanDateTo     IS NULL OR i.input_plan_date   <= :inputPlanDateTo)
          AND (
               :isClosed IS NULL
            OR :isClosed = 'ALL'
            OR (:isClosed = 'UNCLOSED' AND i.is_closed = '0')
            OR (:isClosed = 'CLOSED'   AND i.is_closed = '1')
          )
          AND (
               :receiptStatus IS NULL
            OR :receiptStatus = 'ALL'
            OR (:receiptStatus = 'NOT_YET'   AND i.sum_actual_quantity = 0)
            OR (:receiptStatus = 'REMAINING' AND i.sum_actual_quantity < i.sum_plan_quantity)
            OR (:receiptStatus = 'DONE'      AND i.sum_actual_quantity >= i.sum_plan_quantity)
          )
          AND (
               :receiptType IS NULL
            OR :receiptType = 'ALL'
            OR (:receiptType = 'PLAN'   AND i.input_plan_date IS NOT NULL AND i.input_plan_date <> '')
            OR (:receiptType = 'ACTUAL' AND i.input_actual_date IS NOT NULL AND i.input_actual_date <> '')
          )
          AND (:slipNoFrom IS NULL OR i.slip_no >= :slipNoFrom)
          AND (:slipNoTo   IS NULL OR i.slip_no <= :slipNoTo)
          AND (:supplierCodeFrom IS NULL OR s.supplier_code >= :supplierCodeFrom)
          AND (:supplierCodeTo   IS NULL OR s.supplier_code <= :supplierCodeTo)
          AND (:supplierName     IS NULL OR s.supplier_name LIKE CONCAT('%', :supplierName, '%'))
        """,

        countQuery = """
        SELECT COUNT(DISTINCT i.inventory_input_id)
        FROM t_inventory_input i

        INNER JOIN (
            SELECT ipd.inventory_input_id
            FROM t_inventory_plan_input_detail ipd
            JOIN m_product p ON p.product_id = ipd.product_id
            WHERE p.del_flg = '0'
              AND (:productCodeFrom IS NULL OR p.product_code >= :productCodeFrom)
              AND (:productCodeTo   IS NULL OR p.product_code <= :productCodeTo)
              AND (:productName     IS NULL OR p.name1 LIKE CONCAT('%', :productName, '%'))

            UNION

            SELECT iad.inventory_input_id
            FROM t_inventory_actual_input_detail iad
            JOIN m_product p ON p.product_id = iad.product_id
            WHERE p.del_flg = '0'
              AND (:productCodeFrom IS NULL OR p.product_code >= :productCodeFrom)
              AND (:productCodeTo   IS NULL OR p.product_code <= :productCodeTo)
              AND (:productName     IS NULL OR p.name1 LIKE CONCAT('%', :productName, '%'))
        ) filtered_product
            ON i.inventory_input_id = filtered_product.inventory_input_id

        LEFT JOIN m_supplier s
               ON i.plan_supplier_id = s.supplier_id
        LEFT JOIN m_repository r
               ON i.plan_repository_id = r.repository_id
              AND i.company_id = r.company_id
        LEFT JOIN m_supplier_delivery_dest d
               ON i.plan_supplier_delivery_destination_id = d.delivery_destination_id
        LEFT JOIN m_customer c
               ON i.product_owner_id = c.customer_id

        WHERE i.del_flg = '0'
          AND (:actualRepositoryId IS NULL OR i.actual_repository_id = :actualRepositoryId)
          AND (:planRepositoryId   IS NULL OR i.plan_repository_id   = :planRepositoryId)
          AND (:customerCodeFrom IS NULL OR c.customer_code >= :customerCodeFrom)
          AND (:customerCodeTo   IS NULL OR c.customer_code <= :customerCodeTo)
          AND (:customerName     IS NULL OR c.customer_name LIKE CONCAT('%', :customerName, '%'))
          AND (:deliveryCodeFrom IS NULL OR d.destination_code >= :deliveryCodeFrom)
          AND (:deliveryCodeTo   IS NULL OR d.destination_code <= :deliveryCodeTo)
          AND (:deliveryName     IS NULL OR d.department_name LIKE CONCAT('%', :deliveryName, '%'))
          AND (:inputActualDateFrom IS NULL OR i.input_actual_date >= :inputActualDateFrom)
          AND (:inputActualDateTo   IS NULL OR i.input_actual_date <= :inputActualDateTo)
          AND (:inputPlanDateFrom   IS NULL OR i.input_plan_date   >= :inputPlanDateFrom)
          AND (:inputPlanDateTo     IS NULL OR i.input_plan_date   <= :inputPlanDateTo)
          AND (
               :isClosed IS NULL
            OR :isClosed = 'ALL'
            OR (:isClosed = 'UNCLOSED' AND i.is_closed = '0')
            OR (:isClosed = 'CLOSED'   AND i.is_closed = '1')
          )
          AND (
               :receiptStatus IS NULL
            OR :receiptStatus = 'ALL'
            OR (:receiptStatus = 'NOT_YET'   AND i.sum_actual_quantity = 0)
            OR (:receiptStatus = 'REMAINING' AND i.sum_actual_quantity < i.sum_plan_quantity)
            OR (:receiptStatus = 'DONE'      AND i.sum_actual_quantity >= i.sum_plan_quantity)
          )
          AND (
               :receiptType IS NULL
            OR :receiptType = 'ALL'
            OR (:receiptType = 'PLAN'   AND i.input_plan_date IS NOT NULL AND i.input_plan_date <> '')
            OR (:receiptType = 'ACTUAL' AND i.input_actual_date IS NOT NULL AND i.input_actual_date <> '')
          )
          AND (:slipNoFrom IS NULL OR i.slip_no >= :slipNoFrom)
          AND (:slipNoTo   IS NULL OR i.slip_no <= :slipNoTo)
          AND (:supplierCodeFrom IS NULL OR s.supplier_code >= :supplierCodeFrom)
          AND (:supplierCodeTo   IS NULL OR s.supplier_code <= :supplierCodeTo)
          AND (:supplierName     IS NULL OR s.supplier_name LIKE CONCAT('%', :supplierName, '%'))
        """,
        nativeQuery = true
    )
    Page<InventoryInputSummary> searchInventoryInputs(
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
        p.packCsAmount, p.packBlAmount, ipe.delFlg,
        (select sum(iae.totalActualQuantity) from InventoryActualInputDetailEntity iae where iae.planDetailId = ipe.planDetailId and iae.delFlg = '0')
    )
    from InventoryInputEntity i
    left join InventoryPlanInputDetailEntity ipe on i.inventoryInputId = ipe.inventoryInputId
    left join SupplierDeliveryDestEntity d1 on i.planSupplierDeliveryDestinationId = d1.deliveryDestinationId
    left join SupplierEntity s1 on i.planSupplierId = s1.supplierId
    left join CustomerEntity ce on i.productOwnerId = ce.customerId
    left join RepositoryEntity r1 on i.planRepositoryId = r1.repositoryId and i.companyId = r1.companyId
    join ProductEntity p on ipe.productId = p.productId and p.delFlg = '0'
    left join RepositoryEntity r2 on ipe.repositoryId = r2.repositoryId and ipe.companyId = r2.companyId
    left join LocationEntity l on ipe.locationId = l.locationId
    left join UnitNameEntity u1 on p.packCsUnitCode = u1.unitCode
    left join UnitNameEntity u2 on p.packBlUnitCode = u2.unitCode
    left join UnitNameEntity u3 on p.pieceUnitCode = u3.unitCode
    where i.inventoryInputId = :id and i.delFlg = '0'
    """)
    List<InventoryInputPlanFlatDTO> getInventoryInputById(Long id);

    @Query("""
    select new com.project.Zaiko.dto.InventoryInputActualFlatDTO(
        i, d1.destinationCode, d1.departmentName, s1.supplierCode, s1.supplierName, ce.customerCode, ce.customerName, r1.repositoryCode, r1.repositoryName,
        iad, p.productCode, p.name1, r2.repositoryCode ,r2.repositoryName, l.locationCode, u1.unitName, u2.unitName, u3.unitName, p.standardInfo, p.dateTimeMngType, p.isDateTimeMng, p.isNumberMng,
        ipd.totalPlanQuantity, p.isPackCsInput, p.isPackBlInput, p.isPieceInput,
        p.packCsAmount, p.packBlAmount, iad.delFlg
    )
    from InventoryInputEntity i
    left join InventoryActualInputDetailEntity iad on i.inventoryInputId = iad.inventoryInputId
    left join InventoryPlanInputDetailEntity ipd on iad.planDetailId = ipd.planDetailId
    left join SupplierDeliveryDestEntity d1 on i.actualSupplierDeliveryDestinationId = d1.deliveryDestinationId
    left join SupplierEntity s1 on i.actualSupplierId = s1.supplierId
    left join CustomerEntity ce on i.productOwnerId = ce.customerId
    left join RepositoryEntity r1 on i.actualRepositoryId = r1.repositoryId and i.companyId = r1.companyId
    join ProductEntity p on iad.productId = p.productId and p.delFlg = '0'
    left join RepositoryEntity r2 on iad.repositoryId = r2.repositoryId and iad.companyId = r2.companyId
    left join LocationEntity l on iad.locationId = l.locationId
    left join UnitNameEntity u1 on p.packCsUnitCode = u1.unitCode
    left join UnitNameEntity u2 on p.packBlUnitCode = u2.unitCode
    left join UnitNameEntity u3 on p.pieceUnitCode = u3.unitCode
    where i.inventoryInputId = :id and i.delFlg = '0' and (iad.delFlg = '0')
    """)
    List<com.project.Zaiko.dto.InventoryInputActualFlatDTO> getInventoryInputActualById(Long id);
}
