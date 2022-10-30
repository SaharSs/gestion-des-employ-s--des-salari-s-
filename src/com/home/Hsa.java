/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import com.login.Ge;
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
public class Hsa {
     public List<Hsi> loadD(){
         List<Hsi> list=new ArrayList<Hsi>();
           
        try {
            
            
            String query="select * from hs";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                 int emp=rs.getInt("emp");
                int nbr=rs.getInt("nbr");
                Date dt=rs.getDate("dt");
               
                Hsi be=new Hsi(id,emp,nbr,dt);
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
       public Hsi textF(int id){
      Hsi b=null;
      try{
            String query="select * from hs where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
              
                int nbr=rs.getInt("nbr");
             
                 
                 b=new Hsi(nbr);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
         public void upd(Hsi be){
      try{
            String query="update hs set emp=?,nbr=?,dt=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
        ps.setInt(1,be.getEmp());
           ps.setInt(2,be.getNbr());
            
         ps.setDate(3,(Date)be.getDate());
              ps.setInt(4,be.getId());
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
            String query="delete from hs where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"del");
      }catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      
     }
      }
     public void insertD(Hsi beanH){
        String query="insert into hs values(id,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setInt(1,beanH.getEmp());
           ps.setInt(2,beanH.getNbr());
            
         ps.setDate(3,(Date)beanH.getDate());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
}
