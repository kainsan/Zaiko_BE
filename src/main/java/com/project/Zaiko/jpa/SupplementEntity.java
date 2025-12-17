package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] SupplementEntity.
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
@Table(name = "t_supplement")
@NamedQuery(name = "SupplementEntity.findAll", query = "SELECT se FROM SupplementEntity se")
public class SupplementEntity  extends CommonEntity implements Serializable  {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // SupplementId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplement_id")
    @JsonProperty("supplementId")
    private Long supplementId;
    
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // planQuantity
    @Column(name = "plan_quantity")
    @JsonProperty("planQuantity")
    private Long planQuantity;
    
    // totalActualQuantity
    @Column(name = "actual_quantity")
    @JsonProperty("actualQuantity")
    private Long actualQuantity;
    
    // inventoryPlanInputQuantity
    @Column(name = "output_available_quantity")
    @JsonProperty("outputAvailableQuantity")
    private Long outputAvailableQuantity;
    
    // inputAvailableAuantity
    @Column(name = "input_available_quantity")
    @JsonProperty("inputAvailableQuantity")
    private Long inputAvailableQuantity;
    
    // supplementQuantity
    @Column(name = "supplement_quantity")
    @JsonProperty("supplementQuantity")
    private Long supplementQuantity;
    
    // productId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // status
    @Column(name = "status")
    @JsonProperty("status")
    private String status = "0";
    
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

    public Long getSupplementId() {
        return supplementId;
    }

    public void setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getPlanQuantity() {
        return planQuantity;
    }

    public void setPlanQuantity(Long planQuantity) {
        this.planQuantity = planQuantity;
    }

    public Long getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(Long actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public Long getOutputAvailableQuantity() {
        return outputAvailableQuantity;
    }

    public void setOutputAvailableQuantity(Long outputAvailableQuantity) {
        this.outputAvailableQuantity = outputAvailableQuantity;
    }

    public Long getInputAvailableQuantity() {
        return inputAvailableQuantity;
    }

    public void setInputAvailableQuantity(Long inputAvailableQuantity) {
        this.inputAvailableQuantity = inputAvailableQuantity;
    }

    public Long getSupplementQuantity() {
        return supplementQuantity;
    }

    public void setSupplementQuantity(Long supplementQuantity) {
        this.supplementQuantity = supplementQuantity;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
