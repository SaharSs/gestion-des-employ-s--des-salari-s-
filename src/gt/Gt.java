/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt;

import com.database.Db;
import com.login.LoginJFrame;

/**
 *
 * @author ruby
 */
public class Gt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              LoginJFrame lObj=new LoginJFrame();
     lObj.setVisible(true); 
     Db.setConnection();
    }
    
}
