package com.project.Zaiko.service;

import com.project.Zaiko.dto.*;
import com.project.Zaiko.jpa.InventoryInputEntity;
import com.project.Zaiko.jpa.InventoryPlanInputDetailEntity;
import com.project.Zaiko.repository.InventoryInputRepository;
import com.project.Zaiko.repository.InventoryPlanInputDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@Transactional
public class IInventoryInputService implements InventoryInputService {

    @Autowired
    private InventoryInputRepository inventoryInputRepository;

    @Autowired
    private InventoryPlanInputDetailRepository inventoryPlanInputDetailRepository;

    @Override
    public PageResponse<InventoryInputDTO> getInventoryInputs(int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<InventoryInputDTO> resultPage = inventoryInputRepository.getAllInventoryInputs(pageable);

        return mapToPageResponse(resultPage);
    }

    @Override
    public PageResponse<InventoryInputDTO> searchInventoryInputs(com.project.Zaiko.dto.SearchInventoryInputRequest request, int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);

        String inputActualDateFrom = request.getInputActualDateFrom() != null ? request.getInputActualDateFrom().toString().replace("-", "/") : null;
        String inputActualDateTo = request.getInputActualDateTo() != null ? request.getInputActualDateTo().toString().replace("-", "/") : null;
        String inputPlanDateFrom = request.getInputPlanDateFrom() != null ? request.getInputPlanDateFrom().toString().replace("-", "/") : null;
        String inputPlanDateTo = request.getInputPlanDateTo() != null ? request.getInputPlanDateTo().toString().replace("-", "/") : null;

        Page<com.project.Zaiko.repository.InventoryInputSummary> resultPage = inventoryInputRepository.searchInventoryInputs(
                request.getActualRepositoryId() != null && !request.getActualRepositoryId().isEmpty() ? Long.parseLong(request.getActualRepositoryId()) : null,
                request.getPlanRepositoryId() != null && !request.getPlanRepositoryId().isEmpty() ? Long.parseLong(request.getPlanRepositoryId()) : null,
                request.getCustomerCodeFrom(),
                request.getCustomerCodeTo(),
                request.getCustomerName(),
                request.getDeliveryCodeFrom(),
                request.getDeliveryCodeTo(),
                request.getDeliveryName(),
                inputActualDateFrom,
                inputActualDateTo,
                inputPlanDateFrom,
                inputPlanDateTo,
                request.getIsClosed() != null && !request.getIsClosed().isEmpty() ? request.getIsClosed() : "ALL",
                request.getProductCodeFrom(),
                request.getProductCodeTo(),
                request.getProductName(),
                request.getReceiptStatus() != null && !request.getReceiptStatus().isEmpty() ? request.getReceiptStatus() : "ALL",
                request.getReceiptType() != null && !request.getReceiptType().isEmpty() ? request.getReceiptType() : "ALL",
                request.getSlipNoFrom(),
                request.getSlipNoTo(),
                request.getSupplierCodeFrom(),
                request.getSupplierCodeTo(),
                request.getSupplierName(),
                pageable
        );

        Page<InventoryInputDTO> dtoPage = resultPage.map(summary -> {
            InventoryInputEntity entity = new InventoryInputEntity();
            entity.setInventoryInputId(summary.getInventoryInputId());
            entity.setActualRepositoryId(summary.getActualRepositoryId());
            entity.setActualSlipNote(summary.getActualSlipNote());
            entity.setActualSupplierDeliveryDestinationId(summary.getActualSupplierDeliveryDestinationId());
            entity.setActualSupplierId(summary.getActualSupplierId());
            entity.setActualSupplierSlipNo(summary.getActualSupplierSlipNo());
            entity.setCompanyId(summary.getCompanyId());
            entity.setContactStatus(summary.getContactStatus());
            entity.setCreateBy(summary.getCreateBy());
            entity.setCreateDate(summary.getCreateDate());
            entity.setCreateSlipType(summary.getCreateSlipType());
            entity.setDelFlg(summary.getDelFlg());
            entity.setFreeItem1(summary.getFreeItem1());
            entity.setFreeItem2(summary.getFreeItem2());
            entity.setFreeItem3(summary.getFreeItem3());
            entity.setInputActualDate(summary.getInputActualDate());
            entity.setInputPlanDate(summary.getInputPlanDate());
            entity.setInputStatus(summary.getInputStatus());
            entity.setIsClosed(summary.getIsClosed());
            entity.setPlanRepositoryId(summary.getPlanRepositoryId());
            entity.setPlanSlipNote(summary.getPlanSlipNote());
            entity.setPlanSupplierDeliveryDestinationId(summary.getPlanSupplierDeliveryDestinationId());
            entity.setPlanSupplierId(summary.getPlanSupplierId());
            entity.setPlanSupplierSlipNo(summary.getPlanSupplierSlipNo());
            entity.setProductOwnerId(summary.getProductOwnerId());
            entity.setSlipNo(summary.getSlipNo());
            entity.setSumActualQuantity(summary.getSumActualQuantity());
            entity.setSumPlanQuantity(summary.getSumPlanQuantity());
            entity.setUpdateBy(summary.getUpdateBy());
            entity.setUpdateDate(summary.getUpdateDate());

            return new InventoryInputDTO(
                entity,
                summary.getSupplierCode(),
                summary.getSupplierName(),
                summary.getRepositoryCode(),
                summary.getRepositoryName(),
                summary.getDestinationCode(),
                summary.getDepartmentName(),
                summary.getCustomerCode(),
                summary.getCustomerName()
            );
        });

        return mapToPageResponse(dtoPage);
    }

    @Override
    public InventoryInputPlanDTO getInventoryInputPlanById(Long id) {
        List<com.project.Zaiko.dto.InventoryInputPlanFlatDTO> flatList = inventoryInputRepository.getInventoryInputById(id);
        if (flatList.isEmpty()) {
            return null;
        }

        // Take the first element for header information
        InventoryInputPlanFlatDTO first = flatList.get(0);

        InventoryInputPlanDTO result = new InventoryInputPlanDTO();
        
        com.project.Zaiko.dto.InventoryInputPlanHeaderDTO headerDTO = new com.project.Zaiko.dto.InventoryInputPlanHeaderDTO(
            first.getInventoryInputEntity().getInventoryInputId(),
            first.getInventoryInputEntity().getCompanyId(),
            first.getInventoryInputEntity().getInputPlanDate(),
            first.getInventoryInputEntity().getInputActualDate(),
            first.getInventoryInputEntity().getCreateSlipType(),
            first.getInventoryInputEntity().getSlipNo(),
            first.getInventoryInputEntity().getPlanSupplierSlipNo(),
            first.getInventoryInputEntity().getActualSupplierSlipNo(),
            first.getInventoryInputEntity().getPlanSlipNote(),
            first.getInventoryInputEntity().getActualSlipNote(),
            first.getInventoryInputEntity().getPlanSupplierDeliveryDestinationId(),
            first.getInventoryInputEntity().getActualSupplierDeliveryDestinationId(),
            first.getInventoryInputEntity().getPlanSupplierId(),
            first.getInventoryInputEntity().getActualSupplierId(),
            first.getInventoryInputEntity().getProductOwnerId(),
            first.getInventoryInputEntity().getPlanRepositoryId(),
            first.getInventoryInputEntity().getActualRepositoryId(),
            first.getInventoryInputEntity().getInputStatus(),
            first.getInventoryInputEntity().getSumPlanQuantity(),
            first.getInventoryInputEntity().getSumActualQuantity(),
            first.getInventoryInputEntity().getIsClosed(),
            first.getInventoryInputEntity().getFreeItem1(),
            first.getInventoryInputEntity().getFreeItem2(),
            first.getInventoryInputEntity().getFreeItem3(),
            first.getInventoryInputEntity().getContactStatus(),
            first.getDestinationCode(),
            first.getDepartmentName(),
            first.getSupplierCode(),
            first.getSupplierName(),
            first.getCustomerCode(),
            first.getCustomerName(),
            first.getRepositoryCode(),
            first.getRepositoryName()
        );
        result.setInventoryInputPlanHeader(headerDTO);

        // Map details
        List<com.project.Zaiko.dto.InventoryInputPlanDetailDTO> details = flatList.stream()
                .map(flat -> new com.project.Zaiko.dto.InventoryInputPlanDetailDTO(
                        flat.getDetailEntity().getPlanDetailId(),
                        flat.getDetailEntity().getInventoryInputId(),
                        flat.getDetailEntity().getCompanyId(),
                        flat.getDetailEntity().getProductId(),
                        flat.getDetailEntity().getRepositoryId(),
                        flat.getDetailEntity().getLocationId(),
                        flat.getDetailEntity().getDatetimeMng(),
                        flat.getDetailEntity().getNumberMng(),
                        flat.getDetailEntity().getCsPlanQuantity(),
                        flat.getDetailEntity().getBlPlanQuantity(),
                        flat.getDetailEntity().getPsPlanQuantity(),
                        flat.getDetailEntity().getTotalPlanQuantity(),
                        flat.getDetailEntity().getInventoryProductType(),
                        flat.getDetailEntity().getDetailNote(),
                        flat.getDetailEntity().getFreeItem1(),
                        flat.getDetailEntity().getFreeItem2(),
                        flat.getDetailEntity().getFreeItem3(),
                        flat.getProductCode(),
                        flat.getProductName(),
                        flat.getDetailRepositoryCode(),
                        flat.getDetailRepositoryName(),
                        flat.getLocationCode(),
                        flat.getPackCsUnitName(),
                        flat.getPackBlUnitName(),
                        flat.getPieceUnitName(),
                        flat.getStandardInfo(),
                        flat.getDatetimeMngType(),
                        flat.getIsDatetimeMng(),
                        flat.getIsNumberMng(),
                        flat.getTotalQuantityInput(),
                        flat.getIsPackCsInput(),
                        flat.getIsPackBlInput(),
                        flat.getIsPieceInput(),
                        flat.getPackCsAmount(),
                        flat.getPackBlAmount(),
                        flat.getDelFlg(),
                        flat.getTotalActualQuantity()
                ))
                .collect(java.util.stream.Collectors.toList());

        result.setInventoryInputPlanDetails(details);

        return result;
    }

    @Override
    public void createInventoryInputPlan(InventoryInputPlanRequest request) {
        InventoryInputEntity entity = new InventoryInputEntity();
        entity.setDelFlg("0");
        saveInventoryInputPlan(entity, request);
    }

    @Override
    public void updateInventoryInputPlan(Long id, InventoryInputPlanRequest request) {
        InventoryInputEntity entity = inventoryInputRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
        saveInventoryInputPlan(entity, request);
    }

    private void saveInventoryInputPlan(InventoryInputEntity entity, InventoryInputPlanRequest request) {
        // 1. Save Header
        InventoryInputPlanHeaderDTO header = request.getHeader();
        if (header != null) {
            if(header.getCompanyId() == null){
                header.setCompanyId(1);
            }
            entity.setCompanyId(header.getCompanyId());
            entity.setInputPlanDate(convertInputPlanDate(header.getInputPlanDate()));
            entity.setCreateSlipType(header.getCreateSlipType());
            entity.setSlipNo(header.getSlipNo());
            entity.setPlanSupplierSlipNo(header.getPlanSupplierSlipNo());
            entity.setPlanSlipNote(header.getPlanSlipNote());
            entity.setPlanSupplierDeliveryDestinationId(header.getPlanSupplierDeliveryDestinationId());
            entity.setPlanSupplierId(header.getPlanSupplierId());
            entity.setProductOwnerId(header.getProductOwnerId());
            entity.setPlanRepositoryId(header.getPlanRepositoryId());
            entity.setInputStatus(header.getInputStatus());
            entity.setSumPlanQuantity(header.getSumPlanQuantity());
            entity.setSumActualQuantity(header.getSumActualQuantity());
            entity.setIsClosed(header.getIsClosed());
            entity.setFreeItem1(header.getFreeItem1());
            entity.setFreeItem2(header.getFreeItem2());
            entity.setFreeItem3(header.getFreeItem3());
            entity.setContactStatus(header.getContactStatus());
            
            inventoryInputRepository.save(entity);
        }

        // 2. Save Details
        List<InventoryInputPlanDetailDTO> details = request.getDetails();
        if (details != null) {
            for (InventoryInputPlanDetailDTO detailDTO : details) {
                InventoryPlanInputDetailEntity detailEntity;

                if (detailDTO.getPlanDetailId() != null) {
                    // Update existing
                    detailEntity = inventoryPlanInputDetailRepository.findById(detailDTO.getPlanDetailId())
                            .orElse(new InventoryPlanInputDetailEntity());
                } else {
                    // Create new
                    detailEntity = new InventoryPlanInputDetailEntity();
                    detailEntity.setInventoryInputId(entity.getInventoryInputId());
                }

                if (detailDTO.getCompanyId() == null) {
                    detailDTO.setCompanyId(1);
                }
                detailEntity.setCompanyId(detailDTO.getCompanyId());
                detailEntity.setProductId(detailDTO.getProductId());
                detailEntity.setRepositoryId(detailDTO.getRepositoryId());
                detailEntity.setLocationId(detailDTO.getLocationId());
                detailEntity.setDatetimeMng(convertInputPlanDate(detailDTO.getDatetimeMng()));
                detailEntity.setNumberMng(detailDTO.getNumberMng());
                detailEntity.setCsPlanQuantity(detailDTO.getCsPlanQuantity());
                detailEntity.setBlPlanQuantity(detailDTO.getBlPlanQuantity());
                detailEntity.setPsPlanQuantity(detailDTO.getPsPlanQuantity());
                detailEntity.setTotalPlanQuantity(detailDTO.getTotalPlanQuantity());
                detailEntity.setInventoryProductType(detailDTO.getInventoryProductType());
                detailEntity.setDetailNote(detailDTO.getDetailNote());
                detailEntity.setFreeItem1(detailDTO.getFreeItem1());
                detailEntity.setFreeItem2(detailDTO.getFreeItem2());
                detailEntity.setFreeItem3(detailDTO.getFreeItem3());
                
                // Handle delFlg if present in DTO, otherwise default to "0"
                if (detailDTO.getDelFlg() != null) {
                    detailEntity.setDelFlg(detailDTO.getDelFlg());
                } else {
                     if (detailEntity.getDelFlg() == null) {
                        detailEntity.setDelFlg("0");
                     }
                }
                System.out.println(detailEntity.toString());
                inventoryPlanInputDetailRepository.save(detailEntity);
            }
        }
    }

    private PageResponse<InventoryInputDTO> mapToPageResponse(Page<InventoryInputDTO> resultPage) {
        PageResponse<InventoryInputDTO> response = new PageResponse<>();
        response.setContent(resultPage.getContent());
        response.setPageNumber(resultPage.getNumber());
        response.setPageSize(resultPage.getSize());
        response.setTotalElements(resultPage.getTotalElements());
        response.setTotalPages(resultPage.getTotalPages());
        response.setLast(resultPage.isLast());
        return response;
    }

    public String convertInputPlanDate(String isoUtc) {
        if (isoUtc == null || isoUtc.isBlank()) {
            return null;
        }

        LocalDate localDate = Instant.parse(isoUtc)
                .atZone(ZoneId.of("Asia/Tokyo")) // hoặc systemDefault()
                .toLocalDate();

        return localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    @Override
    public void deleteInventoryInput(Long id) {
        // 1. Soft delete Header
        InventoryInputEntity entity = inventoryInputRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
        entity.setDelFlg("1");
        System.out.println(entity.getDelFlg());
        inventoryInputRepository.save(entity);

        //     detail.setDelFlg("1");
        //     inventoryPlanInputDetailRepository.save(detail);
        // }
    }

    @Override
    public InventoryInputActualDTO getInventoryInputActualById(Long id) {
        List<com.project.Zaiko.dto.InventoryInputActualFlatDTO> flatList = inventoryInputRepository.getInventoryInputActualById(id);
        if (flatList.isEmpty()) {
            return null;
        }

        // Take the first element for header information
        InventoryInputActualFlatDTO first = flatList.get(0);

        InventoryInputActualDTO result = new InventoryInputActualDTO();
        
        InventoryInputActualHeaderDTO headerDTO = new InventoryInputActualHeaderDTO(
            first.getInventoryInputEntity().getInventoryInputId(),
            first.getInventoryInputEntity().getCompanyId(),
            first.getInventoryInputEntity().getInputActualDate(),
            first.getInventoryInputEntity().getCreateSlipType(),
            first.getInventoryInputEntity().getSlipNo(),
            first.getInventoryInputEntity().getActualSupplierSlipNo(),
            first.getInventoryInputEntity().getActualSlipNote(),
            first.getInventoryInputEntity().getActualSupplierDeliveryDestinationId(),
            first.getInventoryInputEntity().getActualSupplierId(),
            first.getInventoryInputEntity().getProductOwnerId(),
            first.getInventoryInputEntity().getActualRepositoryId(),
            first.getInventoryInputEntity().getInputStatus(),
            first.getInventoryInputEntity().getSumPlanQuantity(),
            first.getInventoryInputEntity().getSumActualQuantity(),
            first.getInventoryInputEntity().getIsClosed(),
            first.getInventoryInputEntity().getFreeItem1(),
            first.getInventoryInputEntity().getFreeItem2(),
            first.getInventoryInputEntity().getFreeItem3(),
            first.getInventoryInputEntity().getContactStatus(),
            first.getDestinationCode(),
            first.getDepartmentName(),
            first.getSupplierCode(),
            first.getSupplierName(),
            first.getCustomerCode(),
            first.getCustomerName(),
            first.getRepositoryCode(),
            first.getRepositoryName()
        );
        result.setInventoryInputActualHeader(headerDTO);

        // Map details
        List<InventoryInputActualDetailDTO> details = flatList.stream()
                .map(flat -> new InventoryInputActualDetailDTO(
                        flat.getDetailEntity().getDateTimeMng(),
                        flat.getDetailEntity().getActualDetailId(),
                        flat.getDetailEntity().getInventoryInputId(),
                        flat.getDetailEntity().getCompanyId(),
                        flat.getDetailEntity().getProductId(),
                        flat.getDetailEntity().getRepositoryId(),
                        flat.getDetailEntity().getLocationId(),
                        flat.getDetailEntity().getNumberMng(),
                        flat.getDetailEntity().getCsActualQuantity(),
                        flat.getDetailEntity().getBlActualQuantity(),
                        flat.getDetailEntity().getPsActualQuantity(),
                        flat.getDetailEntity().getTotalActualQuantity(),
                        flat.getDetailEntity().getInventoryProductType(),
                        flat.getDetailEntity().getDetailNote(),
                        flat.getProductCode(),
                        flat.getProductName(),
                        flat.getDetailRepositoryCode(),
                        flat.getDetailRepositoryName(),
                        flat.getLocationCode(),
                        flat.getPackCsUnitName(),
                        flat.getPackBlUnitName(),
                        flat.getPieceUnitName(),
                        flat.getDatetimeMngType(),
                        flat.getIsDatetimeMng(),
                        flat.getIsNumberMng(),
                        flat.getIsPackCsInput(),
                        flat.getIsPackBlInput(),
                        flat.getIsPieceInput(),
                        flat.getTotalQuantityInput(),
                        flat.getStandardInfo(),
                        flat.getPackCsAmount(),
                        flat.getPackBlAmount(),
                        flat.getDelFlg()
                ))
                .collect(java.util.stream.Collectors.toList());

        result.setInventoryInputActualDetails(details);

        return result;
    }
}
