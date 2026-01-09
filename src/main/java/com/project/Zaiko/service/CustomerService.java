package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CustomerEntity;
import com.project.Zaiko.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<CustomerEntity> getCustomer(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return customerRepository.getAllCustomers(pageable);
    }
}
