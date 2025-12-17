package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * [OVERVIEW] OwnerChangeEntity.
 *
 * @author:  (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/23      (ThinhNT)       Create new
*/

@Entity
@Table(name = "t_owner_change")
@NamedQuery(name = "OwnerChangeEntity.findAll", query = "SELECT oc FROM OwnerChangeEntity oc")
public class OwnerChangeEntity  extends CommonEntity implements Serializable {
 /**
     *
     */
    private static final long serialVersionUID = -2478662434771832630L;

    // InventoryOutputId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_change_id")
    @JsonProperty("ownerChangeId")
    private Long ownerChangeId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // WorkingDate
    @Column(name = "working_date")
    @JsonProperty("workingDate")
    private String workingDate;

    // DeliverDate
    @Column(name = "deliver_date")
    @JsonProperty("deliverDate")
    private String deliverDate;

    // CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;

    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    // SlipNote
    @Column(name = "slip_note")
    @JsonProperty("slipNote")
    private String slipNote;

    // productOwnerOldId
    @Column(name = "product_owner_old_id")
    @JsonProperty("productOwnerOldId")
    private Long productOwnerOldId;

    // productOwnerNewId
    @Column(name = "product_owner_new_id")
    @JsonProperty("productOwnerNewId")
    private Long productOwnerNewId;

    // customerId
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;

    // productOwnerNewId
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

    public Long getOwnerChangeId() {
        return ownerChangeId;
    }

    public void setOwnerChangeId(Long ownerChangeId) {
        this.ownerChangeId = ownerChangeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(String workingDate) {
        this.workingDate = workingDate;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getCreateSlipType() {
        return createSlipType;
    }

    public void setCreateSlipType(String createSlipType) {
        this.createSlipType = createSlipType;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public String getSlipNote() {
        return slipNote;
    }

    public void setSlipNote(String slipNote) {
        this.slipNote = slipNote;
    }

    public Long getProductOwnerOldId() {
        return productOwnerOldId;
    }

    public void setProductOwnerOldId(Long productOwnerOldId) {
        this.productOwnerOldId = productOwnerOldId;
    }

    public Long getProductOwnerNewId() {
        return productOwnerNewId;
    }

    public void setProductOwnerNewId(Long productOwnerNewId) {
        this.productOwnerNewId = productOwnerNewId;
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

    public String getDeliverySlipPrintStatus() {
        return deliverySlipPrintStatus;
    }

    public void setDeliverySlipPrintStatus(String deliverySlipPrintStatus) {
        this.deliverySlipPrintStatus = deliverySlipPrintStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
