package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryOutputDTO;
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

import java.util.List;
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
}
