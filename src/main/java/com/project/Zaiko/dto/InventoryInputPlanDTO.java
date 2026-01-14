package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.InventoryInputEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputPlanDTO {
    private InventoryInputPlanHeaderDTO inventoryInputPlanHeader;

    private List<InventoryInputPlanDetailDTO> inventoryInputPlanDetails;
}
