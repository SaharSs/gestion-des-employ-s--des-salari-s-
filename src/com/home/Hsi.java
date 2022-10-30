/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import java.util.Date;

/**
 *
 * @author ruby
 */
public class Hsi {
    private int id;
    private int emp;
    private int nbr;
    private Date date;

    public Hsi(int id, int emp, int nbr, Date date) {
        this.id = id;
        this.emp = emp;
        this.nbr = nbr;
        this.date = date;
    }
 public Hsi( int nbr) {
        this.nbr = nbr;
       
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
