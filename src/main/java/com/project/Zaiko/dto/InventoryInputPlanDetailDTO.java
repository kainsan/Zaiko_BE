package com.project.Zaiko.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputPlanDetailDTO {
    private Long planDetailId;
    private Long inventoryInputId;
    private Integer companyId;
    private Long productId;
    private Long repositoryId;
    private Long locationId;
    private String datetimeMng;
    private String numberMng;
    private Integer csPlanQuantity;
    private Integer blPlanQuantity;
    private Integer psPlanQuantity;
    private Long totalPlanQuantity;
    private String inventoryProductType;
    private String detailNote;
    private String freeItem1;
    private String freeItem2;
    private String freeItem3;

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
    private Long totalActualQuantity;
}
