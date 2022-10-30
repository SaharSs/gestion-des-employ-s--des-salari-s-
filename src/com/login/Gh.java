/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.database.Db;
import com.home.Gre;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Gh {

 
     public HashMap<String, Integer>  pop(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select grade,id from grade");
            ResultSet  rs=ps.executeQuery();
      
        
          Gre cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
           String grade=rs.getString("grade");
                cmi=new Gre(id,grade);
               map.put(cmi.getName(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
      public void insertD(Ge beanH){
        String query="insert into users values(id,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,beanH.getFirstname());
            ps.setString(2,beanH.getLastname());
           ps.setDate(3,(Date)beanH.getDate());
            ps.setString(4,beanH.getEmail());
           ps.setString(5,beanH.getPassword());
         ps.setString(6,beanH.getAdresse());
               ps.setInt(7,beanH.getAge());
            
               ps.setInt(8,beanH.getGrade());
              ps.setString(9,beanH.getRole());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
         public boolean check(String email,String password){
         boolean b=false;
             String query="select email,password from users where email='"+email+"' AND password='"+password+"'";
        try {
            Statement st=Db.con.createStatement();
            st.executeQuery(query);
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null,"invalid"); 
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
     }
        
    
}
