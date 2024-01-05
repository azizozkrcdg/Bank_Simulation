/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankasimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import com.mysql.cj.jdbc.Driver;

/**
 *
 * @author mkere
 */
public class MysqlConnection {

    public static String URL;
    // Veritabanı kullanıcı adı
    private static String KULLANICI_AD;
    // Veritabanı şifre
    private static String SIFRE ;
    
    
    public  MysqlConnection(String URL,String KULLANICI_AD,String SIFRE){
        try {
            this.URL=URL;
            this.KULLANICI_AD=KULLANICI_AD;
            this.SIFRE=SIFRE;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection baglanti = DriverManager.getConnection(URL, KULLANICI_AD, SIFRE);
            if (baglanti != null) {
         }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //return "";
        
    }
   
//    public static String GirisSorgu(String kullanici_adi, String sifre) {
//            try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Veritabanına bağlan
//            Connection baglanti = DriverManager.getConnection(URL, KULLANICI_AD, SIFRE);
//            
//            if (baglanti != null) {
//          
//                //bağlantı Başarılı İse :.. 
//                String sorgu = "SELECT * FROM kullanicilar WHERE adi=\"" + kullanici_adi + "\" AND password=\"" + sifre + "\"";
//                PreparedStatement prepare = baglanti.prepareStatement(sorgu);
//                ResultSet execute = prepare.executeQuery();
//                if(execute.next()){
//                    return "1";
//                }
//                else{
//                    //JOptionPane.showMessageDialog(null,"Maalesef Giriş Başarısız");
//                    return "0";
//                }
//                
//                
//            } else {
//                System.out.println("Veritabanına bağlantı başarısız!");
//                return "vt_hatasi";
//                
//            }
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//        return "";
//        
//        
//    }

    public static String  KayitOlustur(){
        return "Kayit_olundu...";
    }
}
