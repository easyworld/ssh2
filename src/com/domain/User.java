package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer UId;
     private String username;
     private String password;
     private Boolean isadmin;
     private Set orders = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String username, String password, Boolean isadmin) {
        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
    }
    
    /** full constructor */
    public User(String username, String password, Boolean isadmin, Set orders) {
        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
        this.orders = orders;
    }

   
    // Property accessors

    public Integer getUId() {
        return this.UId;
    }
    
    public void setUId(Integer UId) {
        this.UId = UId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsadmin() {
        return this.isadmin;
    }
    
    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }
   








}