package com.iti.jets.reportingSystem.customer.repository;

import com.iti.jets.reportingSystem.customer.modle.Concession;
import com.iti.jets.reportingSystem.customer.modle.Field;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcessionRepository extends JpaRepository<Concession, Long> {
    Optional<Concession> findCustomerById(Long id);
}
