/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Gra {
      public List<Gre> loadD(){
         List<Gre> list=new ArrayList<Gre>();
           
        try {
            
            
            String query="select * from grade";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                 String grade=rs.getString("grade");
          
               
                Gre be=new Gre(id,grade);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
    
      public void insertD(Gre beanH){
        String query="insert into grade values(id,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,beanH.getName());
         
            
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    
    
}
