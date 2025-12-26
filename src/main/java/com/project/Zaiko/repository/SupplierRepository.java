package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.SupplementEntity;
import com.project.Zaiko.jpa.SupplierEntity;
import com.project.Zaiko.jpa.UnitNameEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
    @Query("select s from SupplierEntity s")
    Page<SupplierEntity> getAllSuppliers(Pageable pageable);
}
