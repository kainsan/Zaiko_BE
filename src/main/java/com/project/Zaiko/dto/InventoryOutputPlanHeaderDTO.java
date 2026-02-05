package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryOutputPlanHeaderDTO {
    private Long inventoryOutputId;
    private Integer companyId;
    private String orderDate;
    private String planOutputDate;
    private String planWorkingDate;
    private String planDeliverDate;
    private String actualOutputDate;
    private String actualDeliverDate;
    private String createSlipType;
    private String slipNo;
    private String planSupplierSlipNo;
    private String actualSupplierSlipNo;
    private String slipNote;
    
    private Long planCustomerDeliveryDestinationId;
    private Long actualCustomerDeliveryDestinationId;
    private Long planCustomerId;
    private Long actualCustomerId;
    private Long planRepositoryId;
    private Long actualRepositoryId;
    
    private String batchStatus;
    private Long sumPlanQuantity;
    private Long sumActualQuantity;
    private String outputStatus;
    private String isClosed;

    private String routeCode;
    private String courseCode;
    private String deliverDestinationName;
    private String phoneNumber;
    private String faxNumber;
    private String postCode;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String newDestinationName;
    private String checked;
    
    private String planDestinationCode;
    private String planDestinationName;
    private String actualDestinationCode;
    private String actualDestinationName;
    private String planCustomerCode;
    private String planCustomerName;
    private String actualCustomerCode;
    private String actualCustomerName;
    private String planRepositoryCode;
    private String planRepositoryName;
    private String actualRepositoryCode;
    private String actualRepositoryName;
}
