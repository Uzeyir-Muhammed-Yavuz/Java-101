import java.util.Scanner;

public class SicakligaGoreEtknlikOnerme {

    public static void main(String[] args) {

        Scanner gr = new Scanner(System.in);

        byte sicaklik;

        System.out.print("Hava sıcaklığını derece cinsinden girin :");
        sicaklik = gr.nextByte();

        /* Sıcaklık 5'den küçük ise "Kayak" etkinliğini öner.
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         * Sıcaklık 25'den büyük ise "Yüzme" etkinliğini öner.
         */

        String durum = (sicaklik < 5) ? "Kayak yapabilirsiniz." : (sicaklik >= 5 && sicaklik < 15) ? "Sinemaya gidebilirsiniz." : (sicaklik >= 15 && sicaklik <= 25) ? "Pikniğe gidebilirsiniz." : "Yüzmeye gidebilirsiniz." ;

        System.out.println(durum);

    }
}
