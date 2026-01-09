package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.CustomerDeliveryDestEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDeliveryDestRepository extends JpaRepository<CustomerDeliveryDestEntity, Long> {
    @Query("select c from CustomerDeliveryDestEntity c")
    Page<CustomerDeliveryDestEntity> getAllDeliveryDestinations(Pageable pageable);
}
