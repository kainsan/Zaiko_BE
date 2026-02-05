package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CourseEntity;

import java.util.List;

public interface ICourseService {
    List<CourseEntity> getCoursesByRouteCode(String routeCode);
}
