package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.LocationEntity;
import com.project.Zaiko.service.ILocationService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
    List<LocationEntity> findByRepositoryId(Long id);
}
