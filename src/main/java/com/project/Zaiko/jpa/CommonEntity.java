/////////////////////////////////////////////////////////////////////////////
//
// © 2022 API. All right reserved.
//
/////////////////////////////////////////////////////////////////////////////

package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

//import org.api.utils.DataUtil;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : Common Entity
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (TanDX)       Create new
*/
@MappedSuperclass
public abstract class CommonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // Delete flag
    @Column(name = "del_flg")
    @JsonProperty("delFlg")
    @JsonIgnore
    private String delFlg = "0";

    // Creation date
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", updatable = false)
    @JsonProperty("createDate")
    @JsonIgnore
    private Date createDate;

    // Creator ID
    @Column(name = "create_by", updatable = false)
    @JsonProperty("createBy")
    @JsonIgnore
    private Integer createBy;

    // Update date
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    @JsonProperty("updateDate")
    @JsonIgnore
    private Date updateDate;

    // Updater ID
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    @JsonIgnore
    private Integer updateBy;

    @PrePersist
    protected void onCreate() {
        this.createBy = 000001;
        this.updateBy = 000001;
    }

    @PreUpdate
    protected void onUpdate() {
    	Integer sUpdateBy;
        try {
            sUpdateBy = 000001;
        } catch (ClassCastException e) {
            sUpdateBy = this.updateBy;
        }
        this.updateBy = sUpdateBy;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}
