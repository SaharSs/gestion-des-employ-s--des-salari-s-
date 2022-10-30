/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Empa {
    
    public List<Empi> loadD(){
         List<Empi> list=new ArrayList<Empi>();
           
        try {
            
            
            String query="select * from users";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                  Date sqd=rs.getDate("date");
                String email=rs.getString("email");
                 String password=rs.getString("password");
                 String adress=rs.getString("adress");
                  int ag=rs.getInt("age");
               int idc=rs.getInt("grade");
                 String role=rs.getString("role");
               
                 Empi be=new Empi(id,firstname,lastname,email,sqd,password,adress,ag,idc,role);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
     public HashMap<String, Integer>  pop(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select grade,id from grade");
            ResultSet  rs=ps.executeQuery();
      
        
          Gre cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
            String name=rs.getString("grade");
                cmi=new Gre(id,name);
               map.put(cmi.getName(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
      public Empi textF(int id){
      Empi b=null;
      try{
            String query="select * from users where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
                String firstname=rs.getString("firstname");
                  String lastname=rs.getString("lastname");
                  Date sqd=rs.getDate("date");
                String email=rs.getString("email");
                String password=rs.getString("password");
                String adress=rs.getString("adress");
                int age=rs.getInt("age");
                int idc=rs.getInt("grade");
                String role=rs.getString("role");
                 
                 b=new Empi(firstname,lastname,sqd,email,password,adress,age,idc,role);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
        public void upd(Empi be){
      try{
            String query="update users set firstname=?,lastname=?,date=?,email=?,password=?,adress=?,age=?,grade=?,role=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
          ps.setString(1,be.getFirstname());
            ps.setString(2,be.getLastname());
              ps.setDate(3,(Date)be.getDat());
            ps.setString(4,be.getEmail());
          
            ps.setString(5,be.getPass());
            ps.setString(6,be.getAdress());
            ps.setInt(7,be.getAge());            
            ps.setInt(8,be.getGrade());            
            ps.setString(9,be.getRole()); 
              ps.setInt(10,be.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
               
                
                
                
            
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      }     
        public void del(int id){
     int y=JOptionPane.showConfirmDialog(null,"do you want to delete","delete",JOptionPane.YES_NO_OPTION);
     if(y==0){ 
     try{
            String query="delete from users where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"del");
      }catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      
     }
      }
      
     public void insertD(Empi  be){
        String query="insert into users values(id,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,be.getFirstname());
            ps.setString(2,be.getLastname());
              ps.setDate(3,(Date)be.getDat());
            ps.setString(4,be.getEmail());
          
            ps.setString(5,be.getPass());
            ps.setString(6,be.getAdress());
            ps.setInt(7,be.getAge());            
            ps.setInt(8,be.getGrade());            
            ps.setString(9,be.getRole());   
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    
}
