package com.project.Zaiko.controller;

import com.project.Zaiko.dto.*;
import com.project.Zaiko.service.InventoryInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;



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
    public ResponseEntity<InventoryInputPlanDTO> getInventoryInputPlanById(@PathVariable Long id) {
        InventoryInputPlanDTO response = inventoryInputService.getInventoryInputPlanById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/inventory-input/inventory-input-actual/{id}")
    public ResponseEntity<InventoryInputActualDTO> getInventoryInputActualById(@PathVariable Long id) {
        InventoryInputActualDTO response = inventoryInputService.getInventoryInputActualById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/inventory-input/inventory-input-plan")
    public ResponseEntity<Void> createInventoryInputPlan(@RequestBody InventoryInputPlanRequest request) {
        System.out.println(request);
        inventoryInputService.createInventoryInputPlan(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/inventory-input/inventory-input-plan/{id}")
    public ResponseEntity<Void> updateInventoryInputPlan(@PathVariable Long id, @RequestBody InventoryInputPlanRequest request) {
        System.out.println(request);
        inventoryInputService.updateInventoryInputPlan(id, request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/inventory-input/inventory-input-actual/{id}")
    public ResponseEntity<Void> updateInventoryInputActual(@PathVariable Long id, @RequestBody InventoryInputActualRequest request) {
        System.out.println(request);
        inventoryInputService.updateInventoryInputActual(id, request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/inventory-input/inventory-input-plan/{id}")
    public ResponseEntity<Void> deleteInventoryInput(@PathVariable Long id) {
        inventoryInputService.deleteInventoryInput(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
