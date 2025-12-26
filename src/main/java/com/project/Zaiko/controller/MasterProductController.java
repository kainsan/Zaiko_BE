package com.project.Zaiko.controller;

import com.project.Zaiko.dto.MasterProductDTO;
import com.project.Zaiko.dto.SearchProductDTO;
import com.project.Zaiko.jpa.ProductEntity;
import com.project.Zaiko.service.MasterProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MasterProductController {
    @Autowired
    private MasterProductService masterProductService;

    @GetMapping("/master-product")
    public ResponseEntity<Page<MasterProductDTO>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int limit
    ) {
        Page<MasterProductDTO> masterProducts = masterProductService.getAllProduct(page, limit);
        return new ResponseEntity<>(masterProducts, HttpStatus.OK);
    }

    @GetMapping("/master-product/{productId}")
    public ResponseEntity<MasterProductDTO> getProductByProductId(
            @PathVariable Long productId
    ) {
        MasterProductDTO product = masterProductService.getProductByProductId(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/master-product/search")
    public ResponseEntity<Page<MasterProductDTO>> searchProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int limit,
            SearchProductDTO searchProductDTO
    ) {
        Page<MasterProductDTO> searchProducts = masterProductService.searchProduct(searchProductDTO, page, limit);
        return new ResponseEntity<>(searchProducts, HttpStatus.OK);
    }


    @PostMapping("/master-product/{productId}")
    public ResponseEntity<MasterProductDTO> updateProductByProductId(@PathVariable Long productId, @RequestBody ProductEntity product) {
        MasterProductDTO updateProduct = masterProductService.updateProductByProductId(productId, product);

        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }
}

