package com.project.Zaiko.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteId implements Serializable {

    private Integer companyId;
    private String routeCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RouteId)) return false;
        RouteId that = (RouteId) o;
        return Objects.equals(companyId, that.companyId)
                && Objects.equals(routeCode, that.routeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, routeCode);
    }
}
