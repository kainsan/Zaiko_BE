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
@Table(name = "t_inventory_input")
@NamedQuery(name = "InventoryInputEntity.findAll", query = "SELECT iie FROM InventoryInputEntity iie ")
public class InventoryInputEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // InventoryInputId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_input_id")
    @JsonProperty("inventoryInputId")
    private Long inventoryInputId;
    
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // InputPlanDate
    @Column(name = "input_plan_date")
    @JsonProperty("inputPlanDate")
    private String inputPlanDate;

    // InputActualDate
    @Column(name = "input_actual_date")
    @JsonProperty("inputActualDate")
    private String inputActualDate;
    
    // CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;
    
    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;
    
    // planSupplierSlipNo
    @Column(name = "plan_supplier_slip_no")
    @JsonProperty("planSupplierSlipNo")
    private String planSupplierSlipNo;

    // actualSupplierSlipNo
    @Column(name = "actual_supplier_slip_no")
    @JsonProperty("actualSupplierSlipNo")
    private String actualSupplierSlipNo;
    
    // planSlipNote
    @Column(name = "plan_slip_note")
    @JsonProperty("planSlipNote")
    private String planSlipNote;

    // actualSlipNote
    @Column(name = "actual_slip_note")
    @JsonProperty("actualSlipNote")
    private String actualSlipNote;

    // planSupplierDeliveryDestinationId
    @Column(name = "plan_supplier_delivery_destination_id")
    @JsonProperty("planSupplierDeliveryDestinationId")
    private Long planSupplierDeliveryDestinationId;

    // actualSupplierDeliveryDestinationId
    @Column(name = "actual_supplier_delivery_destination_id")
    @JsonProperty("actualSupplierDeliveryDestinationId")
    private Long actualSupplierDeliveryDestinationId;
    
    // planSupplierId
    @Column(name = "plan_supplier_id")
    @JsonProperty("planSupplierId")
    private Long planSupplierId;
    
    // actualSupplierId
    @Column(name = "actual_supplier_id")
    @JsonProperty("actualSupplierId")
    private Long actualSupplierId;
    
    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;
    
    // planRepositoryId
    @Column(name = "plan_repository_id")
    @JsonProperty("planRepositoryId")
    private Long planRepositoryId;

    // actualRepositoryId
    @Column(name = "actual_repository_id")
    @JsonProperty("actualRepositoryId")
    private Long actualRepositoryId;
    
    // InputStatus
    @Column(name = "input_status")
    @JsonProperty("inputStatus")
    private String inputStatus = "0";

    // sumPlanQuantity
    @Column(name = "sum_plan_quantity")
    @JsonProperty("sumPlanQuantity")
    private Long sumPlanQuantity= 0L;

    // sumActualQuantity
    @Column(name = "sum_actual_quantity")
    @JsonProperty("sumActualQuantity")
    private Long sumActualQuantity = 0L;
    
    // IsClosed
    @Column(name = "is_closed")
    @JsonProperty("isClosed")
    private String isClosed = "0";
    
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
    
    // contactStatus
    @Column(name = "contact_status")
    @JsonProperty("contactStatus")
    private String contactStatus;
    
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

    public String getInputPlanDate() {
        return inputPlanDate;
    }

    public void setInputPlanDate(String inputPlanDate) {
        this.inputPlanDate = inputPlanDate;
    }

    public String getInputActualDate() {
        return inputActualDate;
    }

    public void setInputActualDate(String inputActualDate) {
        this.inputActualDate = inputActualDate;
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

    public String getPlanSupplierSlipNo() {
        return planSupplierSlipNo;
    }

    public void setPlanSupplierSlipNo(String planSupplierSlipNo) {
        this.planSupplierSlipNo = planSupplierSlipNo;
    }

    public String getActualSupplierSlipNo() {
        return actualSupplierSlipNo;
    }

    public void setActualSupplierSlipNo(String actualSupplierSlipNo) {
        this.actualSupplierSlipNo = actualSupplierSlipNo;
    }

    public String getPlanSlipNote() {
        return planSlipNote;
    }

    public void setPlanSlipNote(String planSlipNote) {
        this.planSlipNote = planSlipNote;
    }

    public String getActualSlipNote() {
        return actualSlipNote;
    }

    public void setActualSlipNote(String actualSlipNote) {
        this.actualSlipNote = actualSlipNote;
    }

    public Long getPlanSupplierDeliveryDestinationId() {
        return planSupplierDeliveryDestinationId;
    }

    public void setPlanSupplierDeliveryDestinationId(Long planSupplierDeliveryDestinationId) {
        this.planSupplierDeliveryDestinationId = planSupplierDeliveryDestinationId;
    }

    public Long getActualSupplierDeliveryDestinationId() {
        return actualSupplierDeliveryDestinationId;
    }

    public void setActualSupplierDeliveryDestinationId(Long actualSupplierDeliveryDestinationId) {
        this.actualSupplierDeliveryDestinationId = actualSupplierDeliveryDestinationId;
    }

    public Long getPlanSupplierId() {
        return planSupplierId;
    }

    public void setPlanSupplierId(Long planSupplierId) {
        this.planSupplierId = planSupplierId;
    }

    public Long getActualSupplierId() {
        return actualSupplierId;
    }

    public void setActualSupplierId(Long actualSupplierId) {
        this.actualSupplierId = actualSupplierId;
    }

    public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public Long getPlanRepositoryId() {
        return planRepositoryId;
    }

    public void setPlanRepositoryId(Long planRepositoryId) {
        this.planRepositoryId = planRepositoryId;
    }

    public Long getActualRepositoryId() {
        return actualRepositoryId;
    }

    public void setActualRepositoryId(Long actualRepositoryId) {
        this.actualRepositoryId = actualRepositoryId;
    }

    public String getInputStatus() {
        return inputStatus;
    }

    public void setInputStatus(String inputStatus) {
        this.inputStatus = inputStatus;
    }

    public Long getSumPlanQuantity() {
        return sumPlanQuantity;
    }

    public void setSumPlanQuantity(Long sumPlanQuantity) {
        this.sumPlanQuantity = sumPlanQuantity;
    }

    public Long getSumActualQuantity() {
        return sumActualQuantity;
    }

    public void setSumActualQuantity(Long sumActualQuantity) {
        this.sumActualQuantity = sumActualQuantity;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
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

	public String getContactStatus() {
		return contactStatus;
	}

	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
	}
    
    
}

