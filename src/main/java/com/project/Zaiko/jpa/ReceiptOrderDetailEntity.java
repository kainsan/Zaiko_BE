package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ReceiptOrderDetailEntity Of Entity.
 *
 * @author: (LocPQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/02/10      (LocPQ)         Create new
*/

@Entity
@Table(name = "t_receipt_order_detail")
@NamedQuery(name = "ReceiptOrderDetailEntity.findAll", query = "SELECT m FROM ReceiptOrderDetailEntity m")
public class ReceiptOrderDetailEntity extends CommonEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// DetailId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detail_id")
	@JsonProperty("detailId")
	private Long detailId;
	   
	// CompanyId
	@Column(name = "company_id")
	@JsonProperty("companyId")
	private Integer companyId;
	
	// ReceiptOrderId
	@Column(name = "receipt_order_id")
	@JsonProperty("receiptOrderId")
	private Long receiptOrderId;
	
	// ProductId
	@Column(name = "product_id")
	@JsonProperty("productId")
	private Long productId;	
	   
	// Quantity
	@Column(name = "quantity")
	@JsonProperty("quantity")
	private Integer quantity;	
	
	// packUnitCode
	@Column(name = "pack_unit_code")
	@JsonProperty("packUnitCode")
	private String packUnitCode;
	
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

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Long getReceiptOrderId() {
		return receiptOrderId;
	}

	public void setReceiptOrderId(Long receiptOrderId) {
		this.receiptOrderId = receiptOrderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPackUnitCode() {
		return packUnitCode;
	}

	public void setPackUnitCode(String packUnitCode) {
		this.packUnitCode = packUnitCode;
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
