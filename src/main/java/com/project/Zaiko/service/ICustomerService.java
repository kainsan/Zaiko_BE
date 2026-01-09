package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CustomerEntity;
import org.springframework.data.domain.Page;

public interface ICustomerService {
    Page<CustomerEntity> getCustomer(int page, int size);
}
