package com.iti.jets.reportingSystem.customer.controller;

import com.iti.jets.reportingSystem.customer.modle.Concession;
import com.iti.jets.reportingSystem.customer.modle.Field;
import com.iti.jets.reportingSystem.customer.service.ConcessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concessions")
public class ConcessionResource {

    private final ConcessionService customerService;

    @Autowired
    public ConcessionResource(ConcessionService customerService) {
        this.customerService = customerService;
    }

}
