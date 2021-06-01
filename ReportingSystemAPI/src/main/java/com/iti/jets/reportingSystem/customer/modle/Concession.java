package com.iti.jets.reportingSystem.customer.modle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "concession")
@Getter
@Setter
public class Concession implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concession_Id", nullable = false, updatable = false)
    private long id;

    @Column(name = "concession_Name")
    private String concessionName;


    //mapping the many to many relationship with the Fields

}
