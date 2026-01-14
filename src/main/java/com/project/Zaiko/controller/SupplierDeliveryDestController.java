package com.project.Zaiko.controller;

import com.project.Zaiko.dto.SupplierDeliveryDestDTO;
import com.project.Zaiko.service.ISupplierDeliveryDestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplier-delivery-destinations")
public class SupplierDeliveryDestController {

    @Autowired
    private ISupplierDeliveryDestService supplierDeliveryDestService;

    @GetMapping
    public ResponseEntity<List<SupplierDeliveryDestDTO>> getAllSupplierDeliveryDestinations() {
        List<SupplierDeliveryDestDTO> list = supplierDeliveryDestService.getAllSupplierDeliveryDestinations();
        return ResponseEntity.ok(list);
    }
}
