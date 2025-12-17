package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.ProductEntity;
import com.project.Zaiko.service.MasterProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/api")
public class MasterProductController {
    @Autowired
    private MasterProductService masterProductService;

    @GetMapping("/master-product")
    public ResponseEntity<Page<ProductEntity>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int limit
    ){
        Page<ProductEntity> masterProducts= masterProductService.getAllProduct(page, limit);
        return new ResponseEntity<>(masterProducts, HttpStatus.OK);
    }
}
