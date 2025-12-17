package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] OrderEntity.
 *
 * @author: (HuyNHM)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/11/10     (HuyNHM)          Create table
*/

@Entity
@Table(name = "t_order")
@NamedQuery(name = "OrderEntity.findAll", query = "SELECT od FROM OrderEntity od ")
public class OrderEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // orderId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    @JsonProperty("orderId")
    private Long orderId;
    
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // orderDate
    @Column(name = "order_date")
    @JsonProperty("orderDate")
    private String orderDate;
    
    // deliveryDate
    @Column(name = "delivery_date ")
    @JsonProperty("deliveryDate ")
    private String deliveryDate;
    
    // orderType
    @Column(name = "order_type")
    @JsonProperty("orderType")
    private String orderType = "0";
    
    // orderStatus
    @Column(name = "order_status")
    @JsonProperty("orderStatus")
    private String orderStatus = "0";
    
    // slipNote
    @Column(name = "slip_notes")
    @JsonProperty("slipNotes")
    private String slipNotes;
    
    // supplier_id
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;
    
    // customerId
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;
    
    // repositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // freeItem1
    @Column(name = "free_item1")
    @JsonProperty("freeItem1")
    private String freeItem1;
    
    // freeItem2
    @Column(name = "free_item2")
    @JsonProperty("freeItem2")
    private String freeItem2;
    
    // freeItem3
    @Column(name = "free_item3")
    @JsonProperty("freeItem3")
    private String freeItem3;
    
    // slipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;
    
    // supplier_delivery_destination_id
    @Column(name = "supplier_delivery_destination_id")
    @JsonProperty("supplierDeliveryDestinationId")
    private Long supplierDeliveryDestinationId;
    
    // maker_contact_note
    @Column(name = "maker_contact_note")
    @JsonProperty("makerContactNote")
    private String makerContactNote;
    
    // customer_delivery_destination_id
    @Column(name = "customer_delivery_destination_id")
    @JsonProperty("customerDeliveryDestinationId")
    private Long customerDeliveryDestinationId;
    
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
    
    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSlipNotes() {
        return slipNotes;
    }

    public void setSlipNotes(String slipNotes) {
        this.slipNotes = slipNotes;
    }

    public Long getSupplierDeliveryDestinationId() {
        return supplierDeliveryDestinationId;
    }

    public void setSupplierDeliveryDestinationId(Long supplierDeliveryDestinationId) {
        this.supplierDeliveryDestinationId = supplierDeliveryDestinationId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }
    

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getMakerContactNote() {
		return makerContactNote;
	}

	public void setMakerContactNote(String makerContactNote) {
		this.makerContactNote = makerContactNote;
	}

	public Long getCustomerDeliveryDestinationId() {
		return customerDeliveryDestinationId;
	}

	public void setCustomerDeliveryDestinationId(Long customerDeliveryDestinationId) {
		this.customerDeliveryDestinationId = customerDeliveryDestinationId;
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

