import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner grd = new Scanner(System.in);
        double boy, kilo, vki;
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz :");
        boy = grd.nextDouble();
        System.out.print("Lütfen Ağırlığınızı Kilo Cinsinden Giriniz :");
        kilo = grd.nextDouble();
        vki = kilo / (boy*boy);
        System.out.println("Vücüt Kitle İndexiniz :" + vki);
    }
}
