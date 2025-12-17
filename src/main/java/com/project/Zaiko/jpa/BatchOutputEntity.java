package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : BatchOutputEntity
 *
 * @author: (LocPQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/11/17      (LocPQ)            Create new
*/

@Entity
@Table(name = "t_batch_output")
@NamedQuery(name = "BatchOutputEntity.findAll", query = "SELECT bo FROM BatchOutputEntity bo")
public class BatchOutputEntity extends CommonEntity implements Serializable {
	 private static final long serialVersionUID = 1L;

	 // batchOutputId
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "batch_output_id")
	 @JsonProperty("batchOutputId")
	 private Long batchOutputId;

	 // CompanyId
	 @Column(name = "company_id")
	 @JsonProperty("companyId")
	 private Integer companyId;

	 // BatchId
	 @Column(name = "batch_id")
	 @JsonProperty("batchId")
	 private Long batchId;

	 // InventoryOutputId
	 @Column(name = "inventory_output_id")
	 @JsonProperty("inventoryOutputId")
	 private Long inventoryOutputId;

	 // SlipNo
	 @Column(name = "slip_no")
	 @JsonProperty("slipNo")
	 private String slipNo;

	 // BatchNo
	 @Column(name = "batch_no")
	 @JsonProperty("batchNo")
	 private String batchNo;

	 // name
	 @Column(name = "name")
	 @JsonProperty("name")
	 private String name;

	 // batchStatus
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

	 // deliveryNoteStatus
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

	 @Column(name = "delivery_slip_id")
	 @JsonProperty("deliverySlipId")
	 private Long deliverySlipId;

	// planDeliveryDate
	@Column(name = "plan_delivery_date")
	@JsonProperty("planDeliveryDate")
	private String planDeliveryDate;


	// START TANDX v1 add planOutputDate
    @Column(name = "plan_output_date")
    @JsonProperty("planOutputDate")
    private String planOutputDate;
    // END TANDX v1

	public Long getBatchOutputId() {
		return batchOutputId;
	}

	public void setBatchOutputId(Long batchOutputId) {
		this.batchOutputId = batchOutputId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getInventoryOutputId() {
		return inventoryOutputId;
	}

	public void setInventoryOutputId(Long inventoryOutputId) {
		this.inventoryOutputId = inventoryOutputId;
	}

	public String getSlipNo() {
		return slipNo;
	}

	public void setSlipNo(String slipNo) {
		this.slipNo = slipNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setDeliveryNoteStatus(String deliveryNoteStatus) {
		this.deliveryNoteStatus = deliveryNoteStatus;
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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Long getDeliverySlipId() {
        return deliverySlipId;
    }

    public void setDeliverySlipId(Long deliverySlipId) {
        this.deliverySlipId = deliverySlipId;
    }

    public String getPlanDeliveryDate() {
        return planDeliveryDate;
    }

    public void setPlanDeliveryDate(String planDeliveryDate) {
        this.planDeliveryDate = planDeliveryDate;
    }

    public String getPlanOutputDate() {
        return planOutputDate;
    }

    public void setPlanOutputDate(String planOutputDate) {
        this.planOutputDate = planOutputDate;
    }

}
