package com.project.Zaiko.service;

import com.project.Zaiko.jpa.RouteEntity;
import java.util.List;

public interface IRouteService {
    List<RouteEntity> getRoutes();
}
