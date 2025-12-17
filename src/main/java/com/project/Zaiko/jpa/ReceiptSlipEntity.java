package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] ReceiptSlipEntity.
 *
 * @author: (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/12/01      (ThinhNT)          Create table
*/

@Entity
@Table(name = "t_receipt_slip")
@NamedQuery(name = "ReceiptSlipEntity.findAll", query = "SELECT iie FROM ReceiptSlipEntity iie ")
public class ReceiptSlipEntity extends CommonEntity  implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    // ReceiptSlipId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_slip_id")
    @JsonProperty("receiptSlipId")
    private Long receiptSlipId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // receiptDate
    @Column(name = "receipt_date")
    @JsonProperty("receiptDate")
    private String receiptDate;

    // SlipNumber
    @Column(name = "slip_number")
    @JsonProperty("slipNumber")
    private Integer slipNumber;

    // SlipType
    @Column(name = "slip_type")
    @JsonProperty("slipType")
    private String slipType;

    // SlipNo
    @Column(name = "slip_no")
    @JsonProperty("slipNo")
    private String slipNo;

    // PrintStatus
    @Column(name = "print_status")
    @JsonProperty("printStatus")
    private String printStatus = "0";

    // OutputId
    @Column(name = "input_id")
    @JsonProperty("inputId")
    private Long inputId;

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

    public Long getReceiptSlipId() {
        return receiptSlipId;
    }

    public void setReceiptSlipId(Long receiptSlipId) {
        this.receiptSlipId = receiptSlipId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Integer getSlipNumber() {
        return slipNumber;
    }

    public void setSlipNumber(Integer slipNumber) {
        this.slipNumber = slipNumber;
    }

    public String getSlipType() {
        return slipType;
    }

    public void setSlipType(String slipType) {
        this.slipType = slipType;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public String getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
    }

    public Long getInputId() {
        return inputId;
    }

    public void setInputId(Long inputId) {
        this.inputId = inputId;
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
