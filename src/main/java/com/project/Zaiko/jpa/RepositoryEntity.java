package com.project.Zaiko.jpa;

import java.io.Serializable;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * [OVERVIEW] : T Repository Of Entity.
 *
 * @author: (HUYNHM)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (HUYNHM)         Create new
*/

@Entity
@Table(name = "m_repository")
@NamedQuery(name = "RepositoryEntity.findAll", query = "SELECT m FROM RepositoryEntity m")
public class RepositoryEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	//Repository Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "repository_id")
	@JsonProperty("repositoryId")
	private Long repositoryId;
	//Company Id
	@Column(name = "company_id")
	@JsonProperty("companyId")
	private Integer companyId;
	//Repository Code
	@Column(name = "repository_code")
	@JsonProperty("repositoryCode")
	private String repositoryCode;
	//Repository Name
	@Column(name = "repository_name")
	@JsonProperty("repositoryName")
	private String repositoryName;
	//Phone Number1
	@Column(name = "phone_number1")
	@JsonProperty("phoneNumber1")
	private String phoneNumber1;
	//Fax Number1
	@Column(name = "fax_number1")
	@JsonProperty("faxNumber1")
	private String faxNumber1;
	//Post Code1
	@Column(name = "post_code1")
	@JsonProperty("postCode1")
	private String postCode1;
	//address11
	@Column(name = "address1_1")
	@JsonProperty("address11")
	private String address11;
	//address12
	@Column(name = "address1_2")
	@JsonProperty("address12")
	private String address12;
	//address13
	@Column(name = "address1_3")
	@JsonProperty("address13")
	private String address13;
	//address14
	@Column(name = "address1_4")
	@JsonProperty("address14")
	private String address14;
	//Phone Number2
	@Column(name = "phone_number2")
	@JsonProperty("phoneNumber2")
	private String phoneNumber2;
	//Fax Number2
	@Column(name = "fax_number2")
	@JsonProperty("faxNumber2")
	private String faxNumber2;
	//Post Code2
	@Column(name = "post_code2")
	@JsonProperty("postCode2")
	private String postCode2;
	//address21
	@Column(name = "address2_1")
	@JsonProperty("address21")
	private String address21;
	//address22
	@Column(name = "address2_2")
	@JsonProperty("address22")
	private String address22;
	//address23
	@Column(name = "address2_3")
	@JsonProperty("address23")
	private String address23;
	//address24
	@Column(name = "address2_4")
	@JsonProperty("address24")
	private String address24;
	//notes
	@Column(name = "notes")
	@JsonProperty("notes")
	private String notes;
	//free item1
	@Column(name = "free_item1")
	@JsonProperty("freeItem1")
	private String freeItem1;
	//free item2
	@Column(name = "free_item2")
	@JsonProperty("freeItem2")
	private String freeItem2;
	//free item3
	@Column(name = "free_item3")
	@JsonProperty("freeItem3")
	private String freeItem3;
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
	public String getRepositoryCode() {
		return repositoryCode;
	}
	public void setRepositoryCode(String repositoryCode) {
		this.repositoryCode = repositoryCode;
	}
	public String getRepositoryName() {
		return repositoryName;
	}
	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
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
	public String getAddress14() {
		return address14;
	}
	public void setAddress14(String address14) {
		this.address14 = address14;
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
	public String getPostCode2() {
		return postCode2;
	}
	public void setPostCode2(String postCode2) {
		this.postCode2 = postCode2;
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
	public String getAddress24() {
		return address24;
	}
	public void setAddress24(String address24) {
		this.address24 = address24;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
