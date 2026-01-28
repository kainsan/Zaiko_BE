package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.ProductInventoryChangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInventoryChangeRepository extends JpaRepository<ProductInventoryChangeEntity, Long> {
}
