package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ReceiptAndPaymentEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/04/20      (TanDX)           Create new
*/
@Entity
@Table(name = "t_receipt_and_payment")
@NamedQuery(name = "ReceiptAndPaymentEntity.findAll", query = "SELECT c FROM ReceiptAndPaymentEntity c")
public class ReceiptAndPaymentEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // receiptPaymentId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_payment_id")
    @JsonProperty("receiptPaymentId")
    private Long receiptPaymentId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // productOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // productId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    //supplierId
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

    // datetimeMng
    @Column(name = "datetime_mng")
    @JsonProperty("datetimeMng")
    private String datetimeMng;

    // numberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // inventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // businessDate
    @Column(name = "business_date")
    @JsonProperty("businessDate")
    private String businessDate;

    // inventoryQuantity
    @Column(name = "inventory_quantity")
    @JsonProperty("inventoryQuantity")
    private Long inventoryQuantity;

    // inPutQuantity
    @Column(name = "input_quantity")
    @JsonProperty("inPutQuantity")
    private Integer inPutQuantity;

    // outputQuantity
    @Column(name = "output_quantity")
    @JsonProperty("outputQuantity")
    private Integer outputQuantity;

    // returnInputQuantity
    @Column(name = "return_input_quantity")
    @JsonProperty("returnInputQuantity")
    private Integer returnInputQuantity;

    // returnOutputQuantity
    @Column(name = "return_output_quantity")
    @JsonProperty("returnOutputQuantity")
    private Integer returnOutputQuantity;

    // transferPlusQuantity
    @Column(name = "transfer_plus_quantity")
    @JsonProperty("transferPlusQuantity")
    private Integer transferPlusQuantity;

    // transferMinusQuantity
    @Column(name = "transfer_minus_quantity")
    @JsonProperty("transferMinusQuantity")
    private Integer transferMinusQuantity;

    // transferPlusQuantity
    @Column(name = "adjustment_quantity")
    @JsonProperty("adjustmentQuantity")
    private Integer adjustmentQuantity;

    // stocktakingQuantity
    @Column(name = "stocktaking_quantity")
    @JsonProperty("stocktakingQuantity")
    private Integer stocktakingQuantity;

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

    public Long getReceiptPaymentId() {
        return receiptPaymentId;
    }

    public void setReceiptPaymentId(Long receiptPaymentId) {
        this.receiptPaymentId = receiptPaymentId;
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

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    public Long getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Integer getInPutQuantity() {
        return inPutQuantity;
    }

    public void setInPutQuantity(Integer inPutQuantity) {
        this.inPutQuantity = inPutQuantity;
    }

    public Integer getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(Integer outputQuantity) {
        this.outputQuantity = outputQuantity;
    }

    public Integer getReturnInputQuantity() {
        return returnInputQuantity;
    }

    public void setReturnInputQuantity(Integer returnInputQuantity) {
        this.returnInputQuantity = returnInputQuantity;
    }

    public Integer getReturnOutputQuantity() {
        return returnOutputQuantity;
    }

    public void setReturnOutputQuantity(Integer returnOutputQuantity) {
        this.returnOutputQuantity = returnOutputQuantity;
    }

    public Integer getTransferPlusQuantity() {
        return transferPlusQuantity;
    }

    public void setTransferPlusQuantity(Integer transferPlusQuantity) {
        this.transferPlusQuantity = transferPlusQuantity;
    }

    public Integer getTransferMinusQuantity() {
        return transferMinusQuantity;
    }

    public void setTransferMinusQuantity(Integer transferMinusQuantity) {
        this.transferMinusQuantity = transferMinusQuantity;
    }

    public Integer getAdjustmentQuantity() {
        return adjustmentQuantity;
    }

    public void setAdjustmentQuantity(Integer adjustmentQuantity) {
        this.adjustmentQuantity = adjustmentQuantity;
    }

    public Integer getStocktakingQuantity() {
        return stocktakingQuantity;
    }

    public void setStocktakingQuantity(Integer stocktakingQuantity) {
        this.stocktakingQuantity = stocktakingQuantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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
