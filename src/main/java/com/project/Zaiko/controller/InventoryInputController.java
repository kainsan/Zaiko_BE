package com.project.Zaiko.controller;

import com.project.Zaiko.dto.InventoryInputDTO;
import com.project.Zaiko.dto.PageResponse;
import com.project.Zaiko.service.InventoryInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Zaiko.dto.SearchInventoryInputRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryInputController {

    @Autowired
    private InventoryInputService inventoryInputService;

    @GetMapping("/inventory-input")
    public ResponseEntity<PageResponse<InventoryInputDTO>> getInventoryInputs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int limit
    ) {
        PageResponse<InventoryInputDTO> response = inventoryInputService.getInventoryInputs(page, limit);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/inventory-input/search")
    public ResponseEntity<PageResponse<InventoryInputDTO>> searchInventoryInputs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int limit,
            @RequestBody SearchInventoryInputRequest request
    ) {

        PageResponse<InventoryInputDTO> response = inventoryInputService.searchInventoryInputs(request, page, limit);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/inventory-input/inventory-input-plan/{id}")
    public ResponseEntity<?> getInventoryInputPlanById(@PathVariable Long id) {
        List<Object> response = inventoryInputService.getInventoryInputPlanById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
