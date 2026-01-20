package com.project.Zaiko.repository;

public interface InventoryInputSummary {
    // InventoryInputEntity fields
    Long getInventoryInputId();
    Long getActualRepositoryId();
    String getActualSlipNote();
    Long getActualSupplierDeliveryDestinationId();
    Long getActualSupplierId();
    String getActualSupplierSlipNo();
    Integer getCompanyId();
    String getContactStatus();
    Integer getCreateBy();
    java.util.Date getCreateDate();
    String getCreateSlipType();
    String getDelFlg();
    String getFreeItem1();
    String getFreeItem2();
    String getFreeItem3();
    String getInputActualDate();
    String getInputPlanDate();
    String getInputStatus();
    String getIsClosed();
    Long getPlanRepositoryId();
    String getPlanSlipNote();
    Long getPlanSupplierDeliveryDestinationId();
    Long getPlanSupplierId();
    String getPlanSupplierSlipNo();
    Long getProductOwnerId();
    String getSlipNo();
    Long getSumActualQuantity();
    Long getSumPlanQuantity();
    Integer getUpdateBy();
    java.util.Date getUpdateDate();

    // Joined fields
    String getSupplierCode();
    String getSupplierName();
    String getRepositoryCode();
    String getRepositoryName();
    String getDestinationCode();
    String getDepartmentName();
    String getCustomerCode();
    String getCustomerName();
}
