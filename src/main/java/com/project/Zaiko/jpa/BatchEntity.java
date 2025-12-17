package com.project.Zaiko.jpa;

import java.io.Serializable;




import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

/**
 * [OVERVIEW] : T BatchEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/10/17      (TanDX)            Create new
*/

@Entity
@Table(name = "t_batch")
@NamedQuery(name = "BatchEntity.findAll", query = "SELECT b FROM BatchEntity b")
public class BatchEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // BatchId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id")
    @JsonProperty("batchId")
    private Long batchId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // Name
    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // PlanWorkingDate
    @Column(name = "plan_working_date")
    @JsonProperty("planWorkingDate")
    private String planWorkingDate;

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

    // planDeliveryDate
//    @Column(name = "plan_delivery_date")
//    @JsonProperty("planDeliveryDate")
//    private String planDeliveryDate;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getPlanWorkingDate() {
        return planWorkingDate;
    }

    public void setPlanWorkingDate(String planWorkingDate) {
        this.planWorkingDate = planWorkingDate;
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

    public BatchEntity() {
        super();
    }

    public BatchEntity(String name, String slipNo, Long repositoryId, String planWorkingDate, String inventoryId) {
        super();
        this.name = name;
        this.repositoryId = repositoryId;
        this.planWorkingDate = planWorkingDate;
    }

	public BatchEntity(Long batchId, String name, String slipNo, Long repositoryId, String planWorkingDate) {
		super();
		this.batchId = batchId;
		this.name = name;
		this.repositoryId = repositoryId;
		this.planWorkingDate = planWorkingDate;
	}

}
