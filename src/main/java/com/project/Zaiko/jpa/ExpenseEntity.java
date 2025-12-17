package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ExpenseEntity Of Entity.
 *
 * @author: (HuyNQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/31     (HuyNQ)           Create new
*/

@Entity
@Table(name = "t_expense")
@NamedQuery(name = "ExpenseEntity.findAll", query = "SELECT e FROM ExpenseEntity e")
public class ExpenseEntity extends CommonEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    //ExpenseId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    @JsonProperty("expenseId")
    private Long expenseId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    //InventoryOutputId
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;

    // OrderDate
    @Column(name = "order_date")
    @JsonProperty("orderDate")
    private String orderDate;

    // OutputDate
    @Column(name = "output_date")
    @JsonProperty("outputDate")
    private String outputDate;

    // WorkingDate
    @Column(name = "working_date")
    @JsonProperty("workingDate")
    private String workingDate;

    // DeliverDate
    @Column(name = "deliver_date")
    @JsonProperty("deliverDate")
    private String deliverDate;

    //CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;

    //SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    //SupplierSlipNo
    @Column(name = "supplier_slip_no")
    @JsonProperty("supplierSlipNo")
    private String supplierSlipNo;

    //SlipNotes
    @Column(name = "slip_notes")
    @JsonProperty("slipNotes")
    private String slipNotes;

    //CustomerId
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;

    //CustomerDeliveryDestinationId
    @Column(name = "customer_delivery_destination_id")
    @JsonProperty("customerDeliveryDestinationId")
    private Long customerDeliveryDestinationId;

    //RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    //ExpenseSlipPrintStatus
    @Column(name = "expense_slip_print_status")
    @JsonProperty("expenseSlipPrintStatus")
    private String expenseSlipPrintStatus = "0";

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

    // RouteCode
    @Column(name = "route_code")
    @JsonProperty("routeCode")
    private String routeCode;

    // CourseCode
    @Column(name = "course_code")
    @JsonProperty("courseCode")
    private String courseCode;

    // departmentName
    @Column(name = "department_name")
    @JsonProperty("departmentName")
    private String departmentName;

    // destinationCode
    @Column(name = "destination_code")
    @JsonProperty("destinationCode")
    private String destinationCode;

    // PhoneNumber
    @Column(name = "phone_number")
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    // FaxNumber
    @Column(name = "fax_number")
    @JsonProperty("faxNumber")
    private String faxNumber;

    // PostCode
    @Column(name = "post_code")
    @JsonProperty("postCode")
    private String postCode;

    // Address1
    @Column(name = "address1")
    @JsonProperty("address1")
    private String address1;

    // Address2
    @Column(name = "address2")
    @JsonProperty("address2")
    private String address2;

    // Address3
    @Column(name = "address3")
    @JsonProperty("address3")
    private String address3;

    // Address4
    @Column(name = "address4")
    @JsonProperty("address4")
    private String address4;

    // newDestinationName
    @Column(name = "new_destination_name")
    @JsonProperty("newDestinationName")
    private String newDestinationName;

	// Checked
    @Column(name = "checked")
    @JsonProperty("checked")
    private String checked = "0";
    
    // deliverySlipId
    @Column(name = "delivery_slip_id")
    @JsonProperty("deliverySlipId")
    private Long deliverySlipId;
    
    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDestinationName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
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

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(String outputDate) {
        this.outputDate = outputDate;
    }

    public String getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(String workingDate) {
        this.workingDate = workingDate;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
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

    public String getExpenseSlipPrintStatus() {
        return expenseSlipPrintStatus;
    }

    public void setExpenseSlipPrintStatus(String expenseSlipPrintStatus) {
        this.expenseSlipPrintStatus = expenseSlipPrintStatus;
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

    public String getNewDestinationName() {
		return newDestinationName;
	}

	public void setNewDestinationName(String newDestinationName) {
		this.newDestinationName = newDestinationName;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}


    public Long getDeliverySlipId() {
        return deliverySlipId;
    }

    public void setDeliverySlipId(Long deliverySlipId) {
        this.deliverySlipId = deliverySlipId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

}
