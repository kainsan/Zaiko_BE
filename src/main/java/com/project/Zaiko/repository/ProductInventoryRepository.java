package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.ProductInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductInventoryRepository extends JpaRepository<ProductInventoryEntity, Long> {
    
    @Query("SELECT pi FROM ProductInventoryEntity pi WHERE " +
           "pi.companyId = :companyId AND " +
           "pi.productOwnerId = :productOwnerId AND " +
           "pi.supplierId = :supplierId AND " +
           "pi.productId = :productId AND " +
           "pi.repositoryId = :repositoryId AND " +
           "pi.locationId = :locationId AND " +
           "pi.dateTimeMng = :dateTimeMng AND " +
           "pi.numberMng = :numberMng AND " +
           "pi.inventoryProductType = :inventoryProductType AND " +
           "pi.delFlg = '0'")
    Optional<ProductInventoryEntity> findByNineKeys(
            @Param("companyId") Integer companyId,
            @Param("productOwnerId") Long productOwnerId,
            @Param("supplierId") Long supplierId,
            @Param("productId") Long productId,
            @Param("repositoryId") Long repositoryId,
            @Param("locationId") Long locationId,
            @Param("dateTimeMng") String dateTimeMng,
            @Param("numberMng") String numberMng,
            @Param("inventoryProductType") String inventoryProductType
    );
}
