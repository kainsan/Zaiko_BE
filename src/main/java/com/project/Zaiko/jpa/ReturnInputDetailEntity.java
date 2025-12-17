package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * [OVERVIEW] : T ReturnInputDetailEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/08      (TanDX)           Create new
*/

@Entity
@Table(name = "t_return_input_detail")
@NamedQuery(name = "ReturnInputDetailEntity.findAll", query = "SELECT r FROM ReturnInputDetailEntity r")
public class ReturnInputDetailEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//DetailId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detail_id")
	@JsonProperty("detailId")
	private Long detailId;
	
	// CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

	//ReturnInputId
	@Column(name = "return_input_id")
	@JsonProperty("returnInputId")
	private Long returnInputId;

	// ReturnInputDate
    @Column(name = "return_input_date")
    @JsonProperty("returnInputDate")
    private String returnInputDate;

	//ProductOwnerId Code
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

	//RepositoryId
	@Column(name = "repository_id")
	@JsonProperty("repositoryId")
	private Long repositoryId;

	//LocationId
	@Column(name = "location_id")
	@JsonProperty("locationId")
	private Long locationId;

	//DatetimeMng
	@Column(name = "datetime_mng")
	@JsonProperty("dateTimeMng")
	private String dateTimeMng;

	//NumberMng
	@Column(name = "number_Mng")
	@JsonProperty("numberMng")
	private String numberMng;

	//InventoryProductType
	@Column(name = "inventory_product_type")
	@JsonProperty("inventoryProductType")
	private String inventoryProductType;

	//BillingPackType
	@Column(name = "billing_pack_type")
	@JsonProperty("billingPackType")
	private String billingPackType;

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

	//ActualCsPrice
    @Column(name = "cs_price")
    @JsonProperty("actualCsPrice")
    private BigDecimal actualCsPrice = new BigDecimal(0);
    
    //ActualBlPrice
    @Column(name = "bl_price")
    @JsonProperty("actualBlPrice")
    private BigDecimal actualBlPrice = new BigDecimal(0);
    
    //ActualPiecePrice
    @Column(name = "piece_price")
    @JsonProperty("actualPiecePrice")
    private BigDecimal actualPiecePrice = new BigDecimal(0);
    
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

	public Long getReturnInputId() {
		return returnInputId;
	}

	public void setReturnInputId(Long returnInputId) {
		this.returnInputId = returnInputId;
	}

	public String getReturnInputDate() {
		return returnInputDate;
	}

	public void setReturnInputDate(String returnInputDate) {
		this.returnInputDate = returnInputDate;
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

	public String getInventoryProductType() {
		return inventoryProductType;
	}

	public void setInventoryProductType(String inventoryProductType) {
		this.inventoryProductType = inventoryProductType;
	}

	public String getBillingPackType() {
		return billingPackType;
	}

	public void setBillingPackType(String billingPackType) {
		this.billingPackType = billingPackType;
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

	public BigDecimal getActualCsPrice() {
		return actualCsPrice;
	}

	public void setActualCsPrice(BigDecimal actualCsPrice) {
		this.actualCsPrice = actualCsPrice;
	}

	public BigDecimal getActualBlPrice() {
		return actualBlPrice;
	}

	public void setActualBlPrice(BigDecimal actualBlPrice) {
		this.actualBlPrice = actualBlPrice;
	}

	public BigDecimal getActualPiecePrice() {
		return actualPiecePrice;
	}

	public void setActualPiecePrice(BigDecimal actualPiecePrice) {
		this.actualPiecePrice = actualPiecePrice;
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

	public String getCorrectionReason() {
		return correctionReason;
	}

	public void setCorrectionReason(String correctionReason) {
		this.correctionReason = correctionReason;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
