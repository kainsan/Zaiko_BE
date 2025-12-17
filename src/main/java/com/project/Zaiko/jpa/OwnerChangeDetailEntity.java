package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] OwnerChangeDetailEntity.
 *
 * @author:  (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/23      (ThinhNT)       Create new
*/
@SuppressWarnings("unused")
@Entity
@Table(name = "t_owner_change_detail")
@NamedQuery(name = "OwnerChangeDetailEntity.findAll", query = "SELECT ocd FROM OwnerChangeDetailEntity ocd")
public class OwnerChangeDetailEntity  extends CommonEntity implements Serializable  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // OwnerChangeDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_change_detail_id")
    @JsonProperty("ownerChangeDetailId")
    private Long ownerChangeDetailId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // OwnerChangeId
    @Column(name = "owner_change_id")
    @JsonProperty("ownerChangeId")
    private Long ownerChangeId;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;

    // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // LocationId
    @Column(name = "location_id")
    @JsonProperty("locationId")
    private Long locationId;

    // DatetimeMng
    @Column(name = "dateTime_mng")
    @JsonProperty("dateTimeMng")
    private String dateTimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // CsQuantity
    @Column(name = "cs_quantity")
    @JsonProperty("csQuantity")
    private Integer csQuantity;

    // BlQuantity
    @Column(name = "bl_quantity")
    @JsonProperty("blQuantity")
    private Integer blQuantity;

    // PsQuantity
    @Column(name = "ps_quantity")
    @JsonProperty("psQuantity")
    private Integer psQuantity;

    // Quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Long quantity;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // DeliverySlipPrintStatus
    @Column(name = "delivery_slip_print_status")
    @JsonProperty("deliverySlipPrintStatus")
    private String deliverySlipPrintStatus;

    // CsPrice
    @Column(name = "cs_price")
    @JsonProperty("csPrice")
    private BigDecimal csPrice = new BigDecimal(0);

    // BlPrice
    @Column(name = "bl_price")
    @JsonProperty("blPrice")
    private BigDecimal blPrice = new BigDecimal(0);

    // PiecePrice
    @Column(name = "piece_price")
    @JsonProperty("piecePrice")
    private BigDecimal piecePrice = new BigDecimal(0);

    // AmountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);

    // Tax
    @Column(name = "tax")
    @JsonProperty("tax")
    private BigDecimal tax = new BigDecimal(0);

    // Tax
    @Column(name = "correction_reason")
    @JsonProperty("correctionReason")
    private String correctionReason;

    // BillingPackType
    @Column(name = "billing_pack_type")
    @JsonProperty("billingPackType")
    private String billingPackType;

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

    public Long getOwnerChangeDetailId() {
        return ownerChangeDetailId;
    }

    public void setOwnerChangeDetailId(Long ownerChangeDetailId) {
        this.ownerChangeDetailId = ownerChangeDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getOwnerChangeId() {
        return ownerChangeId;
    }

    public void setOwnerChangeId(Long ownerChangeId) {
        this.ownerChangeId = ownerChangeId;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCsQuantity() {
        return csQuantity;
    }

    public void setCsQuantity(Integer csQuantity) {
        this.csQuantity = csQuantity;
    }

    public Integer getBlQuantity() {
        return blQuantity;
    }

    public void setBlQuantity(Integer blQuantity) {
        this.blQuantity = blQuantity;
    }

    public Integer getPsQuantity() {
        return psQuantity;
    }

    public void setPsQuantity(Integer psQuantity) {
        this.psQuantity = psQuantity;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
    }

    public String getDeliverySlipPrintStatus() {
        return deliverySlipPrintStatus;
    }

    public void setDeliverySlipPrintStatus(String deliverySlipPrintStatus) {
        this.deliverySlipPrintStatus = deliverySlipPrintStatus;
    }

    public BigDecimal getCsPrice() {
        return csPrice;
    }

    public void setCsPrice(BigDecimal csPrice) {
        this.csPrice = csPrice;
    }

    public BigDecimal getBlPrice() {
        return blPrice;
    }

    public void setBlPrice(BigDecimal blPrice) {
        this.blPrice = blPrice;
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public String getCorrectionReason() {
        return correctionReason;
    }

    public void setCorrectionReason(String correctionReason) {
        this.correctionReason = correctionReason;
    }

    public String getBillingPackType() {
        return billingPackType;
    }

    public void setBillingPackType(String billingPackType) {
        this.billingPackType = billingPackType;
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
