package com.project.Zaiko.service;

import com.project.Zaiko.dto.MasterProductDTO;
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
    public Page<MasterProductDTO> getAllProduct(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return masterProductRepostory.getAllProduct(pageable);
    }

    @Override
    public Page<MasterProductDTO> searchProduct(SearchProductDTO searchProductDTO, int page, int size) {
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

    @Override
    public MasterProductDTO getProductByProductId(Long productId) {
        return masterProductRepostory.getProductByProductId(productId);
    }

    @Override
    public MasterProductDTO updateProductByProductId(Long productId,  ProductEntity product) {
        MasterProductDTO updateProduct = masterProductRepostory.getProductByProductId(productId);
        ProductEntity p = updateProduct.getProductEntity();
        p.setProductCode(product.getProductCode());
        p.setName1(product.getName1());
        p.setUpcCd1(product.getUpcCd1());
        p.setUpcCd2(product.getUpcCd2());
        p.setCategoryCode1(product.getCategoryCode1());
        p.setCategoryCode2(product.getCategoryCode2());
        p.setCategoryCode3(product.getCategoryCode3());
        p.setCategoryCode4(product.getCategoryCode4());
        p.setCategoryCode5(product.getCategoryCode5());
        p.setName2(product.getName2());
        p.setName3(product.getName3());
        p.setName4(product.getName4());
        p.setName5(product.getName5());
        p.setStandardInfo(product.getStandardInfo());
        p.setNotes(product.getNotes());
        p.setFifoType(product.getFifoType());
        p.setIsDateTimeMng(validateZeroOne(product.getIsDateTimeMng()));
        p.setDateTimeMngType(product.getDateTimeMngType());
        p.setIsNumberMng(validateZeroOne(product.getIsNumberMng()));
        p.setCartonWeight(product.getCartonWeight());
        p.setCartonWeightName(product.getCartonWeightName());
        p.setCartonVolume(product.getCartonVolume());
        p.setCartonVolumeName(product.getCartonVolumeName());
        p.setCartonVertical(product.getCartonVertical());
        p.setCartonHorizontal(product.getCartonHorizontal());
        p.setCartonHigh(product.getCartonHigh());
        p.setPieceWeight(product.getPieceWeight());
        p.setPieceWeightName(product.getPieceWeightName());
        p.setPieceVolume(product.getPieceVolume());
        p.setPieceVolumeName(product.getPieceVolumeName());
        p.setPieceVertical(product.getPieceVertical());
        p.setPieceHorizontal(product.getPieceHorizontal());
        p.setPieceHigh(product.getPieceHigh());
        p.setIsPackCsInput(validateZeroOne(product.getIsPackCsInput()));
        p.setIsPackCsOutput(validateZeroOne(product.getIsPackCsOutput()));
        p.setPackCsUnitCode(product.getPackCsUnitCode());
        p.setPackCsAmount(product.getPackCsAmount());
        p.setIsPackBlInput(validateZeroOne(product.getIsPackBlInput()));
        p.setIsPackBlOutput(validateZeroOne(product.getIsPackBlOutput()));
        p.setPackBlUnitCode(product.getPackBlUnitCode());
        p.setPackBlAmount(product.getPackBlAmount());
        p.setIsPieceInput(validateZeroOne(product.getIsPieceInput()));
        p.setIsPieceOutput(validateZeroOne(product.getIsPieceOutput()));
        p.setPieceUnitCode(product.getPieceUnitCode());
        p.setRepositoryId(product.getRepositoryId());
        p.setLocationId(product.getLocationId());
        p.setIsReplenishMng(validateZeroOne(product.getIsReplenishMng()));
        p.setMinInventoryQuantity(product.getMinInventoryQuantity());
        p.setMinInputQuantity(product.getMinInputQuantity());
        p.setIsVarious(validateZeroOne(product.getIsVarious()));
        p.setSupplierId(product.getSupplierId());
        p.setLeadTime(product.getLeadTime());
        p.setTax(product.getTax());
        p.setIsSet(validateZeroOne(product.getIsSet()));
        p.setFreeItem1(product.getFreeItem1());
        p.setFreeItem2(product.getFreeItem2());
        p.setFreeItem3(product.getFreeItem3());
        p.setFreeItem4(product.getFreeItem4());
        p.setFreeItem5(product.getFreeItem5());

        masterProductRepostory.save(p);
        return masterProductRepostory.getProductByProductId(productId);
    }

    @Override
    public MasterProductDTO deleteProductByProductId(Long productId) {
        ProductEntity product = masterProductRepostory.findById(productId).orElse(null);
        if (product != null) {
            product.setDelFlg("0");
            masterProductRepostory.save(product);
        }
        return masterProductRepostory.getProductByProductId(productId);
    }

    @Override
    public MasterProductDTO createProduct(ProductEntity product) {
        product.setDelFlg("1");
        product.setCompanyId(1);
        masterProductRepostory.save(product);
        return masterProductRepostory.getProductByProductId(product.getProductId());
    }

    private String validateZeroOne(String value) {
        if (value == null) return "0";
        if ("1".equals(value) || "true".equalsIgnoreCase(value)) {
            return "1";
        }
        return "0";
    }


}
