package com.iti.jets.reportingSystem.controller;

import com.iti.jets.reportingSystem.service.ConcessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concessions")
public class ConcessionResource {

    private final ConcessionService customerService;

    @Autowired
    public ConcessionResource(ConcessionService customerService) {
        this.customerService = customerService;
    }

}
