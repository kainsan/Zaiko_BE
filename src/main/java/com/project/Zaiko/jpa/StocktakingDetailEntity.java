package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] StocktakingDetailEntity.
 *
 * @author:  (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/01/03      (ThinhNT)          Create new
*/
@Entity
@Table(name = "t_stocktaking_detail")
@NamedQuery(name = "StocktakingDetailEntity.findAll", query = "SELECT dp FROM StocktakingDetailEntity dp")
public class StocktakingDetailEntity  extends CommonEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // StocktakingDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stocktaking_detail_id")
    @JsonProperty("stocktakingDetailId")
    private Long stocktakingDetailId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // StocktakingId
    @Column(name = "stocktaking_id")
    @JsonProperty("stocktakingId")
    private Long stocktakingId;
    
    @Column(name = "inventory_id")
    @JsonProperty("inventoryId")
    private Long inventoryId;
    
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
    
    // Quantity Inventory
    @Column(name = "quantity_inventory")
    @JsonProperty("quantityInventory")
    private Long quantityInventory;
    
    // AllocatedQuantity
    @Column(name = "allocated_quantity")
    @JsonProperty("allocatedQuantity")
    private Long allocatedQuantity = (long) 0;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // StocktakingReason
    @Column(name = "stocktaking_reason")
    @JsonProperty("stocktakingReason")
    private String stocktakingReason;

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

    public Long getStocktakingDetailId() {
        return stocktakingDetailId;
    }

    public void setStocktakingDetailId(Long stocktakingDetailId) {
        this.stocktakingDetailId = stocktakingDetailId;
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

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
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

    public Long getAllocatedQuantity() {
        return allocatedQuantity;
    }

    public void setAllocatedQuantity(Long allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
    }

    public String getStocktakingReason() {
        return stocktakingReason;
    }

    public void setStocktakingReason(String stocktakingReason) {
        this.stocktakingReason = stocktakingReason;
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

    public Long getQuantityInventory() {
        return quantityInventory;
    }

    public void setQuantityInventory(Long quantityInventory) {
        this.quantityInventory = quantityInventory;
    }
}
