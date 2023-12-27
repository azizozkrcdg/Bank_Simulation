class Login:

    def login():
        default_account_number = 377266
        default_password = 123456
        account_number = input("Hesap numarası : ")
        password = input("Parola : ")

        if (account_number == default_account_number) and (password == default_password):
            print("Giriş Başarılı!")
        else:
            print("Hesap numarası ve parolanızı kontrol edip tekrar deneyiniz!")
        
    
login = Login()
login.login()
