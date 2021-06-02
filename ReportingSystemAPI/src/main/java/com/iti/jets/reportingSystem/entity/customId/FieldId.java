package com.iti.jets.reportingSystem.entity.customId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FieldId implements Serializable {
    private long concessionId;
    private long fieldId;
}
