package com.project.Zaiko.repository;

public interface InventoryOutputSummary {
    Long getInventoryOutputId();
    Integer getCompanyId();
    String getOrderDate();
    String getSlipNo();
    String getSlipNote();
    String getBatchStatus();
    Long getSumPlanQuantity();
    Long getSumActualQuantity();
    String getOutputStatus();
    String getIsClosed();
    String getChecked();
    
    // Plan dates
    String getPlanOutputDate();
    String getPlanWorkingDate();
    String getPlanDeliverDate();
    String getPlanSupplierSlipNo();
    
    // Actual dates
    String getActualOutputDate();
    String getActualDeliverDate();
    String getActualSupplierSlipNo();
    
    // Plan Delivery Destination
    Long getPlanCustomerDeliveryDestinationId();
    String getPlanDestinationCode();
    String getPlanDestinationName();
    
    // Actual Delivery Destination
    Long getActualCustomerDeliveryDestinationId();
    String getActualDestinationCode();
    String getActualDestinationName();
    
    // Plan Customer
    Long getPlanCustomerId();
    String getPlanCustomerCode();
    String getPlanCustomerName();
    
    // Actual Customer
    Long getActualCustomerId();
    String getActualCustomerCode();
    String getActualCustomerName();
    
    // Plan Repository
    Long getPlanRepositoryId();
    String getPlanRepositoryCode();
    String getPlanRepositoryName();
    
    // Actual Repository
    Long getActualRepositoryId();
    String getActualRepositoryCode();
    String getActualRepositoryName();
    
    // Supplier
    String getSupplierCode();
    String getSupplierName();
    
    // Owner
    String getOwnerCode();
    String getOwnerName();
    
    // Others
    String getCreateSlipType();
    String getFreeItem1();
    String getFreeItem2();
    String getFreeItem3();
    String getRouteCode();
    String getCourseCode();
    String getDeliverDestinationName();
    String getPhoneNumber();
    String getFaxNumber();
    String getPostCode();
    String getAddress1();
    String getAddress2();
    String getAddress3();
    String getAddress4();
    String getNewDestinationName();
}
