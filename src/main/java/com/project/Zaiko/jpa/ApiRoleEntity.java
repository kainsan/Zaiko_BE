/////////////////////////////////////////////////////////////////////////////
//
// © 2022 API. All right reserved.
//
/////////////////////////////////////////////////////////////////////////////

package com.project.Zaiko.jpa;

import java.io.Serializable;



import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

/**
 * [OVERVIEW] T Api Role Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (TanDX)         Create new
*/
@Entity
@Table(name = "t_api_role")
@NamedQuery(name = "ApiRoleEntity.findAll", query = "SELECT m FROM ApiRoleEntity m")
public class ApiRoleEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    // API Code
    @Id
    @Column(name = "api_code")
    @JsonProperty("api_code")
    private String apiCode;

    // API_url
    @Column(name = "api_url")
    @JsonProperty("api_url")
    private String apiUrl;

    @Column(name = "method")
    @JsonProperty("method")
    private String method;

    // API_role
    @Column(name = "api_role")
    @JsonProperty("api_role")
    private String apiRole;

    @Column(name = "is_public")
    @JsonProperty("is_public")
    private String isPublic;

    public ApiRoleEntity() {
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getApiRole() {
        return apiRole;
    }

    public void setApiRole(String apiRole) {
        this.apiRole = apiRole;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }
}
