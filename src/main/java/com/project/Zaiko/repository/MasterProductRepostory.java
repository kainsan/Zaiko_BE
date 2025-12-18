package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterProductRepostory extends JpaRepository<ProductEntity, Long> {

    @Query("""
    select p
    from ProductEntity p
    where
        (:productCodeFrom is null or p.productCode >= :productCodeFrom)
    and (:productCodeTo   is null or p.productCode <= :productCodeTo)

    and (:name1   is null or p.name1 like concat('%', :name1, '%'))
    and (:upcCd1  is null or p.upcCd1 = :upcCd1)
    and (:upcCd2  is null or p.upcCd2 = :upcCd2)

    and (:categoryCode1 is null or p.categoryCode1 = :categoryCode1)
    and (:categoryCode2 is null or p.categoryCode2 = :categoryCode2)
    and (:categoryCode3 is null or p.categoryCode3 = :categoryCode3)
    and (:categoryCode4 is null or p.categoryCode4 = :categoryCode4)
    and (:categoryCode5 is null or p.categoryCode5 = :categoryCode5)

    and (:repositoryId is null or p.repositoryId = :repositoryId)
    and (:locationId   is null or p.locationId   = :locationId)
    and (:isSet is null or p.isSet   = :isSet)
""")
    Page<ProductEntity> searchProduct(
            @Param("productCodeFrom") String productCodeFrom,
            @Param("productCodeTo")   String productCodeTo,

            @Param("name1") String name1,
            @Param("upcCd1") String upcCd1,
            @Param("upcCd2") String upcCd2,

            @Param("categoryCode1") String categoryCode1,
            @Param("categoryCode2") String categoryCode2,
            @Param("categoryCode3") String categoryCode3,
            @Param("categoryCode4") String categoryCode4,
            @Param("categoryCode5") String categoryCode5,

            @Param("repositoryId") Long repositoryId,
            @Param("locationId")   Long locationId,
            @Param("isSet") String isSet,
            Pageable pageable
    );


}
