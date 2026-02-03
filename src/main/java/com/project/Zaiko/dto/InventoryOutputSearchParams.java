package com.project.Zaiko.dto;

import lombok.Data;

@Data
public class InventoryOutputSearchParams {
    private String orderDateFrom;
    private String orderDateTo;

    private String planOutputDateFrom;
    private String planOutputDateTo;

    private String planOutputWorkingDateFrom;
    private String planOutputWorkingDateTo;

    private String planOutputDeliveryDateFrom;
    private String planOutputDeliveryDateTo;

    private String supplierSlipNoFrom;
    private String supplierSlipNoTo;

    private String slipNoFrom;
    private String slipNoTo;

    private String customerIdFrom;
    private String customerIdTo;
    private String customerName;

    private String deliveryDestinationIdFrom;
    private String deliveryDestinationIdTo;
    private String deliveryDestinationName;

    private String supplierIdFrom;
    private String supplierIdTo;
    private String supplierName;

    private String ownerIdFrom;
    private String ownerIdTo;
    private String ownerName;

    private String productIdFrom;
    private String productIdTo;
    private String productName;

    private String planRepositoryIdFrom;
    private String planRepositoryIdTo;

    private Long batchNumber = 0L;
    private String deliveryType = "ALL";
    private String deliveryStatus = "ALL";
    private String isClosed = "ALL";

    private String actualOutputDateFrom;
    private String actualOutputDateTo;

    private String actualDeliveryDateFrom;
    private String actualDeliveryDateTo;
}
