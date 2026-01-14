package com.project.Zaiko.repository;

import com.project.Zaiko.dto.SupplierDeliveryDestDTO;
import com.project.Zaiko.jpa.SupplierDeliveryDestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierDeliveryDestRepository extends JpaRepository<SupplierDeliveryDestEntity, Long> {

    @Query("SELECT new com.project.Zaiko.dto.SupplierDeliveryDestDTO(e.deliveryDestinationId, e.destinationCode, e.departmentName, e.supplierId , s.supplierCode, s.supplierName) " +
           "FROM SupplierDeliveryDestEntity e " +
            "JOIN SupplierEntity s ON e.supplierId = s.supplierId " +
           "WHERE e.delFlg = '0'")
    List<SupplierDeliveryDestDTO> findIdCodeNameByDelFlgZero();
}
