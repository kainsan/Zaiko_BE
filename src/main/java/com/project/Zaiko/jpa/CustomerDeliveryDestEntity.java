package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T CustomerDeliveryDestEntity Of Entity.
 *
 * @author: (HuyNQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (HuyNQ)         Create new
*/
@Entity
@Table(name = "m_customer_delivery_dest")
@NamedQuery(name = "CustomerDeliveryDestEntity.findAll", query = "SELECT c FROM CustomerDeliveryDestEntity c")
public class CustomerDeliveryDestEntity extends CommonEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    // DeliveryDestinationId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_destination_id")
    @JsonProperty("deliveryDestinationId")
    private Long deliveryDestinationId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // CustomerId
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;

    //IsCustomer
    @Column(name = "is_customer")
    @JsonProperty("isCustomer")
    private String isCustomer;

    // DestinationCode
    @Column(name = "destination_code")
    @JsonProperty("destinationCode")
    private String destinationCode;

    // DepartmentName
    @Column(name = "department_name")
    @JsonProperty("departmentName")
    private String departmentName;

    // PicName
    @Column(name = "pic_name")
    @JsonProperty("picName")
    private String picName;

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

    // LeadTime
    @Column(name = "lead_time")
    @JsonProperty("leadTime")
    private Integer leadTime;

    // RouteCode
    @Column(name = "route_code")
    @JsonProperty("routeCode")
    private String routeCode;

    // CourseCode
    @Column(name = "course_code")
    @JsonProperty("courseCode")
    private String courseCode;

    //OutPutPriorityRank
    @Column(name = "output_priority_rank")
    @JsonProperty("outPutPriorityRank")
    private Integer outPutPriorityRank = 1;

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

    // Notes
    @Column(name = "notes", columnDefinition = "TEXT")
    @JsonProperty("notes")
    private String notes;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(String isCustomer) {
        this.isCustomer = isCustomer;
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

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
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

    public Integer getOutPutPriorityRank() {
        return outPutPriorityRank;
    }

    public void setOutPutPriorityRank(Integer outPutPriorityRank) {
        this.outPutPriorityRank = outPutPriorityRank;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getDeliveryDestinationId() {
        return deliveryDestinationId;
    }

    public void setDeliveryDestinationId(Long deliveryDestinationId) {
        this.deliveryDestinationId = deliveryDestinationId;
    }

    public String getDepartmentName() {
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

}
