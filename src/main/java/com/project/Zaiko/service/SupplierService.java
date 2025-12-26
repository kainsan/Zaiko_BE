package com.project.Zaiko.service;

import com.project.Zaiko.jpa.SupplierEntity;
import com.project.Zaiko.repository.SupplierRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class SupplierService implements ISupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Override
    public Page<SupplierEntity> getSupplier(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.getAllSuppliers(pageable);
    }
}
