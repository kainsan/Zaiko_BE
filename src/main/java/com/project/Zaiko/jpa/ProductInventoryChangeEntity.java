package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ProductInventoryChangeEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/06      (TanDX)            Create new
*/

@Entity
@Table(name = "t_product_inventory_change")
@NamedQuery(name = "ProductInventoryChangeEntity.findAll", query = "SELECT pi FROM ProductInventoryChangeEntity pi")
public class ProductInventoryChangeEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // InventoryChangeId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_change_id")
    @JsonProperty("inventoryChangeId")
    private Long inventoryChangeId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // setProductId
    @Column(name = "set_product_id")
    @JsonProperty("setProductId")
    private Long setProductId;

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
    @JsonProperty("dateTimeMng")
    private String dateTimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;

    // InventoryQuantity
    @Column(name = "inventory_quantity")
    @JsonProperty("inventoryQuantity")
    private Long inventoryQuantity;

    // ChangeQuantity
    @Column(name = "change_quantity")
    @JsonProperty("changeQuantity")
    private Long changeQuantity;

    // ChangeDate
    @Column(name = "change_date")
    @JsonProperty("changeDate")
    private String changeDate;

    // ChangeType
    @Column(name = "change_type")
    @JsonProperty("changeType")
    private String changeType;

    // ChangeReason
    @Column(name = "change_reason")
    @JsonProperty("changeReason")
    private String changeReason;

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

    // HeaderId
    @Column(name = "header_id")
    @JsonProperty("headerId")
    private Long headerId;

    // DetailId
    @Column(name = "detail_id")
    @JsonProperty("detailId")
    private Long detailId;

    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    // BusinessDate
    @Column(name = "business_day")
    @JsonProperty("businessDay")
    private String businessDay;

    public Long getInventoryChangeId() {
        return inventoryChangeId;
    }

    public void setInventoryChangeId(Long inventoryChangeId) {
        this.inventoryChangeId = inventoryChangeId;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSetProductId() {
        return setProductId;
    }

    public void setSetProductId(Long setProductId) {
        this.setProductId = setProductId;
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

    public String getDateTimeMng() {
        return dateTimeMng;
    }

    public void setDateTimeMng(String dateTimeMng) {
        this.dateTimeMng = dateTimeMng;
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

    public Long getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Long getChangeQuantity() {
        return changeQuantity;
    }

    public void setChangeQuantity(Long changeQuantity) {
        this.changeQuantity = changeQuantity;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
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

    public ProductInventoryChangeEntity() {
        super();
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public String getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(String businessDay) {
        this.businessDay = businessDay;
    }

    public ProductInventoryChangeEntity(Integer companyId, Long productOwnerId, Long productId,
            Long supplierId, Long repositoryId, Long locationId, String dateTimeMng, String numberMng,
            String inventoryProductType, Long inventoryQuantity, Long changeQuantity, String changeDate,
            String changeType, String changeReason, Long headerId, Long detailId, String slipNo) {
        super();
        this.companyId = companyId;
        this.productOwnerId = productOwnerId;
        this.productId = productId;
        this.supplierId = supplierId;
        this.repositoryId = repositoryId;
        this.locationId = locationId;
        this.dateTimeMng = dateTimeMng;
        this.numberMng = numberMng;
        this.inventoryProductType = inventoryProductType;
        this.inventoryQuantity = inventoryQuantity;
        this.changeQuantity = changeQuantity;
        this.changeDate = changeDate;
        this.changeType = changeType;
        this.changeReason = changeReason;
        this.headerId = headerId;
        this.detailId = detailId;
        this.slipNo = slipNo;
    }
}
