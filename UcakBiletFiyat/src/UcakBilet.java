import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {

        Scanner gr = new Scanner(System.in);

        double km, kmUcret = 0.10, normalTutar, yasInd, indTutar, gidisDonusInd;
        int yas, yTip;

        System.out.print("Gideceğiniz mesafeyi girin (KM) :");
        km = gr.nextDouble();

        System.out.print("Yaşınızı girin :");
        yas = gr.nextInt();
        normalTutar = km * kmUcret;
        if (yas > 0 && yas < 12){
            yasInd = normalTutar * 0.50;
        }
        if (yas >= 12 && yas <= 24){
            yasInd = normalTutar * 0.10;
        }
        if (yas > 65){
            yasInd = normalTutar * 0.30;
        } else {
            yasInd = normalTutar;
        }
        System.out.print("Yolculuk tipini girin : gidiş ==> 1 gidiş dönüş ==> 2 :");
        yTip = gr.nextInt();
        }
    }
