package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ReceiptOrderEntity Of Entity.
 *
 * @author: (LocPQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/02/10      (LocPQ)         Create new
*/

@Entity
@Table(name = "t_receipt_order")
@NamedQuery(name = "ReceiptOrderEntity.findAll", query = "SELECT m FROM ReceiptOrderEntity m")
public class ReceiptOrderEntity extends CommonEntity implements Serializable {
   private static final long serialVersionUID = 1L;
   
   // ReceiptOrderId
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "receipt_order_id")
   @JsonProperty("receiptOrderId")
   private Long receiptOrderId;
   
   // CompanyId
   @Column(name = "company_id")
   @JsonProperty("companyId")
   private Integer companyId;
   
   // OrderDate
   @Column(name = "order_date")
   @JsonProperty("orderDate")
   private String orderDate;
   
   // PlanDeliveryDate
   @Column(name = "plan_delivery_date")
   @JsonProperty("planDeliveryDate")
   private String planDeliveryDate;
   
   // RepositoryId
   @Column(name = "repository_id")
   @JsonProperty("repositoryId")
   private Long repositoryId;
   
   // SupplierSlipNo
   @Column(name = "supplier_slip_no")
   @JsonProperty("supplierSlipNo")
   private String supplierSlipNo;
   
   // DestinationId
   @Column(name = "destination_id")
   @JsonProperty("destinationId")
   private Long destinationId;
   
   // CustomerId
   @Column(name = "customer_id")
   @JsonProperty("customerId")
   private Long customerId;
   
   // OrderStatus
   @Column(name = "order_status")
   @JsonProperty("orderStatus")
   private String orderStatus = "0";
   
   // SlipNotes
   @Column(name = "slip_notes")
   @JsonProperty("slipNotes")
   private String slipNotes;
   
   // PlanOutputSlipNo
   @Column(name = "plan_output_slip_no")
   @JsonProperty("planOutputSlipNo")
   private String planOutputSlipNo;
   
   // fileName
   @Column(name = "file_name")
   @JsonProperty("fileName")
   private String fileName;
   
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

	public Long getReceiptOrderId() {
		return receiptOrderId;
	}
	
	public void setReceiptOrderId(Long receiptOrderId) {
		this.receiptOrderId = receiptOrderId;
	}
	
	public Integer getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getPlanDeliveryDate() {
		return planDeliveryDate;
	}
	
	public void setPlanDeliveryDate(String planDeliveryDate) {
		this.planDeliveryDate = planDeliveryDate;
	}
	
	public Long getRepositoryId() {
		return repositoryId;
	}
	
	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}
	
	public String getSupplierSlipNo() {
		return supplierSlipNo;
	}
	
	public void setSupplierSlipNo(String supplierSlipNo) {
		this.supplierSlipNo = supplierSlipNo;
	}
	
	public Long getDestinationId() {
		return destinationId;
	}
	
	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getSlipNotes() {
		return slipNotes;
	}
	
	public void setSlipNotes(String slipNotes) {
		this.slipNotes = slipNotes;
	}
	
	public String getPlanOutputSlipNo() {
		return planOutputSlipNo;
	}
	
	public void setPlanOutputSlipNo(String planOutputSlipNo) {
		this.planOutputSlipNo = planOutputSlipNo;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
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