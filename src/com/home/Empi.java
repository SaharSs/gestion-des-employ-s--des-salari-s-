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
public class Empi {
       private int id;
    private String firstname;
     private String lastname;
        private String email;
    private Date dat;
    private String pass;
    private String adress;
        private int age;
    
    private int grade;
    private String role;

    public Empi(int id, String firstname, String lastname, String email, Date dat, String pass, String adress, int age, int grade,String role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dat = dat;
        this.pass = pass;
        this.adress = adress;
        this.age = age;
        this.grade = grade;
        this.role = role;
    }
     public Empi( String firstname, String lastname,Date dat, String email, String pass, String adress, int age, int grade,String role) {
        
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dat = dat;
        this.pass = pass;
        this.adress = adress;
        this.age = age;
        this.grade = grade;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
}
