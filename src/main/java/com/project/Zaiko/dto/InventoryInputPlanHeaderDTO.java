package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.InventoryInputEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputPlanHeaderDTO {
    private Long inventoryInputId;
    private Integer companyId;
    private String inputPlanDate;
    private String inputActualDate;
    private String createSlipType;
    private String slipNo;
    private String planSupplierSlipNo;
    private String actualSupplierSlipNo;
    private String planSlipNote;
    private String actualSlipNote;
    private Long planSupplierDeliveryDestinationId;
    private Long actualSupplierDeliveryDestinationId;
    private Long planSupplierId;
    private Long actualSupplierId;
    private Long productOwnerId;
    private Long planRepositoryId;
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
    private String planSupplierCode;
    private String planSupplierName;
    private String customerCode;
    private String customerName;
    private String repositoryCode;
    private String repositoryName;

}
