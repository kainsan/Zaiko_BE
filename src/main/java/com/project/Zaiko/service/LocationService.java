package com.project.Zaiko.service;

import com.project.Zaiko.jpa.LocationEntity;

import java.util.List;

public interface LocationService {
    List<LocationEntity> findByRepositoryId(Long repositoryId);
}
