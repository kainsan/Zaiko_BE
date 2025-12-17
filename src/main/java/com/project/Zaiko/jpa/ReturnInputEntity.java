package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ReturnInputEntity Of Entity.
 *
 * @author: (LOCPQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/26      (LOCPQ)           Create new
*/

@Entity
@Table(name = "t_return_input")
@NamedQuery(name = "ReturnInputEntity.findAll", query = "SELECT r FROM ReturnInputEntity r")
public class ReturnInputEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "return_input_id")
	@JsonProperty("returnInputId")
	private Long returnInputId;
	
	// CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // ReturnInputDate
    @Column(name = "return_input_date")
    @JsonProperty("returnInputDate")
    private String returnInputDate;

    //CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;
 
    // slipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;
    
    // supplierSlipNo
    @Column(name = "supplier_slip_no")
    @JsonProperty("supplierSlipNo")
    private String supplierSlipNo;
   
    // slipNotes
    @Column(name = "slip_notes")
    @JsonProperty("slipNotes")
    private String slipNotes;
    
    // productOwnerId
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;
    
    // customerId
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;
    
    // customerDeliveryDestinationId
    @Column(name = "customer_delivery_destination_id")
    @JsonProperty("customerDeliveryDestinationId")
    private Long customerDeliveryDestinationId;
    
    // newDestinationName
    @Column(name = "new_destination_name")
    @JsonProperty("newDestinationName")
    private String newDestinationName;
    
    // postCode
    @Column(name = "post_code")
    @JsonProperty("postCode")
    private String postCode;
    
    // postCode
    @Column(name = "phone_number")
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    
    // faxNumber
    @Column(name = "fax_number")
    @JsonProperty("faxNumber")
    private String faxNumber;
    
    // address1
    @Column(name = "address1")
    @JsonProperty("address1")
    private String address1;
    
    // address2
    @Column(name = "address2")
    @JsonProperty("address2")
    private String address2;
    
    // address3
    @Column(name = "address3")
    @JsonProperty("address3")
    private String address3;
    
    // address4
    @Column(name = "address4")
    @JsonProperty("address4")
    private String address4;
    
    // checked
    @Column(name = "checked")
    @JsonProperty("checked")
    private String checked = "0";
    
    // repositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;
    
    //deliverySlipPrintStatus
    @Column(name = "delivery_slip_print_status")
    @JsonProperty("deliverySlipPrintStatus")
    private String deliverySlipPrintStatus;

	public Long getReturnInputId() {
		return returnInputId;
	}

	public void setReturnInputId(Long returnInputId) {
		this.returnInputId = returnInputId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getReturnInputDate() {
		return returnInputDate;
	}

	public void setReturnInputDate(String returnInputDate) {
		this.returnInputDate = returnInputDate;
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

	public String getSupplierSlipNo() {
		return supplierSlipNo;
	}

	public void setSupplierSlipNo(String supplierSlipNo) {
		this.supplierSlipNo = supplierSlipNo;
	}

	public String getSlipNotes() {
		return slipNotes;
	}

	public void setSlipNotes(String slipNotes) {
		this.slipNotes = slipNotes;
	}

	public Long getProductOwnerId() {
		return productOwnerId;
	}

	public void setProductOwnerId(Long productOwnerId) {
		this.productOwnerId = productOwnerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerDeliveryDestinationId() {
		return customerDeliveryDestinationId;
	}

	public void setCustomerDeliveryDestinationId(Long customerDeliveryDestinationId) {
		this.customerDeliveryDestinationId = customerDeliveryDestinationId;
	}

	public Long getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getDeliverySlipPrintStatus() {
		return deliverySlipPrintStatus;
	}

	public void setDeliverySlipPrintStatus(String deliverySlipPrintStatus) {
		this.deliverySlipPrintStatus = deliverySlipPrintStatus;
	}

	public String getNewDestinationName() {
		return newDestinationName;
	}

	public void setNewDestinationName(String newDestinationName) {
		this.newDestinationName = newDestinationName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}
	
}
