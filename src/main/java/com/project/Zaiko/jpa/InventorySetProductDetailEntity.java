package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T InventorySetProductDetail Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2023/02/07      (TanDX)            Create new
*/

@Entity
@Table(name = "t_inventory_set_product_detail")
@NamedQuery(name = "InventorySetProductDetailEntity.findAll", query = "SELECT iv FROM InventorySetProductDetailEntity iv")
public class InventorySetProductDetailEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // InventorySetProductDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_set_product_detail_id")
    @JsonProperty("inventorySetProductDetailId")
    private Long inventorySetProductDetailId;

    // InventorySetProductId
    @Column(name = "inventory_set_product_id")
    @JsonProperty("inventorySetProductId")
    private Long inventorySetProductId;

    // inventoryId
    @Column(name = "inventory_id")
    @JsonProperty("inventoryId")
    private Long inventoryId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Long quantity;
    
    // constituentQuantity
    @Column(name = "constituent_quantity")
    @JsonProperty("constituentQuantity")
    private Long constituentQuantity;

    public Long getInventorySetProductDetailId() {
        return inventorySetProductDetailId;
    }

    public void setInventorySetProductDetailId(Long inventorySetProductDetailId) {
        this.inventorySetProductDetailId = inventorySetProductDetailId;
    }

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

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getConstituentQuantity() {
        return constituentQuantity;
    }

    public void setConstituentQuantity(Long constituentQuantity) {
        this.constituentQuantity = constituentQuantity;
    }

}
