import java.util.Scanner;

public class Taximetre {
    public static void main(String[] args) {
        Scanner grdi = new Scanner(System.in);

        double km, kmUcreti = 2.20, toplamUcret, txAcilis = 10;

        System.out.print("KM Giriniz :");
        km = grdi.nextDouble();
        toplamUcret = (km*kmUcreti) + (txAcilis);
        toplamUcret=(toplamUcret<20) ? 20 : toplamUcret;
        System.out.println("Toplam Taxi Ücreti :" + toplamUcret);


    }
}
