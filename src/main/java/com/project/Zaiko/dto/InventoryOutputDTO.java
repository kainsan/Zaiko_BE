package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryOutputDTO {
    // Header fields
    private Long inventoryOutputId;
    private Integer companyId;
    private String orderDate;
    private String slipNo;
    private String slipNote;
    private String batchStatus;
    private Long sumPlanQuantity;
    private Long sumActualQuantity;
    private String outputStatus;
    private String isClosed;
    private String checked;
    
    // Plan fields
    private String planOutputDate;
    private String planWorkingDate;
    private String planDeliverDate;
    private String planSupplierSlipNo;
    
    // Actual fields  
    private String actualOutputDate;
    private String actualDeliverDate;
    private String actualSupplierSlipNo;
    
    // Plan Delivery Destination (予定納品先)
    private Long planCustomerDeliveryDestinationId;
    private String planDestinationCode;
    private String planDestinationName;
    
    // Actual Delivery Destination (実績納品先)
    private Long actualCustomerDeliveryDestinationId;
    private String actualDestinationCode;
    private String actualDestinationName;
    
    // Plan Customer (予定出荷先)
    private Long planCustomerId;
    private String planCustomerCode;
    private String planCustomerName;
    
    // Actual Customer (実績出荷先)
    private Long actualCustomerId;
    private String actualCustomerCode;
    private String actualCustomerName;
    
    // Plan Repository (予定倉庫)
    private Long planRepositoryId;
    private String planRepositoryCode;
    private String planRepositoryName;
    
    // Actual Repository (実績倉庫)
    private Long actualRepositoryId;
    private String actualRepositoryCode;
    private String actualRepositoryName;
    
    // Supplier
    private String supplierCode;
    private String supplierName;
    
    // Owner
    private String ownerCode;
    private String ownerName;
    
    // Other fields
    private String createSlipType;

    private String routeCode;
    private String courseCode;
    private String deliverDestinationName;
    private String phoneNumber;
    private String faxNumber;
    private String postCode;

    private String newDestinationName;
}
