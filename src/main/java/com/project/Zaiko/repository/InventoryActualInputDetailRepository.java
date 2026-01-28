package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.InventoryActualInputDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryActualInputDetailRepository extends JpaRepository<InventoryActualInputDetailEntity, Long> {
    List<InventoryActualInputDetailEntity> findByInventoryInputIdAndDelFlg(Long inventoryInputId, String delFlg);
    long countByInventoryInputIdAndDelFlg(Long inventoryInputId, String delFlg);
}
