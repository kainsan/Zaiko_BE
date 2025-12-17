package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] OrderDetailEntity.
 *
 * @author: (HuyNHM)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/05      (HuyNHM)          Create table
*/

@Entity
@Table(name = "t_order_detail")
@NamedQuery(name = "OrderDetailEntity.findAll", query = "SELECT odd FROM OrderDetailEntity odd ")
public class OrderDetailEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // Order Detail Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    @JsonProperty("orderDetailId")
    private Long orderDetailId;

    //Company Id
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // Order Id
    @Column(name = "order_id")
    @JsonProperty("orderId")
    private Long orderId;
    
    // productId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;
    
    // productOwnerId
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
    
    // Delivery Date
    @Column(name = "delivery_date")
    @JsonProperty("deliveryDate")
    private String deliveryDate;

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

    // TotalQuantity
    @Column(name = "total_quantity")
    @JsonProperty("totalQuantity")
    private Long totalQuantity;
    
    // notes
    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;
    
    // PackCsPrice
    @Column(name = "pack_cs_price")
    @JsonProperty("packCsPrice")
    private BigDecimal packCsPrice = new BigDecimal(0);

    // PackBlPrice
    @Column(name = "pack_bl_price")
    @JsonProperty("packBlPrice")
    private BigDecimal packBlPrice = new BigDecimal(0);

    // PackPiecePrice
    @Column(name = "pack_piece_price")
    @JsonProperty("packPiecePrice")
    private BigDecimal packPiecePrice = new BigDecimal(0);

    // AmountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);
    
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
    
 // supplementQuantity
    @Column(name = "supplement_quantity")
    @JsonProperty("supplementQuantity")
    private Long supplementQuantity;
    
    
 // NumberMng
    @Column(name = "number_mng")
    @JsonProperty("numberMng")
    private String numberMng;
    
    public Long getSupplementQuantity() {
        return supplementQuantity;
    }

    public void setSupplementQuantity(Long supplementQuantity) {
        this.supplementQuantity = supplementQuantity;
    }


    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
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

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

	public BigDecimal getPackCsPrice() {
		return packCsPrice;
	}

	public void setPackCsPrice(BigDecimal packCsPrice) {
		this.packCsPrice = packCsPrice;
	}

	public BigDecimal getPackBlPrice() {
		return packBlPrice;
	}

	public void setPackBlPrice(BigDecimal packBlPrice) {
		this.packBlPrice = packBlPrice;
	}

	public BigDecimal getPackPiecePrice() {
		return packPiecePrice;
	}

	public void setPackPiecePrice(BigDecimal packPiecePrice) {
		this.packPiecePrice = packPiecePrice;
	}

	public BigDecimal getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(BigDecimal amountTotal) {
		this.amountTotal = amountTotal;
	}

	public String getNumberMng() {
		return numberMng;
	}

	public void setNumberMng(String numberMng) {
		this.numberMng = numberMng;
	}
    
	
    
}

