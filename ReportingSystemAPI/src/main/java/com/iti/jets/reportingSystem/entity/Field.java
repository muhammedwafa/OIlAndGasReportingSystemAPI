package com.iti.jets.reportingSystem.entity;


import com.iti.jets.reportingSystem.entity.customId.FieldId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Fields")
@Getter
@Setter
public class Field implements Serializable { //because it is gonna be transformed to so many forms, so it is recommended

    @EmbeddedId
    private FieldId fieldId;

    @Column(name = "field_Name")
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "concession_Id", nullable = false)
//    private Concession concession;

    @OneToMany
    private Set<Well> wells = new HashSet<>();
}
