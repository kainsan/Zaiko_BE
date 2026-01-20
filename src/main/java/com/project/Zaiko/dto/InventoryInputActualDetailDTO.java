package com.project.Zaiko.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryInputActualDetailDTO {
    private String datetimeMng;
    private Long actualDetailId;
    private Long inventoryInputId;
    private Integer companyId;
    private Long productId;
    private Long repositoryId;
    private Long locationId;
    private String numberMng;
    private Integer csActualQuantity;
    private Integer blActualQuantity;
    private Integer psActualQuantity;
    private Long totalActualQuantity;
    private String inventoryProductType;
    private String detailNote;
    
    private String productCode;
    private String productName;
    private String detailRepositoryCode;
    private String detailRepositoryName;
    private String locationCode;
    private String packCsUnitName;
    private String packBlUnitName;
    private String pieceUnitName;
    private String datetimeMngType;
    private String isDatetimeMng;
    private String isNumberMng;
    private String isPackCsInput;
    private String isPackBlInput;
    private String isPieceInput;
    private Long totalQuantityInput;
    private String standardInfo;
    private Integer packCsAmount;
    private Integer packBlAmount;
    private String delFlg;
}
