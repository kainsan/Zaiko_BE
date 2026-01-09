package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.CustomerDeliveryDestEntity;
import com.project.Zaiko.service.ICustomerDeliveryDestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerDeliveryDestController {

    @Autowired
    private ICustomerDeliveryDestService customerDeliveryDestService;

    @GetMapping("/delivery-destinations")
    public ResponseEntity<Page<CustomerDeliveryDestEntity>> getDeliveryDestinations(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int limit) {
        Page<CustomerDeliveryDestEntity> destinations = customerDeliveryDestService.getDeliveryDestinations(page, limit);
        return new ResponseEntity<>(destinations, HttpStatus.OK);
    }
}
