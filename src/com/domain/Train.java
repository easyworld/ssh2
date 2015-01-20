package com.domain;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Train entity. @author MyEclipse Persistence Tools
 */

public class Train  implements java.io.Serializable {


    // Fields    

     private Integer TId;
     private String trainno;
     private String departure;
     private String arrive;
     private Date starttime;
     private Date endtime;
     private Set orders = new HashSet(0);


    // Constructors

    /** default constructor */
    public Train() {
    }

	/** minimal constructor */
    public Train(String trainno, String departure, String arrive, Date starttime, Date endtime) {
        this.trainno = trainno;
        this.departure = departure;
        this.arrive = arrive;
        this.starttime = starttime;
        this.endtime = endtime;
    }
    
    /** full constructor */
    public Train(String trainno, String departure, String arrive, Date starttime, Date endtime, Set orders) {
        this.trainno = trainno;
        this.departure = departure;
        this.arrive = arrive;
        this.starttime = starttime;
        this.endtime = endtime;
        this.orders = orders;
    }

   
    // Property accessors

    public Integer getTId() {
        return this.TId;
    }
    
    public void setTId(Integer TId) {
        this.TId = TId;
    }

    public String getTrainno() {
        return this.trainno;
    }
    
    public void setTrainno(String trainno) {
        this.trainno = trainno;
    }

    public String getDeparture() {
        return this.departure;
    }
    
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrive() {
        return this.arrive;
    }
    
    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public Date getStarttime() {
        return this.starttime;
    }
    
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return this.endtime;
    }
    
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }
   








}