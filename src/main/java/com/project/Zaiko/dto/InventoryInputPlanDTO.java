package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputPlanDTO {
    private InventoryInputEntity inventoryInputEntity;
    private String destinationCode;
    private String departmentName;
    private String supplierCode;
    private String supplierName;
    private String customerCode;
    private String customerName;
    private String repositoryCode;
    private String repositoryName;

    private InventoryPlanInputDetailEntity detailEntity;
    private String productCode;
    private String productName;
    private String detailRepositoryCode;
    private String locationCode;
    private String packCsUnitName;
    private String packBlUnitName;
    private String pieceUnitName;
}
