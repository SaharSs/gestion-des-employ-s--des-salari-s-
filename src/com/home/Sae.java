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
public class Sae {
      private int id;    
    private String no;
    
    private float av;
    private float sa;
    private float cn;
    private int hs ;
    private int ab ;
   private int saf;

    public Sae(int id, String no, float av, float sa, float cn, int hs, int ab, int saf) {
        this.id = id;
        this.no = no;
        this.av = av;
        this.sa = sa;
        this.cn = cn;
        this.hs = hs;
        this.ab = ab;
        this.saf = saf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public float getAv() {
        return av;
    }

    public void setAv(float av) {
        this.av = av;
    }

    public float getSa() {
        return sa;
    }

    public void setSa(float sa) {
        this.sa = sa;
    }

    public float getCn() {
        return cn;
    }

    public void setCn(float cn) {
        this.cn = cn;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getSaf() {
        return saf;
    }

    public void setSaf(int saf) {
        this.saf = saf;
    }
   
    
}
