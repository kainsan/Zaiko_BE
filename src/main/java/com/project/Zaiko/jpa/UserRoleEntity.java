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
 * [OVERVIEW]  T Info Of User Role Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (TanDX)           Create new
*/
@Entity
@Table(name = "t_user_role")
@NamedQuery(name = "UserRoleEntity.findAll", query = "SELECT m FROM UserRoleEntity m")
public class UserRoleEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    // Role ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    @JsonProperty("roleId")
    private Integer roleId;

    // User ID
    @Column(name = "user_id")
    @JsonProperty("userId")
    private Integer userId;

    // Role
    @Column(name = "role")
    @JsonProperty("role")
    private String role;

    public UserRoleEntity() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
