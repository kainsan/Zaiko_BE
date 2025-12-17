package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T CourseEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_course")
@NamedQuery(name = "CourseEntity.findAll", query = "SELECT m FROM CourseEntity m")
public class CourseEntity extends CommonEntity  implements Serializable {
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

	// CourseCode
	@Id
	@Column(name = "course_code")
	@JsonProperty("courseCode")
	private String courseCode;

	// CourseName
	@Column(name = "course_name")
	@JsonProperty("courseName")
	private String courseName;

	//Notes
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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
