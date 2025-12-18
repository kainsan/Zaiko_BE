package com.project.Zaiko.service;

import com.project.Zaiko.dto.SearchProductDTO;
import com.project.Zaiko.jpa.ProductEntity;
import com.project.Zaiko.repository.MasterProductRepostory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class IMasterProductService implements MasterProductService {
    @Autowired
    private MasterProductRepostory masterProductRepostory;


    @Override
    public Page<ProductEntity> getAllProduct(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<ProductEntity> pageResult = masterProductRepostory.findAll(pageable);
        return pageResult;
    }

    @Override
    public Page<ProductEntity> searchProduct(SearchProductDTO searchProductDTO, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return masterProductRepostory.searchProduct(
                searchProductDTO.getProductCodeFrom(),
                searchProductDTO.getProductCodeTo(),
                searchProductDTO.getName1(),
                searchProductDTO.getUpcCd1(),
                searchProductDTO.getUpcCd2(),
                searchProductDTO.getCategoryCode1(),
                searchProductDTO.getCategoryCode2(),
                searchProductDTO.getCategoryCode3(),
                searchProductDTO.getCategoryCode4(),
                searchProductDTO.getCategoryCode5(),
                searchProductDTO.getRepositoryId(),
                searchProductDTO.getLocationId(),
                searchProductDTO.getIsSet(),
                pageable
        );
    }

}
