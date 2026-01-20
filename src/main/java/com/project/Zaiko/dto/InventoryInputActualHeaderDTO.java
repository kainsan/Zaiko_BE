package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputActualHeaderDTO {
    private Long inventoryInputId;
    private Integer companyId;
    private String inputActualDate;
    private String createSlipType;
    private String slipNo;
    private String actualSupplierSlipNo;
    private String actualSlipNote;
    private Long actualSupplierDeliveryDestinationId;
    private Long actualSupplierId;
    private Long productOwnerId;
    private Long actualRepositoryId;
    private String inputStatus;
    private Long sumPlanQuantity;
    private Long sumActualQuantity;
    private String isClosed;
    private String freeItem1;
    private String freeItem2;
    private String freeItem3;
    private String contactStatus;
    
    private String destinationCode;
    private String departmentName;
    private String supplierCode;
    private String supplierName;
    private String customerCode;
    private String customerName;
    private String repositoryCode;
    private String repositoryName;
}
