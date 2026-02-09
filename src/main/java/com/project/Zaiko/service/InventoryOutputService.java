package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryOutputDTO;
import com.project.Zaiko.dto.InventoryOutputPlanDTO;
import com.project.Zaiko.dto.InventoryOutputPlanDetailDTO;
import com.project.Zaiko.dto.InventoryOutputPlanFlatDTO;
import com.project.Zaiko.dto.InventoryOutputPlanHeaderDTO;
import com.project.Zaiko.dto.InventoryOutputSearchParams;
import com.project.Zaiko.dto.PageResponse;
import com.project.Zaiko.repository.InventoryOutputRepository;
import com.project.Zaiko.repository.InventoryOutputSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional
public class InventoryOutputService implements IInventoryOutputService {

    @Autowired
    private InventoryOutputRepository inventoryOutputRepository;

    @Override
    public PageResponse<InventoryOutputDTO> searchInventoryOutputs(InventoryOutputSearchParams request, Pageable pageable) {
        String orderDateFrom = formatDate(request.getOrderDateFrom());
        String orderDateTo = formatDate(request.getOrderDateTo());
        String planOutputDateFrom = formatDate(request.getPlanOutputDateFrom());
        String planOutputDateTo = formatDate(request.getPlanOutputDateTo());
        String planOutputWorkingDateFrom = formatDate(request.getPlanOutputWorkingDateFrom());
        String planOutputWorkingDateTo = formatDate(request.getPlanOutputWorkingDateTo());
        String planOutputDeliveryDateFrom = formatDate(request.getPlanOutputDeliveryDateFrom());
        String planOutputDeliveryDateTo = formatDate(request.getPlanOutputDeliveryDateTo());
        String actualOutputDateFrom = formatDate(request.getActualOutputDateFrom());
        String actualOutputDateTo = formatDate(request.getActualOutputDateTo());
        String actualDeliveryDateFrom = formatDate(request.getActualDeliveryDateFrom());
        String actualDeliveryDateTo = formatDate(request.getActualDeliveryDateTo());

        Long batchNumber = request.getBatchNumber() != null ? request.getBatchNumber() : 0L;
        String deliveryType = hasValue(request.getDeliveryType()) ? request.getDeliveryType() : "ALL";
        String deliveryStatus = hasValue(request.getDeliveryStatus()) ? request.getDeliveryStatus() : "ALL";
        String isClosed = hasValue(request.getIsClosed()) ? request.getIsClosed() : "ALL";

        Page<InventoryOutputSummary> resultPage = inventoryOutputRepository.searchInventoryOutputs(
            orderDateFrom,
            orderDateTo,
            planOutputDateFrom,
            planOutputDateTo,
            planOutputWorkingDateFrom,
            planOutputWorkingDateTo,
            planOutputDeliveryDateFrom,
            planOutputDeliveryDateTo,
            request.getSupplierSlipNoFrom(),
            request.getSupplierSlipNoTo(),
            request.getSlipNoFrom(),
            request.getSlipNoTo(),
            request.getCustomerIdFrom(),
            request.getCustomerIdTo(),
            request.getCustomerName(),
            request.getDeliveryDestinationIdFrom(),
            request.getDeliveryDestinationIdTo(),
            request.getDeliveryDestinationName(),
            request.getSupplierIdFrom(),
            request.getSupplierIdTo(),
            request.getSupplierName(),
            request.getOwnerIdFrom(),
            request.getOwnerIdTo(),
            request.getOwnerName(),
            request.getProductIdFrom(),
            request.getProductIdTo(),
            request.getProductName(),
            request.getPlanRepositoryIdFrom(),
            request.getPlanRepositoryIdTo(),
            batchNumber,
            deliveryType,
            deliveryStatus,
            isClosed,
            actualOutputDateFrom,
            actualOutputDateTo,
            actualDeliveryDateFrom,
            actualDeliveryDateTo,
            pageable
        );

        List<InventoryOutputDTO> dtoList = resultPage.getContent().stream()
            .map(this::mapToDTO)
            .collect(Collectors.toList());

        Page<InventoryOutputDTO> dtoPage = new PageImpl<>(dtoList, pageable, resultPage.getTotalElements());
        return mapToPageResponse(dtoPage);
    }

    private InventoryOutputDTO mapToDTO(InventoryOutputSummary s) {
        InventoryOutputDTO dto = new InventoryOutputDTO();
        
        dto.setInventoryOutputId(s.getInventoryOutputId());
        dto.setCompanyId(s.getCompanyId());
        dto.setOrderDate(s.getOrderDate());
        dto.setSlipNo(s.getSlipNo());
        dto.setSlipNote(s.getSlipNote());
        dto.setBatchStatus(s.getBatchStatus());
        dto.setSumPlanQuantity(s.getSumPlanQuantity());
        dto.setSumActualQuantity(s.getSumActualQuantity());
        dto.setOutputStatus(s.getOutputStatus());
        dto.setIsClosed(s.getIsClosed());
        dto.setChecked(s.getChecked());
        
        dto.setPlanOutputDate(s.getPlanOutputDate());
        dto.setPlanWorkingDate(s.getPlanWorkingDate());
        dto.setPlanDeliverDate(s.getPlanDeliverDate());
        dto.setPlanSupplierSlipNo(s.getPlanSupplierSlipNo());
        
        dto.setActualOutputDate(s.getActualOutputDate());
        dto.setActualDeliverDate(s.getActualDeliverDate());
        dto.setActualSupplierSlipNo(s.getActualSupplierSlipNo());
        
        dto.setPlanCustomerDeliveryDestinationId(s.getPlanCustomerDeliveryDestinationId());
        dto.setPlanDestinationCode(s.getPlanDestinationCode());
        dto.setPlanDestinationName(s.getPlanDestinationName());
        
        dto.setActualCustomerDeliveryDestinationId(s.getActualCustomerDeliveryDestinationId());
        dto.setActualDestinationCode(s.getActualDestinationCode());
        dto.setActualDestinationName(s.getActualDestinationName());
        
        dto.setPlanCustomerId(s.getPlanCustomerId());
        dto.setPlanCustomerCode(s.getPlanCustomerCode());
        dto.setPlanCustomerName(s.getPlanCustomerName());
        
        dto.setActualCustomerId(s.getActualCustomerId());
        dto.setActualCustomerCode(s.getActualCustomerCode());
        dto.setActualCustomerName(s.getActualCustomerName());
        
        dto.setPlanRepositoryId(s.getPlanRepositoryId());
        dto.setPlanRepositoryCode(s.getPlanRepositoryCode());
        dto.setPlanRepositoryName(s.getPlanRepositoryName());
        
        dto.setActualRepositoryId(s.getActualRepositoryId());
        dto.setActualRepositoryCode(s.getActualRepositoryCode());
        dto.setActualRepositoryName(s.getActualRepositoryName());
        
        dto.setSupplierCode(s.getSupplierCode());
        dto.setSupplierName(s.getSupplierName());
        
        dto.setOwnerCode(s.getOwnerCode());
        dto.setOwnerName(s.getOwnerName());
        
        dto.setCreateSlipType(s.getCreateSlipType());

        dto.setRouteCode(s.getRouteCode());
        dto.setCourseCode(s.getCourseCode());
        dto.setDeliverDestinationName(s.getDeliverDestinationName());
        dto.setPhoneNumber(s.getPhoneNumber());
        dto.setFaxNumber(s.getFaxNumber());
        dto.setPostCode(s.getPostCode());

        dto.setNewDestinationName(s.getNewDestinationName());
        
        return dto;
    }

    private String formatDate(String date) {
        if (date != null && !date.isEmpty()) {
            return date.replace("-", "/");
        }
        return null;
    }

    private boolean hasValue(String value) {
        return value != null && !value.isEmpty();
    }

    private PageResponse<InventoryOutputDTO> mapToPageResponse(Page<InventoryOutputDTO> resultPage) {
        PageResponse<InventoryOutputDTO> response = new PageResponse<>();
        response.setContent(resultPage.getContent());
        response.setPageNumber(resultPage.getNumber());
        response.setPageSize(resultPage.getSize());
        response.setTotalElements(resultPage.getTotalElements());
        response.setTotalPages(resultPage.getTotalPages());
        response.setLast(resultPage.isLast());
        return response;
    }

    @Override
    public InventoryOutputPlanDTO getInventoryOutputPlanById(Long id) {
        try {
            List<InventoryOutputPlanFlatDTO> flatList = inventoryOutputRepository.getInventoryOutputPlanById(id);
            if (flatList.isEmpty()) {
                return null;
            }

            // Batch query for totalActualQuantity - much faster than N+1 subqueries
            Map<Long, Long> actualQuantityMap = new HashMap<>();
            List<Object[]> actualQuantities = inventoryOutputRepository.getTotalActualQuantitiesByInventoryOutputId(id);
            for (Object[] row : actualQuantities) {
                Long planDetailId = row[0] != null ? ((Number) row[0]).longValue() : null;
                Long totalActualQty = row[1] != null ? ((Number) row[1]).longValue() : 0L;
                if (planDetailId != null) {
                    actualQuantityMap.put(planDetailId, totalActualQty);
                }
            }

            InventoryOutputPlanFlatDTO first = flatList.get(0);
            InventoryOutputPlanDTO result = new InventoryOutputPlanDTO();

            InventoryOutputPlanHeaderDTO headerDTO = new InventoryOutputPlanHeaderDTO();
            headerDTO.setInventoryOutputId(first.getInventoryOutputEntity().getInventoryOutputId());
            headerDTO.setCompanyId(first.getInventoryOutputEntity().getCompanyId());
            headerDTO.setOrderDate(first.getInventoryOutputEntity().getOrderDate());
            headerDTO.setPlanOutputDate(first.getInventoryOutputEntity().getPlanOutputDate());
            headerDTO.setPlanWorkingDate(first.getInventoryOutputEntity().getPlanWorkingDate());
            headerDTO.setPlanDeliverDate(first.getInventoryOutputEntity().getPlanDeliverDate());
            headerDTO.setActualOutputDate(first.getInventoryOutputEntity().getActualOutputDate());
            headerDTO.setActualDeliverDate(first.getInventoryOutputEntity().getActualDeliverDate());
            headerDTO.setCreateSlipType(first.getInventoryOutputEntity().getCreateSlipType());
            headerDTO.setSlipNo(first.getInventoryOutputEntity().getSlipNo());
            headerDTO.setPlanSupplierSlipNo(first.getInventoryOutputEntity().getPlanSupplierSlipNo());
            headerDTO.setActualSupplierSlipNo(first.getInventoryOutputEntity().getActualSupplierSlipNo());
            headerDTO.setSlipNote(first.getInventoryOutputEntity().getSlipNote());
            headerDTO.setPlanCustomerDeliveryDestinationId(first.getInventoryOutputEntity().getPlanCustomerDeliveryDestinationId());
            headerDTO.setActualCustomerDeliveryDestinationId(first.getInventoryOutputEntity().getActualCustomerDeliveryDestinationId());
            headerDTO.setPlanCustomerId(first.getInventoryOutputEntity().getPlanCustomerId());
            headerDTO.setActualCustomerId(first.getInventoryOutputEntity().getActualCustomerId());
            headerDTO.setPlanRepositoryId(first.getInventoryOutputEntity().getPlanRepositoryId());
            headerDTO.setActualRepositoryId(first.getInventoryOutputEntity().getActualRepositoryId());
            headerDTO.setBatchStatus(first.getInventoryOutputEntity().getBatchStatus());
            headerDTO.setSumPlanQuantity(first.getInventoryOutputEntity().getSumPlanQuantity());
            headerDTO.setSumActualQuantity(first.getInventoryOutputEntity().getSumActualQuantity());
            headerDTO.setOutputStatus(first.getInventoryOutputEntity().getOutputStatus());
            headerDTO.setIsClosed(first.getInventoryOutputEntity().getIsClosed());
            headerDTO.setRouteCode(first.getInventoryOutputEntity().getRouteCode());
            headerDTO.setCourseCode(first.getInventoryOutputEntity().getCourseCode());
            headerDTO.setDeliverDestinationName(first.getInventoryOutputEntity().getDeliverDestinationName());
            headerDTO.setPhoneNumber(first.getInventoryOutputEntity().getPhoneNumber());
            headerDTO.setFaxNumber(first.getInventoryOutputEntity().getFaxNumber());
            headerDTO.setPostCode(first.getInventoryOutputEntity().getPostCode());
            headerDTO.setAddress1(first.getInventoryOutputEntity().getAddress1());
            headerDTO.setAddress2(first.getInventoryOutputEntity().getAddress2());
            headerDTO.setAddress3(first.getInventoryOutputEntity().getAddress3());
            headerDTO.setAddress4(first.getInventoryOutputEntity().getAddress4());
            headerDTO.setNewDestinationName(first.getInventoryOutputEntity().getNewDestinationName());
            headerDTO.setChecked(first.getInventoryOutputEntity().getChecked());
            headerDTO.setPlanDestinationCode(first.getPlanDestinationCode());
            headerDTO.setPlanDestinationName(first.getPlanDestinationName());
            headerDTO.setActualDestinationCode(first.getActualDestinationCode());
            headerDTO.setActualDestinationName(first.getActualDestinationName());
            headerDTO.setPlanCustomerCode(first.getPlanCustomerCode());
            headerDTO.setPlanCustomerName(first.getPlanCustomerName());
            headerDTO.setActualCustomerCode(first.getActualCustomerCode());
            headerDTO.setActualCustomerName(first.getActualCustomerName());
            headerDTO.setPlanRepositoryCode(first.getPlanRepositoryCode());
            headerDTO.setPlanRepositoryName(first.getPlanRepositoryName());
            headerDTO.setActualRepositoryCode(first.getActualRepositoryCode());
            headerDTO.setActualRepositoryName(first.getActualRepositoryName());

            result.setInventoryOutputPlanHeader(headerDTO);

            List<InventoryOutputPlanDetailDTO> details = flatList.stream()
                    .filter(flat -> flat.getDetailEntity() != null)
                    .map(flat -> {
                        InventoryOutputPlanDetailDTO detail = new InventoryOutputPlanDetailDTO();
                        Long planDetailId = flat.getDetailEntity().getPlanDetailId();
                        detail.setPlanDetailId(planDetailId);
                        detail.setInventoryOutputId(flat.getDetailEntity().getInventoryOutputId());
                        detail.setCompanyId(flat.getDetailEntity().getCompanyId());
                        detail.setProductId(flat.getDetailEntity().getProductId());
                        detail.setRepositoryId(flat.getDetailEntity().getRepositoryId());
                        detail.setLocationId(flat.getDetailEntity().getLocationId());
                        detail.setDatetimeMngFrom(flat.getDetailEntity().getDatetimeMngFrom());
                        detail.setDatetimeMngTo(flat.getDetailEntity().getDatetimeMngTo());
                        detail.setNumberMngFrom(flat.getDetailEntity().getNumberMngFrom());
                        detail.setNumberMngTo(flat.getDetailEntity().getNumberMngTo());
                        detail.setProductOwnerId(flat.getDetailEntity().getProductOwnerId());
                        detail.setSupplierId(flat.getDetailEntity().getSupplierId());
                        detail.setCsPlanQuantity(flat.getDetailEntity().getCsPlanQuantity());
                        detail.setBlPlanQuantity(flat.getDetailEntity().getBlPlanQuantity());
                        detail.setPsPlanQuantity(flat.getDetailEntity().getPsPlanQuantity());
                        detail.setTotalPlanQuantity(flat.getDetailEntity().getTotalPlanQuantity());
                        detail.setInventoryProductType(flat.getDetailEntity().getInventoryProductType());
                        detail.setDetailNote(flat.getDetailEntity().getDetailNote());
                        detail.setPlanCsPrice(flat.getDetailEntity().getPlanCsPrice());
                        detail.setPlanBlPrice(flat.getDetailEntity().getPlanBlPrice());
                        detail.setPlanPiecePrice(flat.getDetailEntity().getPlanPiecePrice());
                        detail.setTax(flat.getDetailEntity().getTax());
                        detail.setAmountTotal(flat.getDetailEntity().getAmountTotal());
                        detail.setBatchStatus(flat.getDetailEntity().getBatchStatus());
                        detail.setBatchNo(flat.getDetailEntity().getBatchNo());
                        detail.setBillingPackType(flat.getDetailEntity().getBillingPackType());
                        detail.setIsBatchInprogress(flat.getDetailEntity().getIsBatchInprogress());
                        detail.setFreeItem1(flat.getDetailEntity().getFreeItem1());
                        detail.setFreeItem2(flat.getDetailEntity().getFreeItem2());
                        detail.setFreeItem3(flat.getDetailEntity().getFreeItem3());
                        detail.setDelFlg(flat.getDelFlg());
                        detail.setProductCode(flat.getProductCode());
                        detail.setProductName(flat.getProductName());
                        detail.setDetailRepositoryCode(flat.getDetailRepositoryCode());
                        detail.setDetailRepositoryName(flat.getDetailRepositoryName());
                        detail.setLocationCode(flat.getLocationCode());
                        detail.setPackCsUnitName(flat.getPackCsUnitName());
                        detail.setPackBlUnitName(flat.getPackBlUnitName());
                        detail.setPieceUnitName(flat.getPieceUnitName());
                        detail.setStandardInfo(flat.getStandardInfo());
                        detail.setDatetimeMngType(flat.getDatetimeMngType());
                        detail.setIsDatetimeMng(flat.getIsDatetimeMng());
                        detail.setIsNumberMng(flat.getIsNumberMng());
                        detail.setTotalQuantityInput(flat.getTotalQuantityInput());
                        detail.setIsPackCsInput(flat.getIsPackCsInput());
                        detail.setIsPackBlInput(flat.getIsPackBlInput());
                        detail.setIsPieceInput(flat.getIsPieceInput());
                        detail.setPackCsAmount(flat.getPackCsAmount());
                        detail.setPackBlAmount(flat.getPackBlAmount());
                        detail.setOwnerCode(flat.getOwnerCode());
                        detail.setOwnerName(flat.getOwnerName());
                        detail.setSupplierCode(flat.getSupplierCode());
                        detail.setSupplierName(flat.getSupplierName());
                        // Get totalActualQuantity from batch query result
                        detail.setTotalActualQuantity(actualQuantityMap.getOrDefault(planDetailId, 0L));
                        detail.setSaleCsPrice(flat.getSaleCsPrice());
                        detail.setSaleBlPrice(flat.getSaleBlPrice());
                        detail.setSalePiecePrice(flat.getSalePiecePrice());
                        return detail;
                    })
                    .collect(Collectors.toList());

            result.setInventoryOutputPlanDetails(details);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
