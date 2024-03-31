import java.util.Scanner;

public class DikUcgendeHipotenusuBulanProgram {

    public static void main(String[] args) {

        double aKenari, bKenari, cKenari, u, alan;

        Scanner grdi = new Scanner(System.in);
        System.out.print("A Kenarını Giriniz :");
        aKenari = grdi.nextDouble();
        System.out.print("B Kenari Giriniz :");
        bKenari = grdi.nextDouble();
        System.out.print("C Kenari Giriniz :");
        cKenari = grdi.nextDouble();
        u = (aKenari+bKenari+cKenari)/2;
        alan = Math.sqrt(u * (u - aKenari) * (u - bKenari) * (u - cKenari));
        System.out.println("Alan :" + alan);
    }
}
