package com.project.Zaiko.service;

import com.project.Zaiko.dto.SupplierDeliveryDestDTO;
import com.project.Zaiko.repository.SupplierDeliveryDestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierDeliveryDestService implements ISupplierDeliveryDestService {

    @Autowired
    private SupplierDeliveryDestRepository supplierDeliveryDestRepository;

    @Override
    public List<SupplierDeliveryDestDTO> getAllSupplierDeliveryDestinations() {
        return supplierDeliveryDestRepository.findIdCodeNameByDelFlgZero();
    }
}
