package com.project.Zaiko.repository;

import com.project.Zaiko.dto.MasterProductDTO;
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
    select new com.project.Zaiko.dto.MasterProductDTO(p, c1, c2, c3, c4, c5, re, le, uCs, uBl, uPc)
    from ProductEntity p
    left join Category1Entity c1 on p.categoryCode1 = c1.categoryCode and p.companyId = c1.companyId
    left join Category2Entity c2 on p.categoryCode2 = c2.categoryCode and p.companyId = c2.companyId
    left join Category3Entity c3 on p.categoryCode3 = c3.categoryCode and p.companyId = c3.companyId
    left join Category4Entity c4 on p.categoryCode4 = c4.categoryCode and p.companyId = c4.companyId
    left join Category5Entity c5 on p.categoryCode5 = c5.categoryCode and p.companyId = c5.companyId
    left join RepositoryEntity re on p.repositoryId = re.repositoryId and p.companyId = re.companyId
    left join LocationEntity le  on p.locationId = le.locationId and p.companyId = le.companyId
    left join UnitNameEntity uCs on p.packCsUnitCode = uCs.unitCode
    left join UnitNameEntity uBl on p.packBlUnitCode = uBl.unitCode
    left join UnitNameEntity uPc on p.pieceUnitCode  = uPc.unitCode
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
    Page<MasterProductDTO> searchProduct(
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

    @Query("""
    select new com.project.Zaiko.dto.MasterProductDTO(p, c1, c2, c3, c4, c5, re, le, uCs, uBl, uPc)
        
    from ProductEntity p
    left join Category1Entity c1 on p.categoryCode1 = c1.categoryCode and p.companyId = c1.companyId
    left join Category2Entity c2 on p.categoryCode2 = c2.categoryCode and p.companyId = c2.companyId
    left join Category3Entity c3 on p.categoryCode3 = c3.categoryCode and p.companyId = c3.companyId
    left join Category4Entity c4 on p.categoryCode4 = c4.categoryCode and p.companyId = c4.companyId
    left join Category5Entity c5 on p.categoryCode5 = c5.categoryCode and p.companyId = c5.companyId
    left join RepositoryEntity re on p.repositoryId = re.repositoryId and p.companyId = re.companyId
    left join LocationEntity le  on p.locationId = le.locationId and p.companyId = le.companyId
    left join UnitNameEntity uCs on p.packCsUnitCode = uCs.unitCode
    left join UnitNameEntity uBl on p.packBlUnitCode = uBl.unitCode
    left join UnitNameEntity uPc on p.pieceUnitCode  = uPc.unitCode
    """)
    Page<MasterProductDTO> getAllProduct(Pageable pageable);

    @Query("""
    select new com.project.Zaiko.dto.MasterProductDTO(p, c1, c2, c3, c4, c5, re, le, uCs, uBl, uPc)
    from ProductEntity p
    left join Category1Entity c1 on p.categoryCode1 = c1.categoryCode and p.companyId = c1.companyId
    left join Category2Entity c2 on p.categoryCode2 = c2.categoryCode and p.companyId = c2.companyId
    left join Category3Entity c3 on p.categoryCode3 = c3.categoryCode and p.companyId = c3.companyId
    left join Category4Entity c4 on p.categoryCode4 = c4.categoryCode and p.companyId = c4.companyId
    left join Category5Entity c5 on p.categoryCode5 = c5.categoryCode and p.companyId = c5.companyId
    left join RepositoryEntity re on p.repositoryId = re.repositoryId and p.companyId = re.companyId
    left join LocationEntity le  on p.locationId = le.locationId and p.companyId = le.companyId
    left join UnitNameEntity uCs on p.packCsUnitCode = uCs.unitCode
    left join UnitNameEntity uBl on p.packBlUnitCode = uBl.unitCode
    left join UnitNameEntity uPc on p.pieceUnitCode  = uPc.unitCode
    where
    (p.productId = :productId)
""")
    MasterProductDTO getProductByProductId( @Param("productId") Long productId);
}
