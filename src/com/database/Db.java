/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Db {
      private static String url="";
    public static Connection con=null;
    private static void setURL(){
    url="jdbc:mysql://localhost:3306/ges";
    
}
  public static void setConnection() {
        
        try {
            setURL();
            con=DriverManager.getConnection(url,"sss","12589");
            if(con!=null){
              JOptionPane.showMessageDialog(null,"database successful");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error in database"+e);
       
        }
    }
}
