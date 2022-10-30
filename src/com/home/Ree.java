/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

/**
 *
 * @author ruby
 */
public class Ree {  
    private int id;    
    private float Sa;
    private int grade;
    private int nb;
    private float l;
    

    public Ree(int id,float Sa,int grade,int nb,float l) {
        this.id=id;
        this.Sa = Sa;
        this.grade = grade;
           this.nb = nb;
              this.l = l;
    }


    public float getSa() {
        return Sa;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSa(float Sa) {
        this.Sa = Sa;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
}
