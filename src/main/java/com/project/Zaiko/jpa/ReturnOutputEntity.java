package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t_return_output  ")
@NamedQuery(name = "ReturnOutputEntity.findAll", query = "SELECT r FROM ReturnOutputEntity r")
public class ReturnOutputEntity extends CommonEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //ReturnOutputId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "return_output_id")
    @JsonProperty("returnOutputId")
    private Long returnOutputId;
     
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // ReturnOutputDate
    @Column(name = "return_Output_date")
    @JsonProperty("returnOutputDate")
    private String returnOutputDate;

    //CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;

    //SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;
    
    //CustomerSlipNo
    @Column(name = "customer_slip_no")
    @JsonProperty("customerSlipNo")
    private String customerSlipNo;
    
    //SlipNotes
    @Column(name = "slip_notes")
    @JsonProperty("slipNotes")
    private String slipNotes;
    
    //ProductOwnerId 
    @Column(name = "product_owner_id")
    @JsonProperty("productOwnerId")
    private Long productOwnerId;
    
    //SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;
    
    //SupplierDeliveryDestinationId
    @Column(name = "supplier_delivery_destination_id")
    @JsonProperty("supplierDeliveryDestinationId")
    private Long supplierDeliveryDestinationId;

    //RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    //Status
    @Column(name = "print_status")
    @JsonProperty("printStatus")
    private String printStatus = "0";

    public String getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
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

    public String getReturnOutputDate() {
        return returnOutputDate;
    }

    public void setReturnOutputDate(String returnOutputDate) {
        this.returnOutputDate = returnOutputDate;
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

    public String getCustomerSlipNo() {
        return customerSlipNo;
    }

    public void setCustomerSlipNo(String customerSlipNo) {
        this.customerSlipNo = customerSlipNo;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierDeliveryDestinationId() {
        return supplierDeliveryDestinationId;
    }

    public void setSupplierDeliveryDestinationId(Long supplierDeliveryDestinationId) {
        this.supplierDeliveryDestinationId = supplierDeliveryDestinationId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

}
