package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterProductRepostory extends JpaRepository<ProductEntity, Long> {

}
