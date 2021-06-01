package com.iti.jets.reportingSystem.customer.service;

import com.iti.jets.reportingSystem.customer.repository.ConcessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionService {

    private final ConcessionRepository concessionRepository;

    @Autowired
    public ConcessionService(ConcessionRepository concessionRepository) {
        this.concessionRepository = concessionRepository;
    }


}
