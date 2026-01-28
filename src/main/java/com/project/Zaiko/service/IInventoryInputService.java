package com.project.Zaiko.service;

import com.project.Zaiko.dto.*;
import com.project.Zaiko.jpa.InventoryActualInputDetailEntity;
import com.project.Zaiko.jpa.InventoryInputEntity;
import com.project.Zaiko.jpa.InventoryPlanInputDetailEntity;
import com.project.Zaiko.repository.InventoryActualInputDetailRepository;
import com.project.Zaiko.repository.InventoryInputRepository;
import com.project.Zaiko.repository.InventoryInputSummary;
import com.project.Zaiko.repository.InventoryPlanInputDetailRepository;
import com.project.Zaiko.repository.ProductInventoryRepository;
import com.project.Zaiko.repository.ProductInventoryChangeRepository;
import com.project.Zaiko.jpa.ProductInventoryEntity;
import com.project.Zaiko.jpa.ProductInventoryChangeEntity;
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
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class IInventoryInputService implements InventoryInputService {

    @Autowired
    private InventoryInputRepository inventoryInputRepository;

    @Autowired
    private InventoryPlanInputDetailRepository inventoryPlanInputDetailRepository;

    @Autowired
    private InventoryActualInputDetailRepository inventoryActualInputDetailRepository;

    @Autowired
    private ProductInventoryRepository productInventoryRepository;

    @Autowired
    private ProductInventoryChangeRepository productInventoryChangeRepository;

    @Override
    public PageResponse<InventoryInputDTO> getInventoryInputs(int page, int limit) {
        try {
            Pageable pageable = PageRequest.of(page, limit);
            Page<InventoryInputDTO> resultPage = inventoryInputRepository.getAllInventoryInputs(pageable);

            return mapToPageResponse(resultPage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageResponse<InventoryInputDTO> searchInventoryInputs(SearchInventoryInputRequest request, int page, int limit) {
        try {
            Pageable pageable = PageRequest.of(page, limit);

            String inputActualDateFrom = request.getInputActualDateFrom() != null ? request.getInputActualDateFrom().toString().replace("-", "/") : null;
            String inputActualDateTo = request.getInputActualDateTo() != null ? request.getInputActualDateTo().toString().replace("-", "/") : null;
            String inputPlanDateFrom = request.getInputPlanDateFrom() != null ? request.getInputPlanDateFrom().toString().replace("-", "/") : null;
            String inputPlanDateTo = request.getInputPlanDateTo() != null ? request.getInputPlanDateTo().toString().replace("-", "/") : null;

            Page<InventoryInputSummary> resultPage = inventoryInputRepository.searchInventoryInputs(
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InventoryInputPlanDTO getInventoryInputPlanById(Long id) {
        try {
            List<InventoryInputPlanFlatDTO> flatList = inventoryInputRepository.getInventoryInputById(id);
            if (flatList.isEmpty()) {
                return null;
            }

            // Take the first element for header information
            InventoryInputPlanFlatDTO first = flatList.get(0);

            InventoryInputPlanDTO result = new InventoryInputPlanDTO();

            InventoryInputPlanHeaderDTO headerDTO = new InventoryInputPlanHeaderDTO(
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
            List<InventoryInputPlanDetailDTO> details = flatList.stream()
                    .map(flat -> new InventoryInputPlanDetailDTO(
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createInventoryInputPlan(InventoryInputPlanRequest request) {
        try {
            InventoryInputEntity entity = new InventoryInputEntity();
            entity.setDelFlg("0");

            InventoryInputPlanHeaderDTO header = request.getHeader();
            if (header != null) {
                if (header.getSlipNo() == null || header.getSlipNo().isBlank()) {
                    header.setSlipNo(generateSlipNo());
                } else {
                    if (inventoryInputRepository.existsBySlipNo(header.getSlipNo())) {
                        throw new RuntimeException("Slip number already exists: " + header.getSlipNo());
                    }
                }
            }

            saveInventoryInputPlan(entity, request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createInventoryActualPlan(InventoryInputActualRequest request) {
        try {
            InventoryInputEntity entity = new InventoryInputEntity();
            entity.setDelFlg("0");

            InventoryInputActualHeaderDTO header = request.getHeader();
            if (header != null) {
                if (header.getSlipNo() == null || header.getSlipNo().isBlank()) {
                    header.setSlipNo(generateSlipNo());
                } else {
                    if (inventoryInputRepository.existsBySlipNo(header.getSlipNo())) {
                        throw new RuntimeException("Slip number already exists: " + header.getSlipNo());
                    }
                }
            }

            saveInventoryInputActual(entity, request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized String generateSlipNo() {
        String prefix = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"));
        String maxSlipNo = inventoryInputRepository.findMaxSlipNoByPrefix(prefix);

        int nextSeq = 1;
        if (maxSlipNo != null && maxSlipNo.length() >= 10) {
            try {
                String seqStr = maxSlipNo.substring(6);
                nextSeq = Integer.parseInt(seqStr) + 1;
            } catch (NumberFormatException e) {
                // Fallback to 1 if parsing fails
            }
        }

        String generatedSlipNo;
        while (true) {
            generatedSlipNo = String.format("%s%04d", prefix, nextSeq);
            if (!inventoryInputRepository.existsBySlipNo(generatedSlipNo)) {
                break;
            }
            nextSeq++;
        }

        return generatedSlipNo;
    }

    @Override
    public void updateInventoryInputPlan(Long id, InventoryInputPlanRequest request) {
        try {
            InventoryInputEntity entity = inventoryInputRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
            saveInventoryInputPlan(entity, request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void saveInventoryInputPlan(InventoryInputEntity entity, InventoryInputPlanRequest request) {
        // 1. Save Header
        InventoryInputPlanHeaderDTO header = request.getHeader();
        if (header != null) {
            if (header.getCompanyId() == null) {
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
        try {
            // 1. Soft delete Header
            InventoryInputEntity entity = inventoryInputRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
            entity.setDelFlg("1");
            System.out.println(entity.getDelFlg());
            inventoryInputRepository.save(entity);
            //     detail.setDelFlg("1");
            //     inventoryPlanInputDetailRepository.save(detail);
            // }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InventoryInputActualDTO getInventoryInputActualById(Long id) {
        try {
            List<InventoryInputActualFlatDTO> flatList = inventoryInputRepository.getInventoryInputActualById(id);
            if (flatList.isEmpty()) {
                return null;
            }

            // Take the first element for header information
            InventoryInputActualFlatDTO first = flatList.get(0);

            InventoryInputActualDTO result = new InventoryInputActualDTO();

            InventoryInputActualHeaderDTO headerDTO = new InventoryInputActualHeaderDTO(
                    first.getInventoryInputEntity().getInventoryInputId(),
                    first.getInventoryInputEntity().getCompanyId(),
                    first.getInventoryInputEntity().getInputPlanDate(),
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
                            flat.getDetailEntity().getInputActualDate(),
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInventoryInputActual(Long id, InventoryInputActualRequest request) {
        try {
            InventoryInputEntity entity = inventoryInputRepository.findById(id).orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
            saveInventoryInputActual(entity, request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void saveInventoryInputActual(InventoryInputEntity entity, InventoryInputActualRequest request) {
        InventoryInputActualHeaderDTO header = request.getHeader();
        if (header != null) {
            if (header.getCompanyId() == null) {
                header.setCompanyId(1);
            }
            entity.setCompanyId(header.getCompanyId());
            entity.setInputActualDate(convertInputPlanDate(header.getInputActualDate()));
            entity.setSlipNo(header.getSlipNo());
            entity.setActualSupplierSlipNo(header.getActualSupplierSlipNo());
            entity.setActualSlipNote(header.getActualSlipNote());
            entity.setActualSupplierDeliveryDestinationId(header.getActualSupplierDeliveryDestinationId());
            entity.setActualSupplierId(header.getActualSupplierId());
            entity.setProductOwnerId(header.getProductOwnerId());
            entity.setActualRepositoryId(header.getActualRepositoryId());
            entity.setInputStatus(header.getInputStatus());
            entity.setSumActualQuantity(header.getSumActualQuantity());
            entity.setIsClosed(header.getIsClosed());
            entity.setFreeItem1(header.getFreeItem1());
            entity.setFreeItem2(header.getFreeItem2());
            entity.setFreeItem3(header.getFreeItem3());
            entity.setContactStatus(header.getContactStatus());

            inventoryInputRepository.save(entity);
        }

        List<InventoryInputActualDetailDTO> details = request.getDetails();
        if (details != null) {
            for (InventoryInputActualDetailDTO detailDTO : details) {
                InventoryActualInputDetailEntity detailEntity;

                if (detailDTO.getActualDetailId() != null) {
                    detailEntity = inventoryActualInputDetailRepository.findById(detailDTO.getActualDetailId())
                            .orElse(new InventoryActualInputDetailEntity());
                } else {
                    detailEntity = new InventoryActualInputDetailEntity();
                    detailEntity.setInventoryInputId(entity.getInventoryInputId());
                }

                if (detailDTO.getCompanyId() == null) {
                    detailDTO.setCompanyId(1);
                }
                detailEntity.setCompanyId(detailDTO.getCompanyId());
                detailEntity.setProductId(detailDTO.getProductId());
                detailEntity.setRepositoryId(detailDTO.getRepositoryId());
                detailEntity.setLocationId(detailDTO.getLocationId());
                detailEntity.setDateTimeMng(convertInputPlanDate(detailDTO.getDatetimeMng()));
                detailEntity.setNumberMng(detailDTO.getNumberMng());
                detailEntity.setCsActualQuantity(detailDTO.getCsActualQuantity());
                detailEntity.setBlActualQuantity(detailDTO.getBlActualQuantity());
                detailEntity.setPsActualQuantity(detailDTO.getPsActualQuantity());
                detailEntity.setTotalActualQuantity(detailDTO.getTotalActualQuantity());
                detailEntity.setInventoryProductType(detailDTO.getInventoryProductType());
                detailEntity.setDetailNote(detailDTO.getDetailNote());

                if (detailDTO.getDelFlg() != null) {
                    detailEntity.setDelFlg(detailDTO.getDelFlg());
                } else {
                    if (detailEntity.getDelFlg() == null) {
                        detailEntity.setDelFlg("0");
                    }
                }
                System.out.println(detailEntity.toString());
                inventoryActualInputDetailRepository.save(detailEntity);
            }
        }
    }

    @Override
    public InventoryInputCorrectionDTO getInventoryInputCorrectionById(Long id) {
        try {
            List<InventoryInputCorrectionFlatDTO> flatList = inventoryInputRepository.getInventoryInputCorrectionById(id);
            if (flatList.isEmpty()) {
                return null;
            }

            InventoryInputCorrectionFlatDTO first = flatList.get(0);
            InventoryInputCorrectionDTO result = new InventoryInputCorrectionDTO();

            InventoryInputCorrectionHeaderDTO headerDTO = new InventoryInputCorrectionHeaderDTO(
                    first.getInventoryInputEntity().getInventoryInputId(),
                    first.getInventoryInputEntity().getCompanyId(),
                    first.getInventoryInputEntity().getInputPlanDate(),
                    first.getInventoryInputEntity().getCreateSlipType(),
                    first.getInventoryInputEntity().getSlipNo(),
                    first.getInventoryInputEntity().getActualSupplierSlipNo(),
                    first.getInventoryInputEntity().getActualSupplierDeliveryDestinationId(),
                    first.getDestinationCode(),
                    first.getDepartmentName(),
                    first.getInventoryInputEntity().getActualSupplierId(),
                    first.getSupplierCode(),
                    first.getSupplierName(),
                    first.getInventoryInputEntity().getProductOwnerId(),
                    first.getCustomerCode(),
                    first.getCustomerName(),
                    first.getInventoryInputEntity().getActualRepositoryId(),
                    first.getRepositoryCode(),
                    first.getRepositoryName(),
                    first.getInventoryInputEntity().getActualSlipNote()
            );
            result.setInventoryInputCorrectionHeader(headerDTO);

            List<InventoryInputCorrectionDetailDTO> details = flatList.stream()
                    .filter(flat -> flat.getDetailEntity() != null)
                    .map(flat -> new InventoryInputCorrectionDetailDTO(
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
                            flat.getDetailEntity().getInputActualDate(),
                            flat.getCorrectionReason(),
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

            result.setInventoryInputCorrectionDetails(details);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateInventoryInputCorrection(Long id, InventoryInputCorrectionDTO request) {
        try {
            InventoryInputEntity entity = inventoryInputRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
            
            InventoryInputCorrectionHeaderDTO header = request.getInventoryInputCorrectionHeader();
            if (header != null) {
                if (header.getCompanyId() == null) {
                    header.setCompanyId(1);
                }
                entity.setCompanyId(header.getCompanyId());
//                entity.setActualSupplierSlipNo(header.getActualSupplierSlipNo());
                entity.setActualSlipNote(header.getActualSlipNote());
//                entity.setActualSupplierDeliveryDestinationId(header.getActualSupplierDeliveryDestinationId());
                entity.setActualSupplierId(header.getActualSupplierId());
                entity.setProductOwnerId(header.getProductOwnerId());
                entity.setActualRepositoryId(header.getActualRepositoryId());
                
                inventoryInputRepository.save(entity);
                System.out.println("Updated t_inventory_input: " + entity.getInventoryInputId());
            }

            List<InventoryInputCorrectionDetailDTO> details = request.getInventoryInputCorrectionDetails();
            if (details != null) {
                Map<Long, InventoryActualInputDetailEntity> existingDetailsMap = new HashMap<>();
                List<InventoryActualInputDetailEntity> existingDetails = 
                    inventoryActualInputDetailRepository.findByInventoryInputIdAndDelFlg(id, "0");
                
                for (InventoryActualInputDetailEntity existing : existingDetails) {
                    existingDetailsMap.put(existing.getActualDetailId(), existing);
                }

                Set<Long> processedDetailIds = new HashSet<>();

                for (InventoryInputCorrectionDetailDTO detailDTO : details) {
                    if ("1".equals(detailDTO.getDelFlg())) {
                        if (detailDTO.getActualDetailId() != null) {
                            processedDetailIds.add(detailDTO.getActualDetailId());
                            handleDeleteDetail(detailDTO, entity, header);
                        }
                        continue;
                    }

                    InventoryActualInputDetailEntity detailEntity;
                    boolean isNew = false;

                    if (detailDTO.getActualDetailId() != null && existingDetailsMap.containsKey(detailDTO.getActualDetailId())) {
                        detailEntity = existingDetailsMap.get(detailDTO.getActualDetailId());
                        processedDetailIds.add(detailDTO.getActualDetailId());
                        
                        handleEditDetail(detailEntity, detailDTO, entity, header);
                    } else {
                        isNew = true;
                        detailEntity = new InventoryActualInputDetailEntity();
                        detailEntity.setInventoryInputId(entity.getInventoryInputId());
                        
                        handleAddDetail(detailEntity, detailDTO, entity, header);
                    }

                    if (detailDTO.getCompanyId() == null) {
                        detailDTO.setCompanyId(1);
                    }
                    detailEntity.setCompanyId(detailDTO.getCompanyId());
                    detailEntity.setProductOwnerId(header.getProductOwnerId());
                    detailEntity.setSupplierId(header.getActualSupplierId());
                    detailEntity.setProductId(detailDTO.getProductId());
                    detailEntity.setRepositoryId(detailDTO.getRepositoryId());
                    detailEntity.setLocationId(detailDTO.getLocationId());
                    detailEntity.setDateTimeMng(convertInputPlanDate(detailDTO.getDatetimeMng()));
                    detailEntity.setNumberMng(detailDTO.getNumberMng());
                    detailEntity.setCsActualQuantity(detailDTO.getCsActualQuantity());
                    detailEntity.setBlActualQuantity(detailDTO.getBlActualQuantity());
                    detailEntity.setPsActualQuantity(detailDTO.getPsActualQuantity());
                    detailEntity.setTotalActualQuantity(detailDTO.getTotalActualQuantity());
                    detailEntity.setInventoryProductType(detailDTO.getInventoryProductType());
                    detailEntity.setDetailNote(detailDTO.getDetailNote());
                    detailEntity.setInputActualDate(convertInputPlanDate(detailDTO.getInputActualDate()));
                    detailEntity.setCorrectionReason(detailDTO.getCorrectionReason());

                    if (detailDTO.getDelFlg() != null) {
                    detailEntity.setDelFlg(detailDTO.getDelFlg());
                } else {
                    if (detailEntity.getDelFlg() == null) {
                        detailEntity.setDelFlg("0");
                    }
                }
                InventoryActualInputDetailEntity savedDetail = inventoryActualInputDetailRepository.save(detailEntity);
                System.out.println("Updated/Inserted t_inventory_actual_input_detail: " + savedDetail.getActualDetailId());
            }

                for (Map.Entry<Long, InventoryActualInputDetailEntity> entry : existingDetailsMap.entrySet()) {
                    if (!processedDetailIds.contains(entry.getKey())) {
                        InventoryActualInputDetailEntity deletedDetail = entry.getValue();
                        InventoryInputCorrectionDetailDTO deleteDTO = new InventoryInputCorrectionDetailDTO();
                        deleteDTO.setActualDetailId(deletedDetail.getActualDetailId());
                        deleteDTO.setProductId(deletedDetail.getProductId());
                        deleteDTO.setRepositoryId(deletedDetail.getRepositoryId());
                        deleteDTO.setLocationId(deletedDetail.getLocationId());
                        deleteDTO.setDatetimeMng(deletedDetail.getDateTimeMng());
                        deleteDTO.setNumberMng(deletedDetail.getNumberMng());
                        deleteDTO.setInventoryProductType(deletedDetail.getInventoryProductType());
                        deleteDTO.setTotalActualQuantity(deletedDetail.getTotalActualQuantity());
                        
                        handleDeleteDetail(deleteDTO, entity, header);
                    }
                }

                long remainingCount = inventoryActualInputDetailRepository.countByInventoryInputIdAndDelFlg(id, "0");
                boolean hasPlan = inventoryPlanInputDetailRepository.existsByInventoryInputId(id);
                
                if (remainingCount == 0 && !hasPlan) {
                    entity.setDelFlg("1");
                    inventoryInputRepository.save(entity);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void handleAddDetail(InventoryActualInputDetailEntity detailEntity, 
                                 InventoryInputCorrectionDetailDTO detailDTO,
                                 InventoryInputEntity headerEntity,
                                 InventoryInputCorrectionHeaderDTO header) {
        ProductInventoryEntity inventory = findOrCreateProductInventory(
            detailDTO.getCompanyId() != null ? detailDTO.getCompanyId() : 1,
            header.getProductOwnerId(),
            header.getActualSupplierId(),
            detailDTO.getProductId(),
            detailDTO.getRepositoryId(),
            detailDTO.getLocationId(),
            convertInputPlanDate(detailDTO.getDatetimeMng()),
            detailDTO.getNumberMng(),
            detailDTO.getInventoryProductType()
        );

        Long oldQuantity = inventory.getQuantity() != null ? inventory.getQuantity() : 0L;
        Long newQuantity = oldQuantity + (detailDTO.getTotalActualQuantity() != null ? detailDTO.getTotalActualQuantity() : 0L);
        inventory.setQuantity(newQuantity);
        productInventoryRepository.save(inventory);
        System.out.println("Updated t_product_inventory: " + inventory.getInventoryId());

        createInventoryChangeRecord(
            inventory,
            detailDTO.getTotalActualQuantity() != null ? detailDTO.getTotalActualQuantity() : 0L,
            newQuantity,
            headerEntity,
            null,
            "CORRECTION_ADD"
        );
    }

    private void handleEditDetail(InventoryActualInputDetailEntity oldDetail,
                                  InventoryInputCorrectionDetailDTO newDetailDTO,
                                  InventoryInputEntity headerEntity,
                                  InventoryInputCorrectionHeaderDTO header) {
        Long oldQuantity = oldDetail.getTotalActualQuantity() != null ? oldDetail.getTotalActualQuantity() : 0L;
        Long newQuantity = newDetailDTO.getTotalActualQuantity() != null ? newDetailDTO.getTotalActualQuantity() : 0L;

        boolean keyFieldsChanged = hasKeyFieldsChanged(oldDetail, newDetailDTO, header);

        if (keyFieldsChanged) {
            ProductInventoryEntity oldInventory = findOrCreateProductInventory(
                oldDetail.getCompanyId(),
                oldDetail.getProductOwnerId(),
                oldDetail.getSupplierId(),
                oldDetail.getProductId(),
                oldDetail.getRepositoryId(),
                oldDetail.getLocationId(),
                oldDetail.getDateTimeMng(),
                oldDetail.getNumberMng(),
                oldDetail.getInventoryProductType()
            );

            Long oldTotalQty = oldInventory.getQuantity() != null ? oldInventory.getQuantity() : 0L;
            Long newOldTotalQty = oldTotalQty - oldQuantity;
            oldInventory.setQuantity(newOldTotalQty);
            productInventoryRepository.save(oldInventory);
            System.out.println("Updated t_product_inventory (Old): " + oldInventory.getInventoryId());

            createInventoryChangeRecord(
                oldInventory,
                -oldQuantity,
                newOldTotalQty,
                headerEntity,
                oldDetail,
                "CORRECTION_KEY_CHANGE_OLD"
            );

            ProductInventoryEntity newInventory = findOrCreateProductInventory(
                newDetailDTO.getCompanyId() != null ? newDetailDTO.getCompanyId() : 1,
                header.getProductOwnerId(),
                header.getActualSupplierId(),
                newDetailDTO.getProductId(),
                newDetailDTO.getRepositoryId(),
                newDetailDTO.getLocationId(),
                convertInputPlanDate(newDetailDTO.getDatetimeMng()),
                newDetailDTO.getNumberMng(),
                newDetailDTO.getInventoryProductType()
            );

            Long newTotalQty = newInventory.getQuantity() != null ? newInventory.getQuantity() : 0L;
            Long newNewTotalQty = newTotalQty + newQuantity;
            newInventory.setQuantity(newNewTotalQty);
            productInventoryRepository.save(newInventory);
            System.out.println("Updated t_product_inventory (New): " + newInventory.getInventoryId());

            createInventoryChangeRecord(
                newInventory,
                newQuantity,
                newNewTotalQty,
                headerEntity,
                oldDetail,
                "CORRECTION_KEY_CHANGE_NEW"
            );
        } else if (!oldQuantity.equals(newQuantity)) {
            ProductInventoryEntity inventory = findOrCreateProductInventory(
                newDetailDTO.getCompanyId() != null ? newDetailDTO.getCompanyId() : 1,
                header.getProductOwnerId(),
                header.getActualSupplierId(),
                newDetailDTO.getProductId(),
                newDetailDTO.getRepositoryId(),
                newDetailDTO.getLocationId(),
                convertInputPlanDate(newDetailDTO.getDatetimeMng()),
                newDetailDTO.getNumberMng(),
                newDetailDTO.getInventoryProductType()
            );

            Long currentTotal = inventory.getQuantity() != null ? inventory.getQuantity() : 0L;
            Long quantityDelta = newQuantity - oldQuantity;
            Long newTotal = currentTotal + quantityDelta;
            inventory.setQuantity(newTotal);
            productInventoryRepository.save(inventory);
            System.out.println("Updated t_product_inventory: " + inventory.getInventoryId());

            createInventoryChangeRecord(
                inventory,
                quantityDelta,
                newTotal,
                headerEntity,
                oldDetail,
                "CORRECTION_QUANTITY_EDIT"
            );
        }
    }

    private void handleDeleteDetail(InventoryInputCorrectionDetailDTO detailDTO,
                                    InventoryInputEntity headerEntity,
                                    InventoryInputCorrectionHeaderDTO header) {
        if (detailDTO.getActualDetailId() != null) {
            InventoryActualInputDetailEntity detailEntity = inventoryActualInputDetailRepository
                .findById(detailDTO.getActualDetailId()).orElse(null);
            
            if (detailEntity != null) {
                detailEntity.setDelFlg("1");
                inventoryActualInputDetailRepository.save(detailEntity);
                System.out.println("Deleted (Soft) t_inventory_actual_input_detail: " + detailEntity.getActualDetailId());
            }
        }

        ProductInventoryEntity inventory = findOrCreateProductInventory(
            detailDTO.getCompanyId() != null ? detailDTO.getCompanyId() : 1,
            header.getProductOwnerId(),
            header.getActualSupplierId(),
            detailDTO.getProductId(),
            detailDTO.getRepositoryId(),
            detailDTO.getLocationId(),
            convertInputPlanDate(detailDTO.getDatetimeMng()),
            detailDTO.getNumberMng(),
            detailDTO.getInventoryProductType()
        );

        Long currentTotal = inventory.getQuantity() != null ? inventory.getQuantity() : 0L;
        Long deleteQuantity = detailDTO.getTotalActualQuantity() != null ? detailDTO.getTotalActualQuantity() : 0L;
        Long newTotal = currentTotal - deleteQuantity;
        inventory.setQuantity(newTotal);
        productInventoryRepository.save(inventory);
        System.out.println("Updated t_product_inventory: " + inventory.getInventoryId());

        createInventoryChangeRecord(
            inventory,
            -deleteQuantity,
            newTotal,
            headerEntity,
            null,
            "CORRECTION_DELETE"
        );
    }

    private boolean hasKeyFieldsChanged(InventoryActualInputDetailEntity oldDetail,
                                       InventoryInputCorrectionDetailDTO newDetail,
                                       InventoryInputCorrectionHeaderDTO header) {
        String oldDateMng = oldDetail.getDateTimeMng();
        String newDateMng = convertInputPlanDate(newDetail.getDatetimeMng());
        
        boolean dateChanged = (oldDateMng == null && newDateMng != null) ||
                             (oldDateMng != null && !oldDateMng.equals(newDateMng));
        
        boolean locationChanged = !Objects.equals(oldDetail.getLocationId(), newDetail.getLocationId());
        boolean inventoryTypeChanged = !Objects.equals(oldDetail.getInventoryProductType(), newDetail.getInventoryProductType());
        
        return dateChanged || locationChanged || inventoryTypeChanged;
    }

    private ProductInventoryEntity findOrCreateProductInventory(Integer companyId, Long productOwnerId,
                                                                Long supplierId, Long productId, Long repositoryId,
                                                                Long locationId, String dateTimeMng, String numberMng,
                                                                String inventoryProductType) {
        Optional<ProductInventoryEntity> existing = productInventoryRepository.findByNineKeys(
            companyId, productOwnerId, supplierId, productId, repositoryId, 
            locationId, dateTimeMng, numberMng, inventoryProductType
        );

        if (existing.isPresent()) {
            return existing.get();
        }

        ProductInventoryEntity newInventory = new ProductInventoryEntity();
        newInventory.setCompanyId(companyId);
        newInventory.setProductOwnerId(productOwnerId);
        newInventory.setSupplierId(supplierId);
        newInventory.setProductId(productId);
        newInventory.setRepositoryId(repositoryId);
        newInventory.setLocationId(locationId);
        newInventory.setDateTimeMng(dateTimeMng);
        newInventory.setNumberMng(numberMng);
        newInventory.setInventoryProductType(inventoryProductType);
        newInventory.setQuantity(0L);
        newInventory.setDelFlg("0");
        
        return productInventoryRepository.save(newInventory);
    }

    private void createInventoryChangeRecord(ProductInventoryEntity inventory, Long changeQuantity,
                                            Long currentQuantity, InventoryInputEntity headerEntity,
                                            InventoryActualInputDetailEntity detailEntity, String changeType) {
        ProductInventoryChangeEntity change = new ProductInventoryChangeEntity();
        change.setCompanyId(inventory.getCompanyId());
        change.setProductOwnerId(inventory.getProductOwnerId());
        change.setSupplierId(inventory.getSupplierId());
        change.setProductId(inventory.getProductId());
        change.setRepositoryId(inventory.getRepositoryId());
        change.setLocationId(inventory.getLocationId());
        change.setDateTimeMng(inventory.getDateTimeMng());
        change.setNumberMng(inventory.getNumberMng());
        change.setInventoryProductType(inventory.getInventoryProductType());
        change.setInventoryQuantity(currentQuantity);
        change.setChangeQuantity(changeQuantity);
        change.setChangeDate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        change.setChangeType(changeType);
        change.setHeaderId(headerEntity.getInventoryInputId());
        change.setDetailId(detailEntity != null ? detailEntity.getActualDetailId() : null);
        change.setSlipNo(headerEntity.getSlipNo());
        change.setDelFlg("0");
        
        ProductInventoryChangeEntity savedChange = productInventoryChangeRepository.save(change);
        System.out.println("Inserted t_product_inventory_change: " + savedChange.getInventoryChangeId());
    }

    @Override
    public void updateInventoryInputStatus(Long id, String isClosed) {
        try {
            InventoryInputEntity entity = inventoryInputRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Inventory Input not found with id: " + id));
            entity.setIsClosed(isClosed);
            inventoryInputRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
