package com.project.Zaiko.service;

import com.project.Zaiko.jpa.LocationEntity;
import com.project.Zaiko.repository.LocationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ILocationService implements LocationService {

    @Autowired
    private LocationRepository locationRepository;
    @Override
    public List<LocationEntity> findByRepositoryId(Long repositoryId) {

        return locationRepository.findByRepositoryId(repositoryId);
    }
}
