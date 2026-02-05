package com.project.Zaiko.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseId implements Serializable {

    private Integer companyId;
    private String routeCode;
    private String courseCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseId)) return false;
        CourseId that = (CourseId) o;
        return Objects.equals(companyId, that.companyId)
                && Objects.equals(routeCode, that.routeCode)
                && Objects.equals(courseCode, that.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, routeCode, courseCode);
    }
}
