package com.project.Zaiko.service;

import com.project.Zaiko.jpa.UnitNameEntity;
import org.springframework.data.domain.Page;


public interface UnitNameService {
    public Page<UnitNameEntity> getAllUnitNames( int page, int size);
}
