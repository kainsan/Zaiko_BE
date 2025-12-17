package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T CompanyEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_company")
@NamedQuery(name = "CompanyEntity.findAll", query = "SELECT m FROM CompanyEntity m")
public class CompanyEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	// CompanyId
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

	// CompanyName
    @Column(name = "company_name")
    @JsonProperty("companyName")
    private String companyName;

	// PhoneNumber1
    @Column(name = "phone_number1")
    @JsonProperty("phoneNumber1")
    private String phoneNumber1;

    // FaxNumber1
    @Column(name = "fax_number1")
    @JsonProperty("faxNumber1")
    private String faxNumber1;

    // PhoneNumber2
    @Column(name = "phone_number2")
    @JsonProperty("phoneNumber2")
    private String phoneNumber2;

    // FaxNumber2
    @Column(name = "fax_number2")
    @JsonProperty("faxNumber2")
    private String faxNumber2;

    // PostCode1
    @Column(name = "post_code1")
    @JsonProperty("postCode1")
    private String postCode1;

    // Address1_1
    @Column(name = "address1_1")
    @JsonProperty("address11")
    private String address11;

    // Address1_2
    @Column(name = "address1_2")
    @JsonProperty("address12")
    private String address12;

    // Address1_3
    @Column(name = "address1_3")
    @JsonProperty("address13")
    private String address13;

    // Address1_4
    @Column(name = "address1_4")
    @JsonProperty("address14")
    private String address14;

    // PostCode1
    @Column(name = "post_code2")
    @JsonProperty("postCode2")
    private String postCode2;

    // Address2_1
    @Column(name = "address2_1")
    @JsonProperty("address21")
    private String address21;

    // Address2_2
    @Column(name = "address2_2")
    @JsonProperty("address22")
    private String address22;

    // Address2_3
    @Column(name = "address2_3")
    @JsonProperty("address23")
    private String address23;

    // Address2_4
    @Column(name = "address2_4")
    @JsonProperty("address24")
    private String address24;

    // BankName
    @Column(name = "bank_name")
    @JsonProperty("bankName")
    private String bankName;

    // BankBranchName
    @Column(name = "bank_branch_name")
    @JsonProperty("bankBranchName")
    private String bankBranchName;

    // BankAccNumber
    @Column(name = "bank_acc_number")
    @JsonProperty("bankAccNumber")
    private String bankAccNumber;

    // BankAccHolder
    @Column(name = "bank_acc_holder")
    @JsonProperty("bankAccHolder")
    private String bankAccHolder;

    // Notes
    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;

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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getFaxNumber1() {
		return faxNumber1;
	}

	public void setFaxNumber1(String faxNumber1) {
		this.faxNumber1 = faxNumber1;
	}

	public String getPostCode1() {
		return postCode1;
	}

	public void setPostCode1(String postCode1) {
		this.postCode1 = postCode1;
	}

	public String getPostCode2() {
		return postCode2;
	}

	public void setPostCode2(String postCode2) {
		this.postCode2 = postCode2;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(String bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public String getBankAccHolder() {
		return bankAccHolder;
	}

	public void setBankAccHolder(String bankAccHolder) {
		this.bankAccHolder = bankAccHolder;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getAddress11() {
		return address11;
	}

	public void setAddress11(String address11) {
		this.address11 = address11;
	}

	public String getAddress12() {
		return address12;
	}

	public void setAddress12(String address12) {
		this.address12 = address12;
	}

	public String getAddress13() {
		return address13;
	}

	public void setAddress13(String address13) {
		this.address13 = address13;
	}

	public String getAddress21() {
		return address21;
	}

	public void setAddress21(String address21) {
		this.address21 = address21;
	}

	public String getAddress22() {
		return address22;
	}

	public void setAddress22(String address22) {
		this.address22 = address22;
	}

	public String getAddress23() {
		return address23;
	}

	public void setAddress23(String address23) {
		this.address23 = address23;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getFaxNumber2() {
		return faxNumber2;
	}

	public void setFaxNumber2(String faxNumber2) {
		this.faxNumber2 = faxNumber2;
	}

	public String getAddress14() {
		return address14;
	}

	public void setAddress14(String address14) {
		this.address14 = address14;
	}

	public String getAddress24() {
		return address24;
	}

	public void setAddress24(String address24) {
		this.address24 = address24;
	}
}
