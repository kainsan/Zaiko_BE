package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.CustomerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    @Query("select c from CustomerEntity c")
    Page<CustomerEntity> getAllCustomers(Pageable pageable);
}
