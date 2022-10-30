/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import com.login.Ge;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Absa {
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
          public void insertD(Absi beanH){
        String query="insert into abscence values(id,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setFloat(1,beanH.getEmp());
           ps.setDate(2,(Date)beanH.getDat());
         
             ps.setString(3,beanH.getJus());
            
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
}
