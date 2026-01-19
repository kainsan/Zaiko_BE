package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputPlanRequest {
    private InventoryInputPlanHeaderDTO header;
    private List<InventoryInputPlanDetailDTO> details;
}
