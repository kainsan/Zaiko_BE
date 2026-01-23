package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputCorrectionHeaderDTO {
    private Long inventoryInputId;
    private Integer companyId;
    private String inputPlanDate;
    private String createSlipType;
    private String slipNo;
    private String actualSupplierSlipNo;
    private Long actualSupplierDeliveryDestinationId;
    private String destinationCode;
    private String departmentName;
    private Long actualSupplierId;
    private String supplierCode;
    private String supplierName;
    private Long productOwnerId;
    private String customerCode;
    private String customerName;
    private Long actualRepositoryId;
    private String repositoryCode;
    private String repositoryName;
    private String actualSlipNote;
}
