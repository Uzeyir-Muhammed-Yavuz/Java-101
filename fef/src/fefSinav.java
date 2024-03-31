import java.util.Scanner;

public class fefSinav {
    public static void main(String[] args) {

        double vize1, final1, vize2, final2, sonuc1, sonuc2;

        Scanner inp = new Scanner(System.in);

        System.out.print("Vize /40 Final /60 oranındadır! \n Vize notunu girin :");
        vize1 = inp.nextDouble();

        System.out.print("Final notunuzu girin :");
        final1 = inp.nextDouble();

        System.out.print("Vize /30 Final /70 oranındadır! \n Vize notunu girin :");
        vize2 = inp.nextDouble();

        System.out.print("Final notunuzu girin :");
        final2 = inp.nextDouble();

        sonuc1 = (vize1*0.4) + (final1*0.6);
        sonuc2 = (vize2*0.3) + (final2*0.7);
        System.out.println("/40 /60 oranında notunuz :"+ sonuc1);
        System.out.println("/30 /70 oranında notunuz :"+ sonuc2);


    }

}
