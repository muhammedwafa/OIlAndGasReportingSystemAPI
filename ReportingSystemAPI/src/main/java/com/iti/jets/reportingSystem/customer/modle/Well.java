package com.iti.jets.reportingSystem.customer.modle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "well")
@Getter
@Setter
public class Well implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "well_Id", nullable = false, updatable = false)
    private long id;

    private long concessionId;
    private long fieldId;

    @Column(name = "well_name")
    private String wellName;

}
