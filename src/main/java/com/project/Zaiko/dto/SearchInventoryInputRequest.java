package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchInventoryInputRequest {
    private String actualRepositoryId;
    private String customerCodeFrom;
    private String customerCodeTo;
    private String customerName;
    private String customerSlipNumberFrom;
    private String customerSlipNumberTo;
    private String deliveryCodeFrom;
    private String deliveryCodeTo;
    private String deliveryName;
    private LocalDate inputActualDateFrom;
    private LocalDate inputActualDateTo;
    private LocalDate inputPlanDateFrom;
    private LocalDate inputPlanDateTo;
    private String isClosed = "ALL";
    private String planRepositoryId;
    private String productCodeFrom;
    private String productCodeTo;
    private String productName;
    private String receiptStatus = "ALL";
    private String receiptType = "ALL";
    private String slipNoFrom;
    private String slipNoTo;
    private String supplierCodeFrom;
    private String supplierCodeTo;
    private String supplierName;
}
