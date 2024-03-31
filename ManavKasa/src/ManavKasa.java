import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner grd = new Scanner(System.in);
        float alinan1, alinan2, alinan3, alinan4, alinan5, toplam, armutF = 2.14f, elmaF =3.67f, domatesF = 1.11f, muzF = 0.95f, patlicanF = 5.00f;
        System.out.print("Alınan Armut KG ? :");
        alinan1 = grd.nextFloat();
        System.out.print("Alınan Elma KG ? :");
        alinan2 = grd.nextFloat();
        System.out.print("Alınan Domates KG ? :");
        alinan3 = grd.nextFloat();
        System.out.print("Alınan Muz KG ? :");
        alinan4 = grd.nextFloat();
        System.out.print("Alınan Patlıcan KG ? :");
        alinan5 = grd.nextFloat();
        alinan1 *= armutF;
        alinan2 *= elmaF;
        alinan3 *= domatesF;
        alinan4 *= muzF;
        alinan5 *= patlicanF;
        toplam = alinan1+alinan2+alinan3+alinan4+alinan5;
        System.out.println("Toplam Tutarınız TL :" + toplam);


    }
}
