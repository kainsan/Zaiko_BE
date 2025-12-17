package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * [OVERVIEW] : T ReasonEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_reason")
@NamedQuery(name = "ReasonEntity.findAll", query = "SELECT m FROM ReasonEntity m")
public class ReasonEntity extends CommonEntity implements Serializable {
    /**
    *
    */
   private static final long serialVersionUID = 1L;

   // CompanyId
   @Id
   @Column(name = "company_id")
   @JsonProperty("companyId")
   private Integer companyId;

   // Reason
   @Id
   @Column(name = "reason")
   @JsonProperty("reason")
   private String reason;

   // ReasonCode
   @Id
   @Column(name = "reason_code")
   @JsonProperty("reasonCode")
   private String reasonCode;

   // ReasonContent
   @Column(name = "reason_content")
   @JsonProperty("reasonContent")
   private String reasonContent;
   
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
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getReasonCode() {
        return reasonCode;
    }
    
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    
    public String getReasonContent() {
        return reasonContent;
    }
    
    public void setReasonContent(String reasonContent) {
        this.reasonContent = reasonContent;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
   
   
}
