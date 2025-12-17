package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T SetProductEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_set_product")
@NamedQuery(name = "SetProductEntity.findAll", query = "SELECT m FROM SetProductEntity m")
public class SetProductEntity extends CommonEntity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	// ProductId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "set_product_id")
    @JsonProperty("setProductId")
    private Long setProductId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // ChildProductId
    @Column(name = "child_product_id")
    @JsonProperty("childProductId")
    private Long childProductId;

    // Quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Integer quantity;

    // ProductOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;

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

    public Long getSetProductId() {
		return setProductId;
	}

	public void setSetProductId(Long setProductId) {
		this.setProductId = setProductId;
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

	public Long getChildProductId() {
		return childProductId;
	}

	public void setChildProductId(Long childProductId) {
		this.childProductId = childProductId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
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
