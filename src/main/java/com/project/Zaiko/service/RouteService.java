package com.project.Zaiko.service;

import com.project.Zaiko.jpa.RouteEntity;
import com.project.Zaiko.repository.RouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RouteService implements IRouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public List<RouteEntity> getRoutes() {
        return routeRepository.getAllRoutes();
    }
}
