package com.project.Zaiko.service;

import com.project.Zaiko.jpa.SupplierEntity;
import org.springframework.data.domain.Page;

public interface ISupplierService {
    Page<SupplierEntity> getSupplier(int page, int size);
}
