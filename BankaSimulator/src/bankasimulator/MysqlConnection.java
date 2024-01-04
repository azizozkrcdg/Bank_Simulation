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

    private static final String URL = "jdbc:mysql://localhost:3306/java-test";
    // Veritabanı kullanıcı adı
    private static final String KULLANICI_AD = "root";
    // Veritabanı şifre
    private static final String SIFRE = "";

    public static String GirisSorgu(String kullanici_adi, String sifre) {
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Veritabanına bağlan
            Connection baglanti = DriverManager.getConnection(URL, KULLANICI_AD, SIFRE);
            
            if (baglanti != null) {
                
                
                //bağlantı Başarılı İse :.. 
                String sorgu = "SELECT * FROM kullanicilar WHERE adi=\"" + kullanici_adi + "\" AND password=\"" + sifre + "\"";
                PreparedStatement prepare = baglanti.prepareStatement(sorgu);
                ResultSet execute = prepare.executeQuery();
                if(execute.next()){
                    return "1";
                }
                else{
                    //JOptionPane.showMessageDialog(null,"Maalesef Giriş Başarısız");
                    return "0";
                }
                
                
            } else {
                System.out.println("Veritabanına bağlantı başarısız!");
                return "vt_hatasi";
                
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return "";
        
        
    }

    public static String  KayitOlustur(){
        return "Kayit_olundu...";
    }
}
