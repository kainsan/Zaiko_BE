package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T InventoryPlanOutPutDetailEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "t_inventory_plan_output_detail")
@NamedQuery(name = "InventoryPlanOutPutDetailEntity.findAll", query = "SELECT ip FROM InventoryPlanOutPutDetailEntity ip")
public class InventoryPlanOutPutDetailEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // PlanDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_detail_id")
    @JsonProperty("planDetailId")
    private Long planDetailId;

    // InventoryOutputId
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // LocationId
    @Column(name = "location_id")
    @JsonProperty("locationId")
    private Long locationId;

    // DatetimeMngFrom
    @Column(name = "datetime_mng_from")
    @JsonProperty("datetimeMngFrom")
    private String datetimeMngFrom;

    // DatetimeMngTo
    @Column(name = "datetime_mng_to")
    @JsonProperty("datetimeMngTo")
    private String datetimeMngTo;

    // NumberMngFrom
    @Column(name = "number_mng_from")
    @JsonProperty("numberMngFrom")
    private String numberMngFrom;

    // NumberMngTo
    @Column(name = "number_mng_to")
    @JsonProperty("numberMngTo")
    private String numberMngTo;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;

    // CsPlanQuantity
    @Column(name = "cs_plan_quantity")
    @JsonProperty("csPlanQuantity")
    private Integer csPlanQuantity;

    // BlPlanQuantity
    @Column(name = "bl_plan_quantity")
    @JsonProperty("blPlanQuantity")
    private Integer blPlanQuantity;

    // PsPlanQuantity
    @Column(name = "ps_plan_quantity")
    @JsonProperty("psPlanQuantity")
    private Integer psPlanQuantity;

    // TotalPlanQuantity
    @Column(name = "total_plan_quantity")
    @JsonProperty("totalPlanQuantity")
    private Long totalPlanQuantity;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // DetailNote
    @Column(name = "detail_note")
    @JsonProperty("detailNote")
    private String detailNote;

    // PlanCsPrice
    @Column(name = "plan_cs_price")
    @JsonProperty("planCsPrice")
    private BigDecimal planCsPrice = new BigDecimal(0);

    // PlanBlPrice
    @Column(name = "plan_bl_price")
    @JsonProperty("planBlPrice")
    private BigDecimal planBlPrice = new BigDecimal(0);

    // PlanPiecePrice
    @Column(name = "plan_piece_price")
    @JsonProperty("planPiecePrice")
    private BigDecimal planPiecePrice = new BigDecimal(0);

    // PlanPiecePrice
//    @Column(name = "plan_amount_total")
//    @JsonProperty("planAmountTotal")
//    private BigDecimal planAmountTotal = new BigDecimal(0);

    // Tax
    @Column(name = "tax")
    @JsonProperty("tax")
    private BigDecimal tax = new BigDecimal(0);

    // AmountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);

    // batchStatus
    @Column(name = "batch_status")
    @JsonProperty("batchStatus")
    private String batchStatus;

    // BatchNo
    @Column(name = "batch_no")
    @JsonProperty("batchNo")
    private String batchNo;

    // BillingPackType
    @Column(name = "billing_pack_type")
    @JsonProperty("billingPackType")
    private String billingPackType;

    //IsBatchInprogress
    @Column(name = "is_batch_inprogress")
    @JsonProperty("isBatchInprogress")
    private Integer isBatchInprogress = 0;

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

    public Long getPlanDetailId() {
        return planDetailId;
    }

    public void setPlanDetailId(Long planDetailId) {
        this.planDetailId = planDetailId;
    }

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getDatetimeMngFrom() {
        return datetimeMngFrom;
    }

    public void setDatetimeMngFrom(String datetimeMngFrom) {
        this.datetimeMngFrom = datetimeMngFrom;
    }

    public String getDatetimeMngTo() {
        return datetimeMngTo;
    }

    public void setDatetimeMngTo(String datetimeMngTo) {
        this.datetimeMngTo = datetimeMngTo;
    }

    public String getNumberMngFrom() {
        return numberMngFrom;
    }

    public void setNumberMngFrom(String numberMngFrom) {
        this.numberMngFrom = numberMngFrom;
    }

    public String getNumberMngTo() {
        return numberMngTo;
    }

    public void setNumberMngTo(String numberMngTo) {
        this.numberMngTo = numberMngTo;
    }

    public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public Integer getCsPlanQuantity() {
        return csPlanQuantity;
    }

    public void setCsPlanQuantity(Integer csPlanQuantity) {
        this.csPlanQuantity = csPlanQuantity;
    }

    public Integer getBlPlanQuantity() {
        return blPlanQuantity;
    }

    public void setBlPlanQuantity(Integer blPlanQuantity) {
        this.blPlanQuantity = blPlanQuantity;
    }

    public Integer getPsPlanQuantity() {
        return psPlanQuantity;
    }

    public void setPsPlanQuantity(Integer psPlanQuantity) {
        this.psPlanQuantity = psPlanQuantity;
    }

    public Long getTotalPlanQuantity() {
        return totalPlanQuantity;
    }

    public void setTotalPlanQuantity(Long totalPlanQuantity) {
        this.totalPlanQuantity = totalPlanQuantity;
    }

    public String getDetailNote() {
        return detailNote;
    }

    public void setDetailNote(String detailNote) {
        this.detailNote = detailNote;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
    }

    public BigDecimal getPlanCsPrice() {
        return planCsPrice;
    }

    public void setPlanCsPrice(BigDecimal planCsPrice) {
        this.planCsPrice = planCsPrice;
    }

    public BigDecimal getPlanBlPrice() {
        return planBlPrice;
    }

    public void setPlanBlPrice(BigDecimal planBlPrice) {
        this.planBlPrice = planBlPrice;
    }

    public BigDecimal getPlanPiecePrice() {
        return planPiecePrice;
    }

    public void setPlanPiecePrice(BigDecimal planPiecePrice) {
        this.planPiecePrice = planPiecePrice;
    }

//    public BigDecimal getPlanAmountTotal() {
//        return planAmountTotal;
//    }
//
//    public void setPlanAmountTotal(BigDecimal planAmountTotal) {
//        this.planAmountTotal = planAmountTotal;
//    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getIsBatchInprogress() {
        return isBatchInprogress;
    }

    public void setIsBatchInprogress(Integer isBatchInprogress) {
        this.isBatchInprogress = isBatchInprogress;
    }

}
