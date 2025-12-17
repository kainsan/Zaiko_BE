package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] InventoryOutputBkEntity.
 *
 * @author: (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/05      (ThinhNT)          Create table
*/
@Entity
@Table(name = "t_inventory_output_bk")
@NamedQuery(name = "InventoryOutputBkEntity.findAll", query = "SELECT iie FROM InventoryOutputBkEntity iie ")
public class InventoryOutputBkEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // inventoryOutputBkId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_output_bk_id")
    @JsonProperty("inventoryOutputBkId")
    private Long inventoryOutputBkId;
    
    //Company Id
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    // inventoryOutputId
    @Column(name = "inventory_output_id")
    @JsonProperty("inventoryOutputId")
    private Long inventoryOutputId;
    
    // ChangeDate
    @Column(name = "change_date")
    @JsonProperty("changeDate")
    private String changeDate;
    
    
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

    public Long getInventoryOutputBkId() {
        return inventoryOutputBkId;
    }

    public void setInventoryOutputBkId(Long inventoryOutputBkId) {
        this.inventoryOutputBkId = inventoryOutputBkId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getInventoryOutputId() {
        return inventoryOutputId;
    }

    public void setInventoryOutputId(Long inventoryOutputId) {
        this.inventoryOutputId = inventoryOutputId;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
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
