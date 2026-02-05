package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.RouteEntity;
import com.project.Zaiko.service.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RouteController {

    @Autowired
    private IRouteService routeService;

    @GetMapping("/routes")
    public ResponseEntity<List<RouteEntity>> getRoutes() {
        List<RouteEntity> routes = routeService.getRoutes();
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }
}
