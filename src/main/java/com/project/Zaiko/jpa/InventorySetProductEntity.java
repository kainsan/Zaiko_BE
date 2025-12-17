package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T InventorySetProduct Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/02/07      (TanDX)            Create new
*/

@Entity
@Table(name = "t_inventory_set_product")
@NamedQuery(name = "InventorySetProductEntity.findAll", query = "SELECT iv FROM InventorySetProductEntity iv")
public class InventorySetProductEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // inventorySetProductId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_set_product_id")
    @JsonProperty("inventorySetProductId")
    private Long inventorySetProductId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // createDay
    @Column(name = "create_day")
    @JsonProperty("createDay")
    private String createDay;

    // workingDate
    @Column(name = "working_date")
    @JsonProperty("workingDate")
    private String workingDate;

    // createSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;

    // slipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    // slipNote
    @Column(name = "slip_note")
    @JsonProperty("slipNote")
    private String slipNote;

    // productId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // datetimeMng
    @Column(name = "datetime_mng")
    @JsonProperty("dateTimeMng")
    private String dateTimeMng;

    // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

    // supplierId
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

    // InventoryProductType
    @Column(name = "inventory_product_type")
    @JsonProperty("inventoryProductType")
    private String inventoryProductType;
    
    // CorrectionReason
    @Column(name = "correction_reason")
    @JsonProperty("correctionReason")
    private String correctionReason;

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

    // quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Long quantity;

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

    public Long getInventorySetProductId() {
        return inventorySetProductId;
    }

    public void setInventorySetProductId(Long inventorySetProductId) {
        this.inventorySetProductId = inventorySetProductId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    public String getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(String workingDate) {
        this.workingDate = workingDate;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getInventoryProductType() {
        return inventoryProductType;
    }

    public void setInventoryProductType(String inventoryProductType) {
        this.inventoryProductType = inventoryProductType;
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

    public String getCorrectionReason() {
        return correctionReason;
    }

    public void setCorrectionReason(String correctionReason) {
        this.correctionReason = correctionReason;
    }

}
