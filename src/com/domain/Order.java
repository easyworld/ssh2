package com.domain;
// default package



/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order  implements java.io.Serializable {


    // Fields    

     private Integer OId;
     private User user;
     private Train train;
     private Byte carriageno;
     private Byte seatno;


    // Constructors

    /** default constructor */
    public Order() {
    }

    
    /** full constructor */
    public Order(User user, Train train, Byte carriageno, Byte seatno) {
        this.user = user;
        this.train = train;
        this.carriageno = carriageno;
        this.seatno = seatno;
    }

   
    // Property accessors

    public Integer getOId() {
        return this.OId;
    }
    
    public void setOId(Integer OId) {
        this.OId = OId;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return this.train;
    }
    
    public void setTrain(Train train) {
        this.train = train;
    }

    public Byte getCarriageno() {
        return this.carriageno;
    }
    
    public void setCarriageno(Byte carriageno) {
        this.carriageno = carriageno;
    }

    public Byte getSeatno() {
        return this.seatno;
    }
    
    public void setSeatno(Byte seatno) {
        this.seatno = seatno;
    }
   








}