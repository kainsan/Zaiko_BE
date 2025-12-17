package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] DailyProcessEntity.
 *
 * @author:  (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/23      (ThinhNT)       Create new
*/


@SuppressWarnings("unused")
@Entity
@Table(name = "t_daily_process")
@NamedQuery(name = "DailyProcessEntity.findAll", query = "SELECT dp FROM DailyProcessEntity dp")
public class DailyProcessEntity  extends CommonEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // DailyProcessId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "daily_process_id")
    @JsonProperty("dailyProcessId")
    private Long dailyProcessId;
    

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    
    // ProcessDate
    @Column(name = "process_date")
    @JsonProperty("processDate")
    private String processDate;
    
    // BusinessDate
    @Column(name = "business_date")
    @JsonProperty("businessDate")
    private String businessDate;
    
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

    public Long getDailyProcessId() {
        return dailyProcessId;
    }

    public void setDailyProcessId(Long dailyProcessId) {
        this.dailyProcessId = dailyProcessId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
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

   
}
