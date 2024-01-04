/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankasimulator;

/**
 *
 * @author Hasan
 */
public class BankaSimulator {
public String bakiye;
    
    public void setBakiye(String yeniBakiye) {
            
            this.bakiye = yeniBakiye;
            }
    public static void main(String[] args) {
        BankaSimulator myObj = new BankaSimulator();
        myObj.setBakiye("1000");
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
     }   
    
}
