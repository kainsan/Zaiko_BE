package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.InventoryActualInputDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryActualInputDetailRepository extends JpaRepository<InventoryActualInputDetailEntity, Long> {
}
