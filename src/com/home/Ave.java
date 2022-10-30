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
public class Ave {
    private int id;
    private int employé;
    private float avance;
     private Date date;

    public Ave(int id,int employé, float avance, Date date) {
        this.id=id;
        this.employé = employé;
        this.avance = avance;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployé() {
        return employé;
    }

    public void setEmployé(int employé) {
        this.employé = employé;
    }

    public float getAvance() {
        return avance;
    }

    public void setAvance(float avance) {
        this.avance = avance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
     
     
     
}
