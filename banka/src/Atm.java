import javax.swing.JOptionPane;
public class Atm {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "*** Banka Kayıt Menusu *** ");
        String kullanici_Adi = JOptionPane.showInputDialog("İsminiz : ");
        String Sifre = JOptionPane.showInputDialog("Güvenlik Sifre : ");
        Banka new_kullanici = new Banka();
        new_kullanici.isim = kullanici_Adi;
        new_kullanici.password = Sifre;
        JOptionPane.showMessageDialog(null, "Kayıt İşleminiz Yapıldı");
        int hak = 3;
        do {
            String Sifre_confirm = JOptionPane.showInputDialog("Sifre : ");
            if (Sifre.equals(Sifre_confirm)) {
                // eğer şifre doğru ise
                while (true) {
                    String message = "******** ATM BANKAMATİK ********\n";
                    message += "Sayın : " + new_kullanici.isim + "\nHesap Bakiyesi : " + new_kullanici.mevcut_para
                            + " ₺ \n";
                    message+="IBAN : "+new_kullanici.IBAN+"\n";
                    message += "*****************************************\n";
                    message += "[1] Para Çekme\n";
                    message += "[2] Para Yatırma\n";
                    message += "[0] Çıkış\n";
                    String secim = JOptionPane.showInputDialog(message);
                    if (secim.equals("1")) {
                        String CekilecekTutar = JOptionPane.showInputDialog("Cekilen Tutar");
                        Float cek = Float.parseFloat(CekilecekTutar);
                        String onay = JOptionPane.showInputDialog(null, "Çekilen Tutar : "+cek+" ₺\nOnaylıyor musun ? \n1.Evet\n2.Hayır");
                        if (onay.equals("1")) {
                            new_kullanici.ParaCek(cek);
                        }

                    }
                    else if(secim.equals("2")){
                        String  EklencekTutar = JOptionPane.showInputDialog("Yatıralacak Olan Tutarı Girin ");
                        Float yatir = Float.parseFloat(EklencekTutar);
                        String onay = JOptionPane.showInputDialog(null, "Yatırılan Tutar : "+yatir+" ₺\nOnaylıyor musun ? \n1.Evet\n2.Hayır");
                        if (onay.equals("1")) {
                            new_kullanici.ParaYatır(yatir);
                        }
                    }
                    else{
                        break;
                    }

                }
                JOptionPane.showMessageDialog(null, "Bizi Tercih Ettiğiniz İçin Teşekkürler");
                break;         
            } else {
                hak--;
                String message = "Şifre Yanlış Kalan Hak (" + hak + ")";
                JOptionPane.showMessageDialog(null, message);

            }
        } while (hak > 0);

    }
}
