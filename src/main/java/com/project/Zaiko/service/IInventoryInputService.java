package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryInputDTO;
import com.project.Zaiko.dto.PageResponse;
import com.project.Zaiko.repository.InventoryInputRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class IInventoryInputService implements InventoryInputService {

    @Autowired
    private InventoryInputRepository inventoryInputRepository;

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

        Page<InventoryInputDTO> resultPage = inventoryInputRepository.searchInventoryInputs(
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

        return mapToPageResponse(resultPage);
    }

    @Override
    public List<Object> getInventoryInputPlanById(Long id) {
        return inventoryInputRepository.getInventoryInputById(id);
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
}
