package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryInputDTO;
import com.project.Zaiko.dto.InventoryInputPlanDTO;
import com.project.Zaiko.dto.PageResponse;

import com.project.Zaiko.dto.SearchInventoryInputRequest;

import java.util.List;

public interface InventoryInputService {
    PageResponse<InventoryInputDTO> getInventoryInputs(int page, int limit);
    PageResponse<InventoryInputDTO> searchInventoryInputs(SearchInventoryInputRequest request, int page, int limit);
    InventoryInputPlanDTO getInventoryInputPlanById(Long id);
}
