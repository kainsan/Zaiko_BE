package com.project.Zaiko.jpa;

import java.io.Serializable;

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
@Table(name = "t_inventory_plan_input_detail")
@NamedQuery(name = "InventoryPlanInputDetailEntity.findAll", query = "SELECT ipide FROM InventoryPlanInputDetailEntity ipide ")
public class InventoryPlanInputDetailEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // DetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_detail_id")
    @JsonProperty("planDetailId")
    private Long planDetailId;

    // InventoryInputId
    @Column(name = "inventory_input_id")
    @JsonProperty("inventoryInputId")
    private Long inventoryInputId;
    
    //Company Id
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // productId
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

    // DatetimeMng
    @Column(name = "datetime_mng")
    @JsonProperty("dateTimeMng")
    private String dateTimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

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
    private String inventoryProductType = "0";

    // DetailNote
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

    public Long getPlanDetailId() {
        return planDetailId;
    }

    public void setPlanDetailId(Long planDetailId) {
        this.planDetailId = planDetailId;
    }

    public Long getInventoryInputId() {
        return inventoryInputId;
    }

    public void setInventoryInputId(Long inventoryInputId) {
        this.inventoryInputId = inventoryInputId;
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

    public String getDatetimeMng() {
        return dateTimeMng;
    }

    public void setDatetimeMng(String dateTimeMng) {
        this.dateTimeMng = dateTimeMng;
    }

    public String getNumberMng() {
        return numberMng;
    }

    public void setNumberMng(String numberMng) {
        this.numberMng = numberMng;
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

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
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

