package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryInputDTO;
import com.project.Zaiko.dto.InventoryInputPlanDTO;
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
    public InventoryInputPlanDTO getInventoryInputPlanById(Long id) {
        List<com.project.Zaiko.dto.InventoryInputPlanFlatDTO> flatList = inventoryInputRepository.getInventoryInputById(id);
        if (flatList.isEmpty()) {
            return null;
        }

        // Take the first element for header information
        com.project.Zaiko.dto.InventoryInputPlanFlatDTO first = flatList.get(0);

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
                        flat.getTotalActualQuantity()
                ))
                .collect(java.util.stream.Collectors.toList());

        result.setInventoryInputPlanDetails(details);

        return result;
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
