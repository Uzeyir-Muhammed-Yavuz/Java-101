import java.util.Scanner;

public class DaireAlaniCevresiVeDilimliAlani {

    public static void main(String[] args) {

        double r, π = 3.14, alan, cevre, a, dilimAlan;

        Scanner imp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = imp.nextDouble();
        alan = (π*r*r);
        cevre = (2*π*r);
        System.out.print("Merkez Açısının Ölçüsünü Derece Cinsinden Giriniz :");
        a = imp.nextDouble();
        dilimAlan = (π * (r*r) * a) / 360;
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);
        System.out.println("Dairenin Dilim Alanı :" + dilimAlan);
    }
}
