package com.project.Zaiko.service;

import com.project.Zaiko.dto.MasterProductDTO;
import com.project.Zaiko.dto.SearchProductDTO;

import com.project.Zaiko.jpa.ProductEntity;
import org.springframework.data.domain.Page;

public interface MasterProductService {

    Page<MasterProductDTO> getAllProduct(int page, int size);

    Page<MasterProductDTO> searchProduct(SearchProductDTO searchProductDTO, int page, int size);

    MasterProductDTO getProductByProductId(Long productId);

    MasterProductDTO updateProductByProductId(Long productId, ProductEntity product);
}
