package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.RouteEntity;
import com.project.Zaiko.jpa.RouteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, RouteId> {
    @Query(
            value = "SELECT * FROM m_route",
            nativeQuery = true
    )
    List<RouteEntity> getAllRoutes();
}
