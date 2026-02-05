package com.project.Zaiko.service;

import com.project.Zaiko.jpa.CourseEntity;
import com.project.Zaiko.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseEntity> getCoursesByRouteCode(String routeCode) {
        return courseRepository.getCoursesByRouteCode(routeCode);
    }
}
