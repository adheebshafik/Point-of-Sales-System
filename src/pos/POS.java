/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import main.Dashboard;
import main.Login;
import javax.swing.UIManager;

/**
 *
 * @author Nusky Shafik
 */
public class POS {
    
    
    
    public static void main(String[] args) {
    
    new Thread(){
       public void run() {
                
                try {
                    Thread.sleep(3500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                new Login().setVisible(true);
                
            }
       
    }.start();
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception ex) {
            
        }
    }
    
}
