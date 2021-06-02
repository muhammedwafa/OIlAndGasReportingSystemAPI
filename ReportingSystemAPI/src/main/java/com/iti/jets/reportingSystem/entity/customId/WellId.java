package com.iti.jets.reportingSystem.entity.customId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WellId implements Serializable {
    private long concessionId;
    private long fieldId;
    private long wellId;
}
