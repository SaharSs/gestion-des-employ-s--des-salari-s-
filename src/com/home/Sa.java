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
import java.time.Month;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Sa extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sa
     */
    public Sa() {
        initComponents();
        BindCombo();
        BindCom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gr = new javax.swing.JComboBox<>();
        em = new javax.swing.JComboBox<>();
        mo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        av = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hs = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ab = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        saf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ye = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1350, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Salaire");

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        em.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        mo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "janvier", "f??vrier", "mars", "avril", "mai", "juin", "juillet", "aout", "september", "october", "november", "d??cembre", " ", " ", " ", " " }));

        jLabel3.setText("Nom");

        jLabel4.setText("par h");

        jLabel5.setText("salaire");

        jLabel6.setText("Avance");

        jLabel7.setText("cnss");

        jLabel8.setText("hs");

        jLabel9.setText("ab");

        jLabel10.setText("sa f");

        jButton2.setText("insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ye, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hs, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton2))
                                            .addComponent(saf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(846, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(saf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Float lee=Float.parseFloat(ph.getText());
        System.out.println(lee);
        int l=Integer.parseInt(sa.getText());
        System.out.println(l);
          Float le=Float.parseFloat(av.getText());
          Float k=Float.parseFloat(cn.getText()); 
        int ju=Integer.parseInt(hs.getText());
          int j=Integer.parseInt(ab.getText());
          float gu=l+(ju*lee)-(j*lee)-le-k;
           saf.setText(Float.toString(gu));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Saa mq = new Saa();
        HashMap<String, Integer> map = mq.pop();
        int idu=map.get(em.getSelectedItem());
                Saa m = new Saa();
        HashMap<String, Integer> ma = m.po();
        int ide=ma.get(gr.getSelectedItem());
       int mois=mo.getSelectedIndex();
        int y=Integer.parseInt(ye.getText());
         int i=0;
         int j=0;
         int t=0;
        try {
              PreparedStatement ps=Db.con.prepareStatement("select id,firstname,lastname  from users where id="+idu);
            ResultSet  rs=ps.executeQuery();
      
        
          Ge cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
           String firstname=rs.getString("firstname");
           String lastname=rs.getString("lastname");
           System.out.println(firstname);
 no.setText(firstname);
 
         
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
       try {
              PreparedStatement ps=Db.con.prepareStatement("select id,sa,ph  from re where id="+ide);
            ResultSet  rs=ps.executeQuery();
            
        
          Ge cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
                int se=rs.getInt("sa");
           float p=rs.getFloat("ph");
           
       
 sa.setText(Integer.toString(se));
 ph.setText(Float.toString(p));
         double td=(se*7.5)/100;
         cn.setText(Double.toString(td));
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
       try {
              PreparedStatement ps=Db.con.prepareStatement("select date, id,emp from abscence where emp="+idu);
            ResultSet  rs=ps.executeQuery();
       
       
          Ge cmi;
                    
           while(rs.next()){
                Date  date=rs.getDate("date");
               
               Calendar cal = Calendar.getInstance();
cal.setTime(date);
int month = cal.get(Calendar.MONTH)+1;
int yea = cal.get(Calendar.YEAR);
if((month==mois) && (yea==y)) {
i++;
}
//int year = cal.get(Calendar.YEAR);
System.out.println(month);



           
                          

           }
           
           System.out.println(i);
 ab.setText(Integer.toString(i));       
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
        
        
          try {
              PreparedStatement ps=Db.con.prepareStatement("select dt,nbr, id,emp from hs where emp="+idu);
            ResultSet  rs=ps.executeQuery();
       
       
          Ge cmi;
                    
           while(rs.next()){
                Date  date=rs.getDate("dt");
               
                 int nb=rs.getInt("nbr");
               
               Calendar cal = Calendar.getInstance();
cal.setTime(date);
int month = cal.get(Calendar.MONTH)+1;
int yea = cal.get(Calendar.YEAR);
if((month==mois) && (yea==y)) {
j=j+nb;
}
//int year = cal.get(Calendar.YEAR);
System.out.println(month);



           
                          

           }
           
           System.out.println(i);
 hs.setText(Integer.toString(j));       
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
        try {
              PreparedStatement ps=Db.con.prepareStatement("select dt,nbr, id,emp from hs where emp="+idu);
            ResultSet  rs=ps.executeQuery();
       
       
          Ge cmi;
                    
           while(rs.next()){
                Date  date=rs.getDate("dt");
               
                 int nb=rs.getInt("nbr");
               
               Calendar cal = Calendar.getInstance();
cal.setTime(date);
int month = cal.get(Calendar.MONTH)+1;
int yea = cal.get(Calendar.YEAR);
if((month==mois) && (yea==y)) {
j=j+nb;
}
//int year = cal.get(Calendar.YEAR);
System.out.println(month);



           
                          

           }
           
           System.out.println(i);
 hs.setText(Integer.toString(j));       
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
        
     try {
              PreparedStatement ps=Db.con.prepareStatement("select date,avance, id,empl from av where empl="+idu);
            ResultSet  rs=ps.executeQuery();
       
       
          Ge cmi;
                    
           while(rs.next()){
                Date  date=rs.getDate("date");
               
                 int n=rs.getInt("avance");
               
               Calendar cal = Calendar.getInstance();
cal.setTime(date);
int month = cal.get(Calendar.MONTH)+1;
int yea = cal.get(Calendar.YEAR);
if((month==mois) && (yea==y)) {
t=t+n;
}
//int year = cal.get(Calendar.YEAR);
System.out.println(month);



           
                          

           }
           
           System.out.println(i);
 av.setText(Integer.toString(t));       
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void BindCombo(){
       Saa mq = new Saa();
        HashMap<String, Integer> map = mq.pop();
        for(String s : map.keySet()){
            em.addItem(s);
  
      }
 }
public void BindCom(){
       Saa m = new Saa();
        HashMap<String, Integer> ma = m.po();
        for(String s : ma.keySet()){
            gr.addItem(s);
  
      }
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ab;
    private javax.swing.JTextField av;
    private javax.swing.JTextField cn;
    private javax.swing.JComboBox<String> em;
    private javax.swing.JComboBox<String> gr;
    private javax.swing.JTextField hs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mo;
    private javax.swing.JTextField no;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField sa;
    private javax.swing.JTextField saf;
    private javax.swing.JTextField ye;
    // End of variables declaration//GEN-END:variables
}
