package com.project.Zaiko.service;

import com.project.Zaiko.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private Category1Repository category1Repository;

    @Autowired
    private Category2Repository category2Repository;

    @Autowired
    private Category3Repository category3Repository;

    @Autowired
    private Category4Repository category4Repository;

    @Autowired
    private Category5Repository category5Repository;

    @Override
    public List<?> getCategoriesByType(String categoryType) {
        return switch (categoryType) {
            case "1" -> category1Repository.findAll();
            case "2" -> category2Repository.findAll();
            case "3" -> category3Repository.findAll();
            case "4" -> category4Repository.findAll();
            case "5" -> category5Repository.findAll();
            default -> throw new IllegalArgumentException("Invalid category type: " + categoryType);
        };
    }
}
