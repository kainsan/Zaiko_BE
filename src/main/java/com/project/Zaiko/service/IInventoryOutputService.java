package com.project.Zaiko.service;

import com.project.Zaiko.dto.InventoryOutputDTO;
import com.project.Zaiko.dto.InventoryOutputPlanDTO;
import com.project.Zaiko.dto.InventoryOutputSearchParams;
import com.project.Zaiko.dto.PageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IInventoryOutputService {
        PageResponse<InventoryOutputDTO> searchInventoryOutputs(InventoryOutputSearchParams searchParams, Pageable pageable);
        
        InventoryOutputPlanDTO getInventoryOutputPlanById(Long id);
}
