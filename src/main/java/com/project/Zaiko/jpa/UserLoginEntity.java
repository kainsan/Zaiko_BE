/////////////////////////////////////////////////////////////////////////////
//
// © 2022 API. All right reserved.
//
/////////////////////////////////////////////////////////////////////////////

package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] T Info Of User Login Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/0       (TanDX)           Create new
*/
@Entity
@Table(name = "t_user_login")
@NamedQuery(name = "UserLoginEntity.findAll", query = "SELECT m FROM UserLoginEntity m")
public class UserLoginEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    // User ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @JsonProperty("userId")
    private Integer userId;

    // User Name
    @Column(name = "user_name")
    @JsonProperty("userName")
    private String userName;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // Role
    @Column(name = "role")
    @JsonProperty("role")
    private Integer role;

    // Password
    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    // Mail
    @Column(name = "mail")
    @JsonProperty("mail")
    private String mail;

    // Birthday
    @Column(name = "birthDay")
    @JsonProperty("birthDay")
    private String birthDay;

    // Gender
    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    // Phone
    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    // Address
    @Column(name = "address")
    @JsonProperty("address")
    private String address;

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
    
    // RepositoryOfficeId
    @Column(name = "repository_office_id")
    @JsonProperty("repositoryOfficeId")
    private Long repositoryOfficeId;
    
    public UserLoginEntity() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Long getRepositoryOfficeId() {
		return repositoryOfficeId;
	}

	public void setRepositoryOfficeId(Long repositoryOfficeId) {
		this.repositoryOfficeId = repositoryOfficeId;
	}
}