package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDeliveryDestDTO {
    private Long supplierDeliveryDestinationId;
    private String supplierDeliveryDestinationCode;
    private String supplierDeliveryDepartName;
    private Long supplierId;
    private String supplierName;
    private String destinationCode;
}
