package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] StocktakingEntity.
 *
 * @author:  (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/01/03      (ThinhNT)          Create new
*/

@Entity
@Table(name = "t_stocktaking")
@NamedQuery(name = "StocktakingEntity.findAll", query = "SELECT dp FROM StocktakingEntity dp")
public class StocktakingEntity  extends CommonEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // StocktakingId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stocktaking_id")
    @JsonProperty("stocktakingId")
    private Long stocktakingId;
    
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // InstructionNo
    @Column(name = "instruction_no")
    @JsonProperty("instructionNo")
    private String instructionNo;
    
 // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // LocationId
    @Column(name = "location_id_from")
    @JsonProperty("locationId")
    private Long locationIdFrom;
    
    // LocationId
    @Column(name = "location_id_to")
    @JsonProperty("locationIdTo")
    private Long locationIdTo;
    
    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;
    
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;
    
    // CategoryCode1
    @Column(name = "category_code_1")
    @JsonProperty("categoryCode1")
    private String categoryCode1;

    // CategoryCode2
    @Column(name = "category_code_2")
    @JsonProperty("categoryCode2")
    private String categoryCode2;

    // CategoryCode3
    @Column(name = "category_code_3")
    @JsonProperty("categoryCode3")
    private String categoryCode3;

    // CategoryCode4
    @Column(name = "category_code_4")
    @JsonProperty("categoryCode4")
    private String categoryCode4;

    // CategoryCode5
    @Column(name = "category_code_5")
    @JsonProperty("categoryCode5")
    private String categoryCode5;

    // Remarks
    @Column(name = "remarks")
    @JsonProperty("remarks")
    private String remarks;
    
    // Status
    @Column(name = "status")
    @JsonProperty("status")
    private String status;
    
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
    

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getStocktakingId() {
        return stocktakingId;
    }

    public void setStocktakingId(Long stocktakingId) {
        this.stocktakingId = stocktakingId;
    }

    public String getInstructionNo() {
        return instructionNo;
    }

    public void setInstructionNo(String instructionNo) {
        this.instructionNo = instructionNo;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Long getLocationIdFrom() {
        return locationIdFrom;
    }

    public void setLocationIdFrom(Long locationIdFrom) {
        this.locationIdFrom = locationIdFrom;
    }

    public Long getLocationIdTo() {
        return locationIdTo;
    }

    public void setLocationIdTo(Long locationIdTo) {
        this.locationIdTo = locationIdTo;
    }

    public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public String getCategoryCode1() {
        return categoryCode1;
    }

    public void setCategoryCode1(String categoryCode1) {
        this.categoryCode1 = categoryCode1;
    }

    public String getCategoryCode2() {
        return categoryCode2;
    }

    public void setCategoryCode2(String categoryCode2) {
        this.categoryCode2 = categoryCode2;
    }

    public String getCategoryCode3() {
        return categoryCode3;
    }

    public void setCategoryCode3(String categoryCode3) {
        this.categoryCode3 = categoryCode3;
    }

    public String getCategoryCode4() {
        return categoryCode4;
    }

    public void setCategoryCode4(String categoryCode4) {
        this.categoryCode4 = categoryCode4;
    }

    public String getCategoryCode5() {
        return categoryCode5;
    }

    public void setCategoryCode5(String categoryCode5) {
        this.categoryCode5 = categoryCode5;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
