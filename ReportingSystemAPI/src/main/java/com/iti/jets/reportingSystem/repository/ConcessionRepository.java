package com.iti.jets.reportingSystem.repository;

import com.iti.jets.reportingSystem.entity.Concession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcessionRepository extends JpaRepository<Concession, Long> {
    Optional<Concession> findCustomerById(Long id);
}
