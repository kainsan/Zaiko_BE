package com.project.Zaiko.service;

import com.project.Zaiko.dto.SearchProductDTO;
import com.project.Zaiko.jpa.ProductEntity;

import org.springframework.data.domain.Page;
import java.util.List;

public interface MasterProductService {

    Page<ProductEntity> getAllProduct(int page, int size);

    Page<ProductEntity> searchProduct(SearchProductDTO searchProductDTO, int page, int size);
}
