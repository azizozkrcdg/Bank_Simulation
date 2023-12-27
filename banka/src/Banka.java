import javax.swing.JOptionPane;

public class Banka {
    //public olarak diğer bir classtan erişim sağlıyoruz...

    public static String isim;
    //isim değişkeni
    public static String password;
    //password değişkeni 
    public static Float mevcut_para = 1000f;
    //programa girilirken stabil mevcut tutar;
    public String IBAN = "TR0002648500000000025859";
    public static void ParaCek(Float a) {
        if (mevcut_para < a) {
            JOptionPane.showMessageDialog(null,
                    "Bakiye Yetersiz . \nLütfen " + mevcut_para + " ₺ den Az bir Miktar Para Çekin ");
        } else {
            mevcut_para = mevcut_para - a;
        }

    }
    public static void ParaYatır(Float a) {
        if (a < 0) {
            JOptionPane.showMessageDialog(null,
                    "Geçersiz Para Yükleme İşlemi. \nLütfen Tekrar Deneyiniz.");

        } else {
            mevcut_para += a;
        }

    }

}
