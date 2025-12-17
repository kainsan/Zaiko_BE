package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T BatchSetAllocatedEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/12/13      (TanDX)            Create new
*/

@Entity
@Table(name = "t_batch_set_allocated")
@NamedQuery(name = "BatchSetAllocatedEntity.findAll", query = "SELECT b FROM BatchSetAllocatedEntity b")
public class BatchSetAllocatedEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // batchSetAlocatedId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_set_allocated_id")
    @JsonProperty("batchSetAlocatedId")
    private Long batchSetAlocatedId;

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
    private Integer csQuantity = 0;

    // blQuantity
    @Column(name = "bl_quantity")
    @JsonProperty("blQuantity")
    private Integer blQuantity = 0;

    // psQuantity
    @Column(name = "ps_quantity")
    @JsonProperty("psQuantity")
    private Integer psQuantity = 0;

    // BatchDetailId
    @Column(name = "inventory_id")
    @JsonProperty("inventoryId")
    private Long inventoryId;

    // ConstituentQuantity
    @Column(name = "constituentQuantity")
    @JsonProperty("constituentQuantity")
    private Integer constituentQuantity;

    // SetQuantity
    @Column(name = "set_quantity")
    @JsonProperty("setQuantity")
    private Long setQuantity;

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

    public Long getBatchSetAlocatedId() {
        return batchSetAlocatedId;
    }

    public void setBatchSetAlocatedId(Long batchSetAlocatedId) {
        this.batchSetAlocatedId = batchSetAlocatedId;
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

    public String getBillingPackType() {
        return billingPackType;
    }

    public void setBillingPackType(String billingPackType) {
        this.billingPackType = billingPackType;
    }

    public Long getSetQuantity() {
        return setQuantity;
    }

    public void setSetQuantity(Long setQuantity) {
        this.setQuantity = setQuantity;
    }

    public Integer getConstituentQuantity() {
        return constituentQuantity;
    }

    public void setConstituentQuantity(Integer constituentQuantity) {
        this.constituentQuantity = constituentQuantity;
    }
}
