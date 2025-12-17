package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T InventoryOutputEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/06      (TanDX)         Create new
*/

@Entity
@Table(name = "t_inventory_output")
@NamedQuery(name = "InventoryOutputEntity.findAll", query = "SELECT iv FROM InventoryOutputEntity iv")
public class InventoryOutputEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // InventoryOutputId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // PlanCustomerDeliveryDestinationId
    @Column(name = "plan_customer_delivery_destination_id")
    @JsonProperty("planCustomerDeliveryDestinationId")
    private Long planCustomerDeliveryDestinationId;

    // ActualCustomerDeliveryDestinationId
    @Column(name = "actual_customer_delivery_destination_id")
    @JsonProperty("actualCustomerDeliveryDestinationId")
    private Long actualCustomerDeliveryDestinationId;

    // PlanCustomerId
    @Column(name = "plan_customer_id")
    @JsonProperty("planCustomerId")
    private Long planCustomerId;

    // ActualCustomerId
    @Column(name = "actual_customer_id")
    @JsonProperty("actualCustomerId")
    private Long actualCustomerId;

    // OrderDate
    @Column(name = "order_date")
    @JsonProperty("orderDate")
    private String orderDate;

    // PlanOutputDate
    @Column(name = "plan_output_date")
    @JsonProperty("planOutputDate")
    private String planOutputDate;

    // PlanWorkingDate
    @Column(name = "plan_working_date")
    @JsonProperty("planWorkingDate")
    private String planWorkingDate;

    // PlanDeliverDate
    @Column(name = "plan_deliver_date")
    @JsonProperty("planDeliverDate")
    private String planDeliverDate;

    // actualOutPutDate
    @Column(name = "actual_output_date")
    @JsonProperty("actualOutputDate")
    private String actualOutputDate;

    // ActualDeliverDate
    @Column(name = "actual_deliver_date")
    @JsonProperty("actualDeliverDate")
    private String actualDeliverDate;

    // PlanSupplierSlipNo
    @Column(name = "plan_supplier_slip_no")
    @JsonProperty("planSupplierSlipNo")
    private String planSupplierSlipNo;

    // ActualSupplierSlipNo
    @Column(name = "actual_supplier_slip_no")
    @JsonProperty("actualSupplierSlipNo")
    private String actualSupplierSlipNo;

    // CreateSlipType
    @Column(name = "create_slip_type")
    @JsonProperty("createSlipType")
    private String createSlipType;

    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    // SlipNote
    @Column(name = "slip_note")
    @JsonProperty("slipNote")
    private String slipNote;

    // PlanRepositoryId
    @Column(name = "plan_repository_id")
    @JsonProperty("planRepositoryId")
    private Long planRepositoryId;

    // ActualRepositoryId
    @Column(name = "actual_repository_id")
    @JsonProperty("actualRepositoryId")
    private Long actualRepositoryId;

    // BatchStatus
    @Column(name = "batch_status")
    @JsonProperty("batchStatus")
    private String batchStatus = "9";

    // SumPlanQuantity
    @Column(name = "sum_plan_quantity")
    @JsonProperty("sumPlanQuantity")
    private Long sumPlanQuantity;

    // SumActualQuantity
    @Column(name = "sum_actual_quantity")
    @JsonProperty("sumActualQuantity")
    private Long sumActualQuantity;

    // OutputStatus
    @Column(name = "output_status")
    @JsonProperty("outputStatus")
    private String outputStatus = "0";

    // IsClosed
    @Column(name = "is_closed")
    @JsonProperty("isClosed")
    private String isClosed = "0";

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

    // deliverDestinationName
    @Column(name = "deliver_destination_name")
    @JsonProperty("deliverDestinationName")
    private String deliverDestinationName;

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

    // deliverDestinationName
    @Column(name = "new_destination_name")
    @JsonProperty("newDestinationName")
    private String newDestinationName;

    // Checked
    @Column(name = "checked")
    @JsonProperty("checked")
    private String checked = "0";

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getPlanCustomerDeliveryDestinationId() {
        return planCustomerDeliveryDestinationId;
    }

    public void setPlanCustomerDeliveryDestinationId(Long planCustomerDeliveryDestinationId) {
        this.planCustomerDeliveryDestinationId = planCustomerDeliveryDestinationId;
    }

    public Long getActualCustomerDeliveryDestinationId() {
        return actualCustomerDeliveryDestinationId;
    }

    public void setActualCustomerDeliveryDestinationId(Long actualCustomerDeliveryDestinationId) {
        this.actualCustomerDeliveryDestinationId = actualCustomerDeliveryDestinationId;
    }

    public Long getPlanCustomerId() {
        return planCustomerId;
    }

    public void setPlanCustomerId(Long planCustomerId) {
        this.planCustomerId = planCustomerId;
    }

    public Long getActualCustomerId() {
        return actualCustomerId;
    }

    public void setActualCustomerId(Long actualCustomerId) {
        this.actualCustomerId = actualCustomerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPlanOutputDate() {
        return planOutputDate;
    }

    public void setPlanOutputDate(String planOutputDate) {
        this.planOutputDate = planOutputDate;
    }

    public String getPlanWorkingDate() {
        return planWorkingDate;
    }

    public void setPlanWorkingDate(String planWorkingDate) {
        this.planWorkingDate = planWorkingDate;
    }

    public String getPlanDeliverDate() {
        return planDeliverDate;
    }

    public void setPlanDeliverDate(String planDeliverDate) {
        this.planDeliverDate = planDeliverDate;
    }

    public String getActualOutputDate() {
        return actualOutputDate;
    }

    public void setActualOutputDate(String actualOutPutDate) {
        this.actualOutputDate = actualOutPutDate;
    }

    public String getActualDeliverDate() {
        return actualDeliverDate;
    }

    public void setActualDeliverDate(String actualDeliverDate) {
        this.actualDeliverDate = actualDeliverDate;
    }

    public String getPlanSupplierSlipNo() {
        return planSupplierSlipNo;
    }

    public void setPlanSupplierSlipNo(String planSupplierSlipNo) {
        this.planSupplierSlipNo = planSupplierSlipNo;
    }

    public String getActualSupplierSlipNo() {
        return actualSupplierSlipNo;
    }

    public void setActualSupplierSlipNo(String actualSupplierSlipNo) {
        this.actualSupplierSlipNo = actualSupplierSlipNo;
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

    public Long getPlanRepositoryId() {
        return planRepositoryId;
    }

    public void setPlanRepositoryId(Long planRepositoryId) {
        this.planRepositoryId = planRepositoryId;
    }

    public Long getActualRepositoryId() {
        return actualRepositoryId;
    }

    public void setActualRepositoryId(Long actualRepositoryId) {
        this.actualRepositoryId = actualRepositoryId;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public Long getSumPlanQuantity() {
        return sumPlanQuantity;
    }

    public void setSumPlanQuantity(Long sumPlanQuantity) {
        this.sumPlanQuantity = sumPlanQuantity;
    }

    public Long getSumActualQuantity() {
        return sumActualQuantity;
    }

    public void setSumActualQuantity(Long sumActualQuantity) {
        this.sumActualQuantity = sumActualQuantity;
    }

    public String getOutputStatus() {
        return outputStatus;
    }

    public void setOutputStatus(String outputStatus) {
        this.outputStatus = outputStatus;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
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

    public String getSlipNote() {
        return slipNote;
    }

    public void setSlipNote(String slipNote) {
        this.slipNote = slipNote;
    }

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

    public String getDeliverDestinationName() {
        return deliverDestinationName;
    }

    public void setDeliverDestinationName(String deliverDestinationName) {
        this.deliverDestinationName = deliverDestinationName;
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

}
