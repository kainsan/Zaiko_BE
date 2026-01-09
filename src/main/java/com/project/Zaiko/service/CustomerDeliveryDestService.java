package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CustomerDeliveryDestEntity;
import com.project.Zaiko.repository.CustomerDeliveryDestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerDeliveryDestService implements ICustomerDeliveryDestService {

    @Autowired
    private CustomerDeliveryDestRepository customerDeliveryDestRepository;

    @Override
    public Page<CustomerDeliveryDestEntity> getDeliveryDestinations(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return customerDeliveryDestRepository.getAllDeliveryDestinations(pageable);
    }
}
