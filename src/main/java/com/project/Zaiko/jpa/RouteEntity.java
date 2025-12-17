package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T RouteEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_route")
@NamedQuery(name = "RouteEntity.findAll", query = "SELECT m FROM RouteEntity m")
public class RouteEntity extends CommonEntity implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	// CompanyId
	@Id
	@Column(name = "company_id")
	@JsonProperty("companyId")
	private Integer companyId;

	// RouteCode
	@Id
	@Column(name = "route_code")
	@JsonProperty("routeCode")
	private String routeCode;

	// RouteName
	@Column(name = "route_name")
	@JsonProperty("routeName")
	private String routeName;

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

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
