package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] InventoryInputEntity.
 *
 * @author: (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/05      (ThinhNT)          Create table
*/

@Entity
@Table(name = "t_inventory_actual_input_detail ")
@NamedQuery(name = "InventoryActualInputDetailEntity.findAll", query = "SELECT iide FROM InventoryActualInputDetailEntity iide ")
public class InventoryActualInputDetailEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // actualDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actual_detail_id")
    @JsonProperty("actualDetailId")
    private Long actualDetailId;

    // InventoryInputId
    @Column(name = "inventory_input_id")
    @JsonProperty("inventoryInputId")
    private Long inventoryInputId;

    // planDetailId
    @Column(name = "plan_detail_id")
    @JsonProperty("planDetailId")
    private Long planDetailId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;

    // productId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // InputActualDate
    @Column(name = "input_actual_date")
    @JsonProperty("inputActualDate")
    private String inputActualDate;

    // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // LocationId
    @Column(name = "location_id")
    @JsonProperty("locationId")
    private Long locationId;

    // DatetimeMng
    @Column(name = "datetime_mng")
    @JsonProperty("dateTimeMng")
    private String dateTimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // CsActualQuantity
    @Column(name = "cs_actual_quantity")
    @JsonProperty("csActualQuantity")
    private Integer csActualQuantity;

    // BlPlanQuantity
    @Column(name = "bl_actual_quantity")
    @JsonProperty("blActualQuantity")
    private Integer blActualQuantity;

    // PsActualQuantity
    @Column(name = "ps_Actual_quantity")
    @JsonProperty("psActualQuantity")
    private Integer psActualQuantity;

    // TotalActualQuantity
    @Column(name = "total_actual_quantity")
    @JsonProperty("totalActualQuantity")
    private Long totalActualQuantity;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

  //PackCSPrice
    @Column(name = "pack_cs_price")
    @JsonProperty("packCsPrice")
    private BigDecimal packCsPrice = new BigDecimal(0);

    //PackBLPrice
    @Column(name = "pack_bl_price")
    @JsonProperty("packBlPrice")
    private BigDecimal packBlPrice = new BigDecimal(0);

    //PiecePrice
    @Column(name = "piece_price")
    @JsonProperty("piecePrice")
    private BigDecimal piecePrice = new BigDecimal(0);

    //amountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);

    // CorrectionReason
    @Column(name = "correction_reason")
    @JsonProperty("correctionReason")
    private String correctionReason;
    
    // detailNote
    @Column(name = "detail_note")
    @JsonProperty("detailNote")
    private String detailNote;

    // FreeItem1
    @Column(name = "free_item1")
    @JsonProperty("freeItem1")
    private String freeItem1;

    // FreeItem2
    @Column(name = "free_item2")
    @JsonProperty("freeItem2")
    private String freeItem2;

    // FreeItem3
    @Column(name = "free_item3")
    @JsonProperty("freeItem3")
    private String freeItem3;

    public Long getActualDetailId() {
        return actualDetailId;
    }

    public void setActualDetailId(Long actualDetailId) {
        this.actualDetailId = actualDetailId;
    }

    public Long getInventoryInputId() {
        return inventoryInputId;
    }

    public void setInventoryInputId(Long inventoryInputId) {
        this.inventoryInputId = inventoryInputId;
    }

    public Long getPlanDetailId() {
        return planDetailId;
    }

    public void setPlanDetailId(Long planDetailId) {
        this.planDetailId = planDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getInputActualDate() {
        return inputActualDate;
    }

    public void setInputActualDate(String inputActualDate) {
        this.inputActualDate = inputActualDate;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getDateTimeMng() {
        return dateTimeMng;
    }

    public void setDateTimeMng(String dateTimeMng) {
        this.dateTimeMng = dateTimeMng;
    }

    public String getNumberMng() {
        return numberMng;
    }

    public void setNumberMng(String numberMng) {
        this.numberMng = numberMng;
    }

    public Integer getCsActualQuantity() {
        return csActualQuantity;
    }

    public void setCsActualQuantity(Integer csActualQuantity) {
        this.csActualQuantity = csActualQuantity;
    }

    public Integer getBlActualQuantity() {
        return blActualQuantity;
    }

    public void setBlActualQuantity(Integer blActualQuantity) {
        this.blActualQuantity = blActualQuantity;
    }

    public Integer getPsActualQuantity() {
        return psActualQuantity;
    }

    public void setPsActualQuantity(Integer psActualQuantity) {
        this.psActualQuantity = psActualQuantity;
    }

    public Long getTotalActualQuantity() {
        return totalActualQuantity;
    }

    public void setTotalActualQuantity(Long totalActualQuantity) {
        this.totalActualQuantity = totalActualQuantity;
    }

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
    }

    public BigDecimal getPackCsPrice() {
        return packCsPrice;
    }

    public void setPackCsPrice(BigDecimal packCsPrice) {
        this.packCsPrice = packCsPrice;
    }

    public BigDecimal getPackBlPrice() {
        return packBlPrice;
    }

    public void setPackBlPrice(BigDecimal packBlPrice) {
        this.packBlPrice = packBlPrice;
    }

    public BigDecimal getPiecePrice() {
        return piecePrice;
    }

    public void setPiecePrice(BigDecimal piecePrice) {
        this.piecePrice = piecePrice;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getCorrectionReason() {
        return correctionReason;
    }

    public void setCorrectionReason(String correctionReason) {
        this.correctionReason = correctionReason;
    }

    public String getDetailNote() {
        return detailNote;
    }

    public void setDetailNote(String detailNote) {
        this.detailNote = detailNote;
    }

    public String getFreeItem1() {
        return freeItem1;
    }

    public void setFreeItem1(String freeItem1) {
        this.freeItem1 = freeItem1;
    }

    public String getFreeItem2() {
        return freeItem2;
    }

    public void setFreeItem2(String freeItem2) {
        this.freeItem2 = freeItem2;
    }

    public String getFreeItem3() {
        return freeItem3;
    }

    public void setFreeItem3(String freeItem3) {
        this.freeItem3 = freeItem3;
    }
    
}

