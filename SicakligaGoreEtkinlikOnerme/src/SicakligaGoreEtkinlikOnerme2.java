import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme2 {

    public static void main(String[] args) {

        Scanner gr = new Scanner(System.in);

        byte sicaklik;

        System.out.print("Sıcaklığı derece cinsinden girin :");
        sicaklik = gr.nextByte();

        /* Sıcaklık 5'den küçük ise "Kayak" etkinliğini öner.
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         * Sıcaklık 25'den büyük ise "Yüzme" etkinliğini öner.
         */

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik >= 15 && sicaklik <= 25){
            System.out.println("Piknige gidebilirsiniz.");
        }
        if (sicaklik > 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        }
    }
