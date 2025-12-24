package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.UnitNameEntity;
import com.project.Zaiko.service.UnitNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UnitNameController {

    @Autowired
    private UnitNameService unitNameService;
    @GetMapping("/unit-name")
    public ResponseEntity<Page<UnitNameEntity>> getUnitName(){
        Page<UnitNameEntity> units = unitNameService.getAllUnitNames(0,100);
        return new ResponseEntity<>(units,HttpStatus.OK);
    }

}
