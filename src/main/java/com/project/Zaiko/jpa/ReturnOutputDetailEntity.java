package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * [OVERVIEW] : T ReturnOutputDetailEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/08      (TanDX)           Create new
*/

@Entity
@Table(name = "t_return_output_detail")
@NamedQuery(name = "ReturnOutputDetailEntity.findAll", query = "SELECT ro FROM ReturnOutputDetailEntity ro")
public class ReturnOutputDetailEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//DetailId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detail_id")
	@JsonProperty("detailId")
	private Long detailId;

	//ReturnOutputId
	@Column(name = "return_output_id")
	@JsonProperty("returnOutputId")
	private Long returnOutputId;
	
	//ReturnOutputDate
	@Column(name = "return_output_date")
	@JsonProperty("returnOutputDate")
	private String returnOutputDate;

	// CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

	//InventoryId
	@Column(name = "inventory_id")
	@JsonProperty("inventoryId")
	private Long inventoryId;
	
	//ProducOwnerId
	@Column(name = "product_owner_id")
	@JsonProperty("productOwnerId")
	private Long productOwnerId;
	
	//SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;

	//ProductId
	@Column(name = "product_id")
	@JsonProperty("productId")
	private Long productId;
	
	//LocationId
	@Column(name = "location_id")
	@JsonProperty("locationId")
	private Long locationId;
	
	//RepositoryId
	@Column(name = "repository_id")
	@JsonProperty("repositoryId")
	private Long repositoryId;

	//DatetimeMng
	@Column(name = "datetime_mng")
	@JsonProperty("dateTimeMng")
	private String dateTimeMng;
	
	//InventoryProductType
	 @Column(name = "inventory_product_type")
	 @JsonProperty("inventoryProductType")
	 private String inventoryProductType;
	
	//NumberMng
	@Column(name = "number_mng")
	@JsonProperty("numberMng")
	private String numberMng;
	
	//CsQuantity
	@Column(name = "cs_quantity")
	@JsonProperty("csQuantity")
	private Integer csQuantity;

	//BlQuantity
	@Column(name = "bl_quantity")
	@JsonProperty("blQuantity")
	private Integer blQuantity;

	//PsQuantity
	@Column(name = "ps_quantity")
	@JsonProperty("psQuantity")
	private Integer psQuantity;

	//Quantity
	@Column(name = "quantity")
	@JsonProperty("quantity")
	private Long quantity;
	
	//CsPrice
    @Column(name = "cs_price")
    @JsonProperty("csPrice")
    private BigDecimal csPrice = new BigDecimal(0);
    
    //BlPrice
    @Column(name = "bl_price")
    @JsonProperty("blPrice")
    private BigDecimal blPrice = new BigDecimal(0);
    
    //PiecePrice
    @Column(name = "piece_price")
    @JsonProperty("piecePrice")
    private BigDecimal piecePrice = new BigDecimal(0);
    
    //AmountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);
    
    //Tax
    @Column(name = "tax")
    @JsonProperty("tax")
    private BigDecimal tax = new BigDecimal(0);

	//CorrectionReason
	@Column(name = "correction_reason")
	@JsonProperty("correctionReason")
	private String correctionReason;
	
	//Notes
	@Column(name = "notes")
	@JsonProperty("notes")
	private String notes;

    public String getInventoryProductType() {
	     return inventoryProductType;
	 }
	 
	 public void setInventoryProductType(String inventoryProductType) {
	    this.inventoryProductType = inventoryProductType;
	 }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getReturnOutputId() {
        return returnOutputId;
    }

    public void setReturnOutputId(Long returnOutputId) {
        this.returnOutputId = returnOutputId;
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

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

    public String getReturnOutputDate() {
        return returnOutputDate;
    }

    public void setReturnOutputDate(String returnOutputDate) {
        this.returnOutputDate = returnOutputDate;
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

    public String getCorrectionReason() {
        return correctionReason;
    }

    public void setCorrectionReason(String correctionReason) {
        this.correctionReason = correctionReason;
    }

    public BigDecimal getCsPrice() {
        return csPrice;
    }

    public void setCsPrice(BigDecimal csPrice) {
        this.csPrice = csPrice;
    }

    public BigDecimal getBlPrice() {
        return blPrice;
    }

    public void setBlPrice(BigDecimal blPrice) {
        this.blPrice = blPrice;
    }

    public BigDecimal getPiecePrice() {
        return piecePrice;
    }

    public void setPiecePrice(BigDecimal piecePrice) {
        this.piecePrice = piecePrice;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
	
	
}
