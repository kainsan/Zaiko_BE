package com.project.Zaiko.controller;

import com.project.Zaiko.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<Map<String, Object>> getCategoriesByType(
            @RequestParam String categoryType
    ) {
        List<?> categories = categoryService.getCategoriesByType(categoryType);
        
        Map<String, Object> response = new HashMap<>();
        response.put("content", categories);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
