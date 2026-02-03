package com.project.Zaiko.controller;

import com.project.Zaiko.dto.InventoryOutputDTO;
import com.project.Zaiko.dto.InventoryOutputSearchParams;
import com.project.Zaiko.dto.PageResponse;
import com.project.Zaiko.service.IInventoryOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InventoryOutputController {

    @Autowired
    private IInventoryOutputService inventoryOutputService;

    @PostMapping("/inventory-output/search")
    public ResponseEntity<PageResponse<InventoryOutputDTO>> searchInventoryOutputs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "50") int limit,
            @RequestBody InventoryOutputSearchParams request
    ) {
        Pageable pageable = org.springframework.data.domain.PageRequest.of(page, limit);
        PageResponse<InventoryOutputDTO> response = inventoryOutputService.searchInventoryOutputs(request, pageable);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
