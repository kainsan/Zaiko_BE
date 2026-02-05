package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.CourseEntity;
import com.project.Zaiko.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseEntity>> getCourses(@RequestParam String routeCode) {
        List<CourseEntity> courses = courseService.getCoursesByRouteCode(routeCode);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
