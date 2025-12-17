package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T InventoryActualOutPutDetailEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "t_inventory_actual_output_detail")
@NamedQuery(name = "InventoryActualOutPutDetailEntity.findAll", query = "SELECT io FROM InventoryActualOutPutDetailEntity io")
public class InventoryActualOutPutDetailEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // ActualDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actual_detail_id")
    @JsonProperty("actualDetailId")
    private Long actualDetailId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // InventoryOutputId
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;

    // PlanDetailId
    @Column(name = "plan_detail_id")
    @JsonProperty("planDetailId")
    private Long planDetailId;

    // PlanInventoryId
    @Column(name = "actual_inventory_id")
    @JsonProperty("actualInventoryId")
    private Long actualInventoryId;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // supplierId
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
    @Column(name = "datetime_mng")
    @JsonProperty("datetimeMng")
    private String datetimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // ActualOutputDate
    @Column(name = "actual_output_date")
    @JsonProperty("actualOutputDate")
    private String actualOutputDate;

    // DeliverDate
    @Column(name = "deliver_date")
    @JsonProperty("deliverDate")
    private String deliverDate;

    // BillingPackType
    @Column(name = "billing_pack_type")
    @JsonProperty("billingPackType")
    private String billingPackType;

    // ActualCsQuantity
    @Column(name = "actual_cs_quantity")
    @JsonProperty("actualCsQuantity")
    private Integer actualCsQuantity;

    // PlanBlQuantity
    @Column(name = "actual_bl_quantity")
    @JsonProperty("actualBlQuantity")
    private Integer actualBlQuantity;

    // PlanPsQuantity
    @Column(name = "actual_ps_quantity")
    @JsonProperty("actualPsQuantity")
    private Integer actualPsQuantity;

    // TotalActualQuantity
    @Column(name = "total_actual_quantity")
    @JsonProperty("totalActualQuantity")
    private Long totalActualQuantity;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // ActualCsPrice
    @Column(name = "actual_cs_price")
    @JsonProperty("actualCsPrice")
    private BigDecimal actualCsPrice = new BigDecimal(0);

    // ActualBlPrice
    @Column(name = "actual_bl_price")
    @JsonProperty("actualBlPrice")
    private BigDecimal actualBlPrice = new BigDecimal(0);

    // ActualPiecePrice
    @Column(name = "actual_piece_price")
    @JsonProperty("actualPiecePrice")
    private BigDecimal actualPiecePrice = new BigDecimal(0);

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

    // DeliverySlipPrintStatus
    @Column(name = "delivery_slip_print_status")
    @JsonProperty("deliverySlipPrintStatus")
    private String deliverySlipPrintStatus = "0";

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

    @Column(name = "delivery_slip_id")
    @JsonProperty("deliverySlipId")
    private Long deliverySlipId;

    // isBatch
    @Column(name = "is_batch")
    @JsonProperty("isBatch")
    private String isBatch;

    // batchNo
    @Column(name = "batch_no")
    @JsonProperty("batchNo")
    private String batchNo;

    public Long getActualDetailId() {
        return actualDetailId;
    }

    public void setActualDetailId(Long actualDetailId) {
        this.actualDetailId = actualDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public Long getPlanDetailId() {
        return planDetailId;
    }

    public void setPlanDetailId(Long planDetailId) {
        this.planDetailId = planDetailId;
    }

    public Long getActualInventoryId() {
        return actualInventoryId;
    }

    public void setActualInventoryId(Long actualInventoryId) {
        this.actualInventoryId = actualInventoryId;
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

    public String getDatetimeMng() {
        return datetimeMng;
    }

    public void setDatetimeMng(String datetimeMng) {
        this.datetimeMng = datetimeMng;
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

    public String getActualOutputDate() {
        return actualOutputDate;
    }

    public void setActualOutputDate(String actualOutputDate) {
        this.actualOutputDate = actualOutputDate;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getBillingPackType() {
        return billingPackType;
    }

    public void setBillingPackType(String billingPackType) {
        this.billingPackType = billingPackType;
    }

    public Integer getActualCsQuantity() {
        return actualCsQuantity;
    }

    public void setActualCsQuantity(Integer actualCsQuantity) {
        this.actualCsQuantity = actualCsQuantity;
    }

    public Integer getActualBlQuantity() {
        return actualBlQuantity;
    }

    public void setActualBlQuantity(Integer actualBlQuantity) {
        this.actualBlQuantity = actualBlQuantity;
    }

    public Integer getActualPsQuantity() {
        return actualPsQuantity;
    }

    public void setActualPsQuantity(Integer actualPsQuantity) {
        this.actualPsQuantity = actualPsQuantity;
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

    public BigDecimal getActualCsPrice() {
        return actualCsPrice;
    }

    public void setActualCsPrice(BigDecimal actualCsPrice) {
        this.actualCsPrice = actualCsPrice;
    }

    public BigDecimal getActualBlPrice() {
        return actualBlPrice;
    }

    public void setActualBlPrice(BigDecimal actualBlPrice) {
        this.actualBlPrice = actualBlPrice;
    }

    public BigDecimal getActualPiecePrice() {
        return actualPiecePrice;
    }

    public void setActualPiecePrice(BigDecimal actualPiecePrice) {
        this.actualPiecePrice = actualPiecePrice;
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

    public String getDeliverySlipPrintStatus() {
        return deliverySlipPrintStatus;
    }

    public void setDeliverySlipPrintStatus(String deliverySlipPrintStatus) {
        this.deliverySlipPrintStatus = deliverySlipPrintStatus;
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

    public Long getDeliverySlipId() {
        return deliverySlipId;
    }

    public void setDeliverySlipId(Long deliverySlipId) {
        this.deliverySlipId = deliverySlipId;
    }

    public String getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(String isBatch) {
        this.isBatch = isBatch;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

}
