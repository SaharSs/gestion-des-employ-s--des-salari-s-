/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Date;

/**
 *
 * @author ruby
 */
public class Ge {
 int id;
    private String firstname;
     private String lastname;
    private String email;
    private String password;
     private Date date;
    private String adresse;
    private int age;
    private int grade;
   private String role;
        public Ge(String firstname, String lastname, String email, String password,Date date, String adresse, int age, int grade,String role) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.password = password;
            this.date = date;
            this.adresse = adresse;
            this.age = age;
            this.grade = grade;
            this.role = role;
           
        }

    public Ge(int id, String firstname) {
        this.id = id;
         this.firstname = firstname;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date= date;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
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

    
    

   
    

