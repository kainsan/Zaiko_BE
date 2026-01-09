package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CustomerDeliveryDestEntity;
import org.springframework.data.domain.Page;

public interface ICustomerDeliveryDestService {
    Page<CustomerDeliveryDestEntity> getDeliveryDestinations(int page, int size);
}
