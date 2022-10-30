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
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Ca {
     public List<Deme> loadD(){
         List<Deme> list=new ArrayList<Deme>();
           
        try {
            
            
            String query="select * from con";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                int emp=rs.getInt("emp");
                Date dat=rs.getDate("dat");
                Date dt=rs.getDate("dt");
                int nbj=rs.getInt("nbj");
                String status=rs.getString("status");
                String tp=rs.getString("tp");
                
                Deme be=new Deme(id,emp,dat,dt,nbj,status,tp);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
      public void upd(Deme b){
      try{
            String query="update con set status=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,b.getStatus());
            
              ps.setInt(2,b.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
               
                
                
                
            
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      }         
       public Deme textF(int id){
      Deme b=null;
      try{
            String query="select * from con where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
                int nb=rs.getInt("nbj");
                String em=rs.getString("status");
                
                 b=new Deme(id,nb,em);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
    
}
