package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T BatchAllocatedEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/11/02      (TanDX)            Create new
*/

@Entity
@Table(name = "t_batch_allocated")
@NamedQuery(name = "BatchAllocatedEntity.findAll", query = "SELECT b FROM BatchAllocatedEntity b")
public class BatchAllocatedEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // BatchAlocatedId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_allocated_id")
    @JsonProperty("batchAlocatedId")
    private Long batchAlocatedId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // BatchDetailId
    @Column(name = "batch_detail_id")
    @JsonProperty("batchDetailId")
    private Long batchDetailId;

    // csQuantity
    @Column(name = "cs_quantity")
    @JsonProperty("csQuantity")
    private Integer csQuantity;

    // blQuantity
    @Column(name = "bl_quantity")
    @JsonProperty("blQuantity")
    private Integer blQuantity;

    // psQuantity
    @Column(name = "ps_quantity")
    @JsonProperty("psQuantity")
    private Integer psQuantity;

    // csPrice
    @Column(name = "cs_price")
    @JsonProperty("csPrice")
    private BigDecimal csPrice = new BigDecimal(0);

    // blPrice
    @Column(name = "bl_price")
    @JsonProperty("blPrice")
    private BigDecimal blPrice = new BigDecimal(0);

    // piectPrice
    @Column(name = "piece_price")
    @JsonProperty("piecePrice")
    private BigDecimal piecePrice = new BigDecimal(0);

    // amountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);

    // tax
    @Column(name = "tax")
    @JsonProperty("tax")
    private BigDecimal tax = new BigDecimal(0);

    // BatchDetailId
    @Column(name = "inventory_id")
    @JsonProperty("inventoryId")
    private Long inventoryId;

    // Quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Long quantity;

    // billingPackType
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

    public Long getBatchAlocatedId() {
        return batchAlocatedId;
    }

    public void setBatchAlocatedId(Long batchAlocatedId) {
        this.batchAlocatedId = batchAlocatedId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getBatchDetailId() {
        return batchDetailId;
    }

    public void setBatchDetailId(Long batchDetailId) {
        this.batchDetailId = batchDetailId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
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

    public String getBillingPackType() {
        return billingPackType;
    }

    public void setBillingPackType(String billingPackType) {
        this.billingPackType = billingPackType;
    }

}
