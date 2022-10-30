/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import com.login.Ge;
import com.login.Gh;
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
public class Ava {
     public List<Ave> loadD(){
         List<Ave> list=new ArrayList<Ave>();
           
        try {
            
            
            String query="select * from av";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                 int empl=rs.getInt("empl");
                float avance=rs.getFloat("avance");
                Date date=rs.getDate("date");
               
                Ave be=new Ave(id,empl,avance,date);
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
              PreparedStatement ps=Db.con.prepareStatement("select id,firstname from users");
            ResultSet  rs=ps.executeQuery();
      
        
          Ge cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
           String firstname=rs.getString("firstname");
          
           
                cmi=new Ge(id,firstname);
               map.put(cmi.getFirstname(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
       public void insertD(Ave beanH){
        String query="insert into av values(id,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setFloat(1,beanH.getEmployé());
           ps.setFloat(2,beanH.getAvance());
           ps.setDate(3,(Date)beanH.getDate());
            
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    
}
