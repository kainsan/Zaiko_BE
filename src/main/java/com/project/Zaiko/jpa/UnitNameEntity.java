package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] T UnitNameEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/08/19       (TanDX)           Create new
*/
@Entity
@Table(name = "m_unit_name")
@NamedQuery(name = "UnitNameEntity.findAll", query = "SELECT m FROM UnitNameEntity m")
public class UnitNameEntity extends CommonEntity implements Serializable {

	private static final long serialVersionUID = 1L;

    // CompanyId
    @Id
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // UnitCode
    @Id
    @Column(name = "unit_code")
    @JsonProperty("unitCode")
    private String unitCode;

    // UnitNameController
    @Column(name = "unit_name")
    @JsonProperty("unitName")
    private String unitName;

    // Notes
    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
