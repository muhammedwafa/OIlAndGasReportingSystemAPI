package com.iti.jets.reportingSystem.customer.modle;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Fields")
@Getter
@Setter
public class Field implements Serializable { //because it is gonna be transformed to so many forms, so it is recommended
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field_Id", nullable = false, updatable = false)
    private long id;


    private long concessionId;


    @Column(name = "field_Name")
    private String name;


    //mapping the many to many relationship
    @OneToMany(mappedBy = "filed")
    private List<Well> wells = new ArrayList<>();

}
