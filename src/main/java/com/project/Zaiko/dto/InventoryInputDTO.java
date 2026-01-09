package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputDTO {
    private InventoryInputEntity inventoryInputEntity;
    private String supplierCode;
    private String supplierName;

    private String repositoryCode;
    private String repositoryName;

    private String destinationCode;
    private String destinationName;

    private String customerCode;
    private String customerName;
}
