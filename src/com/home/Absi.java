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
public class Absi {
    private int id;
    private int emp;
    private Date dat;
    private String jus;

   

    public Absi(int id, int emp, Date dat, String jus) {
        this.id = id;
        this.emp = emp;
        this.dat = dat;
        this.jus = jus;
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

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public String getJus() {
        return jus;
    }

    public void setJus(String jus) {
        this.jus = jus;
    }
    
}
