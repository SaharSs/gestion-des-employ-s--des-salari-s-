/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
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
public class Rea {
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
        public List<Ree> loadD(){
         List<Ree> list=new ArrayList<Ree>();
           
        try {
            
            
            String query="select * from re";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                 int sa=rs.getInt("sa");
                int grade=rs.getInt("grade");
                int nbj=rs.getInt("nbj");
               float ph=rs.getFloat("ph");
                Ree be=new Ree(id,sa,grade,nbj,ph);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
       public void insertD(Ree beanH){
        String query="insert into re values(id,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setFloat(1,beanH.getSa());
           ps.setInt(2,beanH.getGrade());
             ps.setInt(3,beanH.getNb());
               ps.setFloat(4,beanH.getL());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    
}
