package com.project.Zaiko.service;

import com.project.Zaiko.jpa.UnitNameEntity;
import com.project.Zaiko.repository.UnitNameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IUnitNameService implements UnitNameService{
    @Autowired
    private UnitNameRepository unitNameRepository;
    @Override
    public Page<UnitNameEntity> getAllUnitNames(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return unitNameRepository.getAllUnitNames(pageable);
    }
}
