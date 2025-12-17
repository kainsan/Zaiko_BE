package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] InventoryInputBkEntity.
 *
 * @author: (ThinhNT)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/09/05      (ThinhNT)          Create table
*/

@Entity
@Table(name = "t_inventory_input_bk ")
@NamedQuery(name = "InventoryInputBkEntity.findAll", query = "SELECT iie FROM InventoryInputBkEntity iie ")
public class InventoryInputBkEntity extends CommonEntity  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // InventoryInputId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_input_bk_id")
    @JsonProperty("inventoryInputBkId")
    private Long inventoryInputBkId;
    
    // InventoryInputId
    @Column(name = "inventory_input_id")
    @JsonProperty("inventoryInputId")
    private Long inventoryInputId;
    
    //Company Id
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
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

    public Long getInventoryInputBkId() {
        return inventoryInputBkId;
    }

    public void setInventoryInputBkId(Long inventoryInputBkId) {
        this.inventoryInputBkId = inventoryInputBkId;
    }

    public Long getInventoryInputId() {
        return inventoryInputId;
    }

    public void setInventoryInputId(Long inventoryInputId) {
        this.inventoryInputId = inventoryInputId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
