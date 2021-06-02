package com.iti.jets.reportingSystem.entity;

import com.iti.jets.reportingSystem.entity.customId.FieldId;
import com.iti.jets.reportingSystem.entity.customId.WellId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "well")
@Getter
@Setter
public class Well implements Serializable {

    @EmbeddedId
    private WellId wellId;

    @Column(name = "well_name")
    private String wellName;

//    @ManyToOne
//    @JoinColumn(name = "fieldId")
//    private FieldId fieldId;

}
