package com.iti.jets.reportingSystem.entity;
// Generated Jun 2, 2021, 9:20:41 PM by Hibernate Tools 6.0.0.Alpha2


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ShutinTypeLevel4 generated by hbm2java
 */
@Entity
@Table(name="shutin_type_level4"
    ,catalog="reportingsysschema"
)
public class ShutinTypeLevel4  implements java.io.Serializable {


     private int id;
     private ShutinTypeLevel3 shutinTypeLevel3;
     private String description;
     private Set<DailyActions> dailyActionses = new HashSet<DailyActions>(0);

    public ShutinTypeLevel4() {
    }

	
    public ShutinTypeLevel4(int id, ShutinTypeLevel3 shutinTypeLevel3, String description) {
        this.id = id;
        this.shutinTypeLevel3 = shutinTypeLevel3;
        this.description = description;
    }
    public ShutinTypeLevel4(int id, ShutinTypeLevel3 shutinTypeLevel3, String description, Set<DailyActions> dailyActionses) {
       this.id = id;
       this.shutinTypeLevel3 = shutinTypeLevel3;
       this.description = description;
       this.dailyActionses = dailyActionses;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sh_id_level3", nullable=false)
    public ShutinTypeLevel3 getShutinTypeLevel3() {
        return this.shutinTypeLevel3;
    }
    
    public void setShutinTypeLevel3(ShutinTypeLevel3 shutinTypeLevel3) {
        this.shutinTypeLevel3 = shutinTypeLevel3;
    }

    
    @Column(name="description", nullable=false, length=45)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="shutinTypeLevel4")
    public Set<DailyActions> getDailyActionses() {
        return this.dailyActionses;
    }
    
    public void setDailyActionses(Set<DailyActions> dailyActionses) {
        this.dailyActionses = dailyActionses;
    }




}


