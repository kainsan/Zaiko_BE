package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.InventoryPlanInputDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryPlanInputDetailRepository extends JpaRepository<InventoryPlanInputDetailEntity, Long> {
    List<InventoryPlanInputDetailEntity> findByInventoryInputId(Long inventoryInputId);
}
