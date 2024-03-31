import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String kullaniciAdi, sifre, yeniSifre;

        System.out.print("Kullanıcı adınız :");
        kullaniciAdi = inp.nextLine();
        System.out.print("Şifreniz :");
        sifre = inp.nextLine();

        if (kullaniciAdi.equals("admin") && (sifre.equals("cd.admin"))){
            System.out.print("Giriş yaptınız!");
        }
        else{
            System.out.print("Giriş yapılmadı, şifrenizi sıfırlamak istermisiniz\nevet ise '1' hayır ise '0' ı tuşlayın :");
            int secim = inp.nextInt();
            inp.nextLine();

            switch (secim){
                case 1:
                    System.out.print("Yeni şifrenizi girin :");
                    yeniSifre = inp.nextLine();
                    if (yeniSifre.equals("cd.admin")){
                        System.out.print("Yeni Şifreniz eski şifrenizle aynı olamaz!");
                        break;
                    }
                    else {
                        System.out.print("Şifreniz başarıyla sıfırlanmıştır");
                        break;
                    }
                case 0:
                    System.out.print("Şifrenizi kontrol edin ve tekrar deneyin!");
                    break;
                default:
                    System.out.print("Lütfen geçerli bir seçim yapın!");
            }

        }











    }
}
