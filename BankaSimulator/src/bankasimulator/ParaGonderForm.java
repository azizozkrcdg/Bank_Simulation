/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankasimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mkere
 */
public class ParaGonderForm extends javax.swing.JFrame {

    /**
     * Creates new form ParaGonderForm
     */
    public ParaGonderForm() {
        initComponents();
    }
    public static String gonderen_iban;
    public static String gonderen_mevcut_bakiye;
    public static String gonderen_id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ad = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        iban = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        tutar = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        Knumara = new javax.swing.JTextField();
        Numarasi = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Alıcı Adı  : ");

        label3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("Alıcı İban :");

        label4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(102, 102, 102));
        label4.setText("Göndermek İstediğin Tutar :");

        button1.setBackground(new java.awt.Color(204, 255, 153));
        button1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(102, 102, 102));
        button1.setLabel("Gönder");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        Numarasi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Numarasi.setForeground(new java.awt.Color(102, 102, 102));
        Numarasi.setText("Telefon Numarası : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Numarasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Knumara, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(tutar, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iban, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Numarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Knumara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        try {
            Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-test", "root", "");
            if (baglanti != null) {
                String sorgu = "SELECT * FROM banka_kayit WHERE signup_Name=\"" + ad.getText() + "\" AND signup_Phone=\"" + Knumara.getText() + "\"";
                java.sql.PreparedStatement prepare = baglanti.prepareStatement(sorgu);
                ResultSet execute = prepare.executeQuery();

                if (execute.next()) {
                    //JOptionPane.showMessageDialog(null, "Böyle Bir Kullanıcı Var ");
                    int kullanici_id = execute.getInt("id");
                    //JOptionPane.showMessageDialog(null, kullanici_id);
                    String sorgu2 = "SELECT * FROM cuzdan WHERE kullanici_id=\"" + kullanici_id + "\"";
                    java.sql.PreparedStatement prepare2 = baglanti.prepareStatement(sorgu2);
                    ResultSet execute2 = prepare2.executeQuery();
                    if (execute2.next()) {
                        if (iban.getText().equals(execute2.getString("iban"))) {

                            Float gonderilenPara = Float.valueOf(tutar.getText());
                            if (gonderilenPara > (Float.parseFloat(gonderen_mevcut_bakiye))) {

                                //EĞER GÖNDERECEĞİN PARA MEVCUT BAKİYENDEN BÜYÜK İSE GONDEREME 
                                String Message = "Mevcut Bakiyen : " + gonderen_mevcut_bakiye + " ₺\nGondermek İstediğin Para : " + gonderilenPara + " ₺\nLütfen Mecvut Bakiyeden Az Miktarda Para Gönderiniz.";
                                JOptionPane.showMessageDialog(null, Message);

                            } else {
                                //Parayı gonder.. 
                                float alici_mevcut_para = Float.parseFloat(execute2.getString("mevcut_para"));
                                //alıcı meblasını çekten sonra 
                                float son_para_alici = alici_mevcut_para + gonderilenPara;
                                float gonderici_son_para = Float.parseFloat(gonderen_mevcut_bakiye) - gonderilenPara;
                                
                                String gonderen_s = "UPDATE cuzdan SET mevcut_para = ? WHERE kullanici_id = ?";
                                java.sql.PreparedStatement prepare_gonder = baglanti.prepareStatement(gonderen_s);
                                prepare_gonder.setFloat(1, gonderici_son_para);
                                prepare_gonder.setString(2, gonderen_id);
                                //ALICI ........... 
                                String alici_para_sorgu = "UPDATE cuzdan SET mevcut_para = ? WHERE kullanici_id = ?";
                                java.sql.PreparedStatement prepare_alici = baglanti.prepareStatement(alici_para_sorgu);
                                prepare_alici.setFloat(1, son_para_alici);
                                prepare_alici.setString(2, Integer.toString(kullanici_id));
                                int affectedRows = prepare_gonder.executeUpdate();
                                int affectedRows2=prepare_alici.executeUpdate();
                                if ((affectedRows>0)&&(affectedRows2>0)){
                                    JOptionPane.showMessageDialog(null, "Para Gönderme Başarılı.");
                                    //Main guncellePara = new Main();
                                    //guncellePara.MevcutPara.setText(Float.toString(gonderici_son_para));
                                    JOptionPane.showMessageDialog(null, "Güncel Bakye : "+gonderici_son_para);
                                    this.dispose();
                                }
                                // son durum ; 
                            }

                            //JOptionPane.showMessageDialog(null, gonderilenPara);
                        } else {
                            JOptionPane.showMessageDialog(null, "Kullanıcının İban Bilgisi Yanlı Para Gönderilemedi.");

                        }
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaGonderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaGonderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaGonderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaGonderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaGonderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Knumara;
    private java.awt.Label Numarasi;
    private javax.swing.JTextField ad;
    private java.awt.Button button1;
    private javax.swing.JTextField iban;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField tutar;
    // End of variables declaration//GEN-END:variables
}
