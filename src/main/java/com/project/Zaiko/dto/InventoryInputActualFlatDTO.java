package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputActualFlatDTO {
    private InventoryInputEntity inventoryInputEntity;
    private String destinationCode;
    private String departmentName;
    private String supplierCode;
    private String supplierName;
    private String customerCode;
    private String customerName;
    private String repositoryCode;
    private String repositoryName;

    private InventoryActualInputDetailEntity detailEntity;
    private String productCode;
    private String productName;
    private String detailRepositoryCode;
    private String detailRepositoryName;
    private String locationCode;
    private String packCsUnitName;
    private String packBlUnitName;
    private String pieceUnitName;
    private String standardInfo;
    private String datetimeMngType;
    private String isDatetimeMng;
    private String isNumberMng;
    private Long totalQuantityInput;
    private String isPackCsInput;
    private String isPackBlInput;
    private String isPieceInput;
    private Integer packCsAmount;
    private Integer packBlAmount;
    private String delFlg;
}
