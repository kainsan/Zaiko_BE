package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.SupplierEntity;

import com.project.Zaiko.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SupplierController {
    @Autowired
    private SupplierService suppierService;
    @GetMapping("/suppliers")
    public ResponseEntity<Page<SupplierEntity>> getUnitName(){
        Page<SupplierEntity> suppliers = suppierService.getSupplier(0,100);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
    @GetMapping("/suppliers/{supplierId}")
    public ResponseEntity<Page<SupplierEntity>> getUnitNameById(@PathVariable Long supplierId){
        Page<SupplierEntity> suppliers = suppierService.getSupplier(0,100);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}
