package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.InventoryOutputEntity;
import com.project.Zaiko.jpa.InventoryPlanOutPutDetailEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InventoryOutputPlanFlatDTO {
    private InventoryOutputEntity inventoryOutputEntity;
    private InventoryPlanOutPutDetailEntity detailEntity;
    
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
    
    private String ownerCode;
    private String ownerName;
    private String supplierCode;
    private String supplierName;
    
    private Long totalActualQuantity;

    public InventoryOutputPlanFlatDTO(
            InventoryOutputEntity inventoryOutputEntity,
            InventoryPlanOutPutDetailEntity detailEntity,
            String planDestinationCode, String planDestinationName,
            String actualDestinationCode, String actualDestinationName,
            String planCustomerCode, String planCustomerName,
            String actualCustomerCode, String actualCustomerName,
            String planRepositoryCode, String planRepositoryName,
            String actualRepositoryCode, String actualRepositoryName,
            String productCode, String productName,
            String detailRepositoryCode, String detailRepositoryName,
            String locationCode,
            String packCsUnitName, String packBlUnitName, String pieceUnitName,
            String standardInfo, String datetimeMngType, String isDatetimeMng, String isNumberMng,
            Long totalQuantityInput,
            String isPackCsInput, String isPackBlInput, String isPieceInput,
            Integer packCsAmount, Integer packBlAmount,
            String delFlg,
            String ownerCode, String ownerName,
            String supplierCode, String supplierName,
            Long totalActualQuantity
    ) {
        this.inventoryOutputEntity = inventoryOutputEntity;
        this.detailEntity = detailEntity;
        this.planDestinationCode = planDestinationCode;
        this.planDestinationName = planDestinationName;
        this.actualDestinationCode = actualDestinationCode;
        this.actualDestinationName = actualDestinationName;
        this.planCustomerCode = planCustomerCode;
        this.planCustomerName = planCustomerName;
        this.actualCustomerCode = actualCustomerCode;
        this.actualCustomerName = actualCustomerName;
        this.planRepositoryCode = planRepositoryCode;
        this.planRepositoryName = planRepositoryName;
        this.actualRepositoryCode = actualRepositoryCode;
        this.actualRepositoryName = actualRepositoryName;
        this.productCode = productCode;
        this.productName = productName;
        this.detailRepositoryCode = detailRepositoryCode;
        this.detailRepositoryName = detailRepositoryName;
        this.locationCode = locationCode;
        this.packCsUnitName = packCsUnitName;
        this.packBlUnitName = packBlUnitName;
        this.pieceUnitName = pieceUnitName;
        this.standardInfo = standardInfo;
        this.datetimeMngType = datetimeMngType;
        this.isDatetimeMng = isDatetimeMng;
        this.isNumberMng = isNumberMng;
        this.totalQuantityInput = totalQuantityInput;
        this.isPackCsInput = isPackCsInput;
        this.isPackBlInput = isPackBlInput;
        this.isPieceInput = isPieceInput;
        this.packCsAmount = packCsAmount;
        this.packBlAmount = packBlAmount;
        this.delFlg = delFlg;
        this.ownerCode = ownerCode;
        this.ownerName = ownerName;
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
        this.totalActualQuantity = totalActualQuantity;
    }
}

