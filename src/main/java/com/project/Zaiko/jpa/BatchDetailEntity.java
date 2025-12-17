package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T BatchDetailEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/17      (TanDX)            Create new
*/

@Entity
@Table(name = "t_batch_detail")
@NamedQuery(name = "BatchDetailEntity.findAll", query = "SELECT b FROM BatchDetailEntity b")
public class BatchDetailEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // BatchId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_detail_id")
    @JsonProperty("batchDetailId")
    private Long batchDetailId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // BatchOutputId
    @Column(name = "batch_output_id")
    @JsonProperty("batchOutputId")
    private Long batchOutputId;

    // InventoryOutputId
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;

    // PlanDetailId
    @Column(name = "plan_detail_id")
    @JsonProperty("planDetailId")
    private Long planDetailId;

    // AllocatedQuantity
    @Column(name = "allocated_quantity")
    @JsonProperty("allocatedQuantity")
    private Long allocatedQuantity = 0L;

    // RemainQuantity
    @Column(name = "remain_quantity")
    @JsonProperty("remainQuantity")
    private Long remainQuantity = 0L;
    
    // AllocatedQuantityPDF
    @Column(name = "allocated_quantity_pdf")
    @JsonProperty("allocatedQuantityPDF")
    private Long allocatedQuantityPDF = 0L;
    
    // RemainQuantityPDF
    @Column(name = "remain_quantity_pdf")
    @JsonProperty("remainQuantityPDF")
    private Long remainQuantityPDF = 0L;

    // UpdateAllocate
    @Column(name = "update_allocate")
    @JsonProperty("updateAllocate")
    private String updateAllocate = "0";
    
    // PickingList
    @Column(name = "picking_list")
    @JsonProperty("pickingList")
    private String pickingList = "0";

    // SetProductList
    @Column(name = "set_product_list")
    @JsonProperty("setProductList")
    private String setProductList = "0";

    // LackProductList
    @Column(name = "lack_product_list")
    @JsonProperty("lackProductList")
    private String lackProductList = "0";

    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

   // BatchStatus
   @Column(name = "batch_status")
   @JsonProperty("batchStatus")
   private String batchStatus;

   // LackOfProductStatus
   @Column(name = "lack_of_product_status")
   @JsonProperty("lackOfProductStatus")
   private String lackOfProductStatus = "0";

   // deliveryInstructionStatus
   @Column(name = "delivery_instruction_status")
   @JsonProperty("deliveryInstructionStatus")
   private String deliveryInstructionStatus = "0";

   // confirmStatus
   @Column(name = "confirm_status")
   @JsonProperty("confirmStatus")
   private String confirmStatus = "0";

   // deliveryNotStatus
   @Column(name = "delivery_note_status")
   @JsonProperty("deliveryNoteStatus")
   private String deliveryNoteStatus = "0";

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

    public Long getBatchDetailId() {
        return batchDetailId;
    }

    public void setBatchDetailId(Long batchDetailId) {
        this.batchDetailId = batchDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getBatchOutputId() {
		return batchOutputId;
	}

	public void setBatchOutputId(Long batchOutputId) {
		this.batchOutputId = batchOutputId;
	}

	public Long getPlanDetailId() {
        return planDetailId;
    }

    public void setPlanDetailId(Long planDetailId) {
        this.planDetailId = planDetailId;
    }

    public Long getAllocatedQuantity() {
        return allocatedQuantity;
    }

    public void setAllocatedQuantity(Long allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    public Long getRemainQuantity() {
        return remainQuantity;
    }

    public void setRemainQuantity(Long remainQuantity) {
        this.remainQuantity = remainQuantity;
    }

    public String getPickingList() {
        return pickingList;
    }

    public void setPickingList(String pickingList) {
        this.pickingList = pickingList;
    }

    public String getSetProductList() {
        return setProductList;
    }

    public void setSetProductList(String setProductList) {
        this.setProductList = setProductList;
    }

    public String getLackProductList() {
        return lackProductList;
    }

    public void setLackProductList(String lackProductList) {
        this.lackProductList = lackProductList;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
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

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getLackOfProductStatus() {
		return lackOfProductStatus;
	}

	public void setLackOfProductStatus(String lackOfProductStatus) {
		this.lackOfProductStatus = lackOfProductStatus;
	}

	public String getDeliveryInstructionStatus() {
		return deliveryInstructionStatus;
	}

	public void setDeliveryInstructionStatus(String deliveryInstructionStatus) {
		this.deliveryInstructionStatus = deliveryInstructionStatus;
	}

	public String getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getDeliveryNoteStatus() {
		return deliveryNoteStatus;
	}

	public void setDeliveryNotStatus(String deliveryNoteStatus) {
		this.deliveryNoteStatus = deliveryNoteStatus;
	}

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public void setDeliveryNoteStatus(String deliveryNoteStatus) {
        this.deliveryNoteStatus = deliveryNoteStatus;
    }

    public Long getAllocatedQuantityPDF() {
        return allocatedQuantityPDF;
    }

    public void setAllocatedQuantityPDF(Long allocatedQuantityPDF) {
        this.allocatedQuantityPDF = allocatedQuantityPDF;
    }

    public Long getRemainQuantityPDF() {
        return remainQuantityPDF;
    }

    public void setRemainQuantityPDF(Long remainQuantityPDF) {
        this.remainQuantityPDF = remainQuantityPDF;
    }

    public String getUpdateAllocate() {
        return updateAllocate;
    }

    public void setUpdateAllocate(String updateAllocate) {
        this.updateAllocate = updateAllocate;
    }
}
