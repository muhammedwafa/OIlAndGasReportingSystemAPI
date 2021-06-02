package com.iti.jets.reportingSystem.entity;
// Generated Jun 2, 2021, 9:20:41 PM by Hibernate Tools 6.0.0.Alpha2


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DailyActions generated by hbm2java
 */
@Entity
@Table(name="daily_actions"
    ,catalog="reportingsysschema"
)
public class DailyActions  implements java.io.Serializable {


     private int id;
     private Well well;
     private ShutinTypeLevel4 shutinTypeLevel4;
     private Date date;
     private String actionDescription;
     private Double netProduction;
     private Float downTime;
     private Double losses;

    public DailyActions() {
    }

	
    public DailyActions(int id, Well well, ShutinTypeLevel4 shutinTypeLevel4, Date date, String actionDescription) {
        this.id = id;
        this.well = well;
        this.shutinTypeLevel4 = shutinTypeLevel4;
        this.date = date;
        this.actionDescription = actionDescription;
    }
    public DailyActions(int id, Well well, ShutinTypeLevel4 shutinTypeLevel4, Date date, String actionDescription, Double netProduction, Float downTime, Double losses) {
       this.id = id;
       this.well = well;
       this.shutinTypeLevel4 = shutinTypeLevel4;
       this.date = date;
       this.actionDescription = actionDescription;
       this.netProduction = netProduction;
       this.downTime = downTime;
       this.losses = losses;
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
    @JoinColumn(name="well_id", nullable=false)
    public Well getWell() {
        return this.well;
    }
    
    public void setWell(Well well) {
        this.well = well;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="si_type_level4", nullable=false)
    public ShutinTypeLevel4 getShutinTypeLevel4() {
        return this.shutinTypeLevel4;
    }
    
    public void setShutinTypeLevel4(ShutinTypeLevel4 shutinTypeLevel4) {
        this.shutinTypeLevel4 = shutinTypeLevel4;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="action_description", nullable=false, length=5000)
    public String getActionDescription() {
        return this.actionDescription;
    }
    
    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    
    @Column(name="net_production", precision=22, scale=0)
    public Double getNetProduction() {
        return this.netProduction;
    }
    
    public void setNetProduction(Double netProduction) {
        this.netProduction = netProduction;
    }

    
    @Column(name="down_time", precision=12, scale=0)
    public Float getDownTime() {
        return this.downTime;
    }
    
    public void setDownTime(Float downTime) {
        this.downTime = downTime;
    }

    
    @Column(name="losses", precision=22, scale=0)
    public Double getLosses() {
        return this.losses;
    }
    
    public void setLosses(Double losses) {
        this.losses = losses;
    }




}


