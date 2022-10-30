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
public class Deme {
    private int id;
    private int em;
    private Date dat;
    private Date dt;
    private int nb;
    private String status;
    private String tp;

    public Deme(int id, int em, Date dat,Date dt,int nb,String status,String tp) {
        this.id = id;
        this.em = em;
        this.dat = dat;
        this.dt = dt;
        this.nb=nb;
        this.status=status;
        this.tp=tp;
    }

    Deme(int id, int nb, String em) {
         this.id = id;
        this.nb = nb;
        this.status=em ;
   }
  Deme(int id, String status) {
         this.id = id;
       
        this.status=status ;
   }
    public int getNb() {
        return nb;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEm() {
        return em;
    }

    public void setEm(int em) {
        this.em = em;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }
    
    
}
