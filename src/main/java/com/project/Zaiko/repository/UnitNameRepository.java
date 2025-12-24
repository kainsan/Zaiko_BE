package com.project.Zaiko.repository;


import com.project.Zaiko.jpa.UnitNameEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitNameRepository extends JpaRepository<UnitNameEntity, String> {
    @Query("select u from UnitNameEntity u")
    Page<UnitNameEntity> getAllUnitNames(Pageable pageable);
}
