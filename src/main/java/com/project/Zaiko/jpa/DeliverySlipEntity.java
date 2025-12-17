package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T DeliverySlipEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/11/22      (TanDX)            Create new
*/

@Entity
@Table(name = "t_delivery_slip")
@NamedQuery(name = "DeliverySlipEntity.findAll", query = "SELECT b FROM DeliverySlipEntity b")
public class DeliverySlipEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // DeliverySlipId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_slip_id")
    @JsonProperty("deliverySlipId")
    private Long deliverySlipId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // DeliveryDate
    @Column(name = "delivery_date")
    @JsonProperty("deliveryDate")
    private String deliveryDate;

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

    // TextPrintStatus
    @Column(name = "text_print_status")
    @JsonProperty("textPrintStatus")
    private String textPrintStatus = "0";

    // OutputId
    @Column(name = "output_id")
    @JsonProperty("outputId")
    private Long outputId;

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

    // WorkingDate
    @Column(name = "working_date")
    @JsonProperty("workingDate")
    private String workingDate;

    // batchNo
    @Column(name = "batch_no")
    @JsonProperty("batchNo")
    private String batchNo;

    public Long getDeliverySlipId() {
        return deliverySlipId;
    }

    public void setDeliverySlipId(Long deliverySlipId) {
        this.deliverySlipId = deliverySlipId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
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

    public Long getOutputId() {
        return outputId;
    }

    public void setOutputId(Long outputId) {
        this.outputId = outputId;
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

    public String getTextPrintStatus() {
        return textPrintStatus;
    }

    public void setTextPrintStatus(String textPrintStatus) {
        this.textPrintStatus = textPrintStatus;
    }

	public String getWorkingDate() {
		return workingDate;
	}

	public void setWorkingDate(String workingDate) {
		this.workingDate = workingDate;
	}

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}
