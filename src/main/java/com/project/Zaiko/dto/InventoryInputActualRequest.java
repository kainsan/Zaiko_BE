package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputActualRequest {
    private InventoryInputActualHeaderDTO header;
    private List<InventoryInputActualDetailDTO> details;
}
