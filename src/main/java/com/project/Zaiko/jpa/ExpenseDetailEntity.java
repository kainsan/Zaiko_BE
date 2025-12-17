package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ExpenseDetailEntity Of Entity.
 *
 * @author: (HuyNQ)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/31     (HuyNQ)           Create new
*/

@Entity
@Table(name = "t_expense_detail  ")
@NamedQuery(name = "ExpenseDetailEntity.findAll", query = "SELECT e FROM ExpenseDetailEntity e")
public class ExpenseDetailEntity extends CommonEntity implements Serializable{
private static final long serialVersionUID = 1L;
    
    //ExpenseDetailId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_detail_id")
    @JsonProperty("expenseDetailId")
    private Long expenseDetailId;
     
    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;
    
    //ExpenseId
    @Column(name = "expense_id")
    @JsonProperty("expenseId")
    private Long expenseId;
    
    //ProductId
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;
    
    //ProductName
    @Column(name = "product_name")
    @JsonProperty("productName")
    private String productName;
    
    //Quantity
    @Column(name = "quantity")
    @JsonProperty("quantity")
    private Long quantity;
    
    //UnitPrice
    @Column(name = "unit_price")
    @JsonProperty("unitPrice")
    private BigDecimal unitPrice = new BigDecimal(0);
    
    //AmountTotal
    @Column(name = "amount_total")
    @JsonProperty("amountTotal")
    private BigDecimal amountTotal = new BigDecimal(0);
    
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

    public Long getExpenseDetailId() {
        return expenseDetailId;
    }

    public void setExpenseDetailId(Long expenseDetailId) {
        this.expenseDetailId = expenseDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
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
