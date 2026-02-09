package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryOutputPlanDetailDTO {
    private Long planDetailId;
    private Long inventoryOutputId;
    private Integer companyId;
    private Long productId;
    private Long repositoryId;
    private Long locationId;
    private String datetimeMngFrom;
    private String datetimeMngTo;
    private String numberMngFrom;
    private String numberMngTo;
    private Long productOwnerId;
    private Long supplierId;
    
    private Integer csPlanQuantity;
    private Integer blPlanQuantity;
    private Integer psPlanQuantity;
    private Long totalPlanQuantity;
    
    private String inventoryProductType;
    private String detailNote;
    private BigDecimal planCsPrice;
    private BigDecimal planBlPrice;
    private BigDecimal planPiecePrice;
    private BigDecimal tax;
    private BigDecimal amountTotal;
    
    private String batchStatus;
    private String batchNo;
    private String billingPackType;
    private Integer isBatchInprogress;
    
    private String freeItem1;
    private String freeItem2;
    private String freeItem3;
    private String delFlg;
    
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
    
    private String ownerCode;
    private String ownerName;
    private String supplierCode;
    private String supplierName;
    
    private Long totalActualQuantity;
    
    private BigDecimal saleCsPrice;
    private BigDecimal saleBlPrice;
    private BigDecimal salePiecePrice;
}
