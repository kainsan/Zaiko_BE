package com.project.Zaiko.service;

import com.project.Zaiko.dto.*;

import java.util.List;

public interface InventoryInputService {
    PageResponse<InventoryInputDTO> getInventoryInputs(int page, int limit);
    PageResponse<InventoryInputDTO> searchInventoryInputs(SearchInventoryInputRequest request, int page, int limit);
    InventoryInputPlanDTO getInventoryInputPlanById(Long id);
    void updateInventoryInputPlan(Long id, InventoryInputPlanRequest request);
    void createInventoryInputPlan(InventoryInputPlanRequest request);
    void deleteInventoryInput(Long id);
    InventoryInputActualDTO getInventoryInputActualById(Long id);
    void updateInventoryInputActual(Long id, InventoryInputActualRequest request);
    void createInventoryActualPlan(InventoryInputActualRequest request);
    InventoryInputCorrectionDTO getInventoryInputCorrectionById(Long id);
    void updateInventoryInputCorrection(Long id, InventoryInputCorrectionDTO request);
}
