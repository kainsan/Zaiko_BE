package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : Category2 Entity
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/19      (TanDX)       Create new
*/

@Entity
@Table(name = "m_category2")
@NamedQuery(name = "Category2Entity.findAll", query = "SELECT m FROM Category2Entity m")
public class Category2Entity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	// CompanyId
	@Id
	@Column(name = "company_id")
	@JsonProperty("companyId")
	private Integer companyId;

	// Code
	@Id
	@Column(name = "category_code")
	@JsonProperty("categoryCode")
	private String categoryCode;

	// Name
	@Column(name = "category_name")
	@JsonProperty("categoryName")
	private String categoryName;

	// SortIdx
	@Column(name = "sort_idx")
	@JsonProperty("sortIdx")
	private Integer sortIdx = 0;
	
	public Category2Entity() {
		super();
	}

	public Category2Entity(Integer companyId, String categoryCode, String categoryName) {
		this.companyId= companyId;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getSortIdx() {
		return sortIdx;
	}

	public void setSortIdx(Integer sortIdx) {
		this.sortIdx = sortIdx;
	}
}