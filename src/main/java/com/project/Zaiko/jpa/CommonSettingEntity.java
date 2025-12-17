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
 * [OVERVIEW] : M Common Setting Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (TanDX)          Create new
*/
@Entity
@Table(name = "m_common_setting")
@NamedQuery(name = "CommonSettingEntity.findAll", query = "SELECT m FROM CommonSettingEntity m")
public class CommonSettingEntity extends CommonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // Common ID
    @Id
    @Column(name = "company_id")
    @JsonProperty("company_id")
    private Integer companyId;

    // Code
    @Id
    @Column(name = "code")
    @JsonProperty("code")
    private String code;

    // idx
    @Column(name = "idx")
    @JsonProperty("idx")
    private Integer idx;

    // Description
    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    // Value 1
    @Column(name = "value1")
    @JsonProperty("value1")
    private String value1;

    // Value 2
    @Column(name = "value2")
    @JsonProperty("value2")
    private String value2;

    // Value 3
    @Column(name = "value3")
    @JsonProperty("value3")
    private String value3;

    // Value 4
    @Column(name = "value4")
    @JsonProperty("value4")
    private String value4;

    // Value 5
    @Column(name = "value5")
    @JsonProperty("value5")
    private String value5;

    public CommonSettingEntity() {
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }
}