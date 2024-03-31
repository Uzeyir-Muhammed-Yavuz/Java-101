import java.util.Scanner;
public class SayilariBuyuktenKucugeSiralama {

    public static void main(String[] args) {
        Scanner gr = new Scanner(System.in);

        int a, b, c;

        System.out.println("3 Farklı sayı girin, eşit sayılarla program çalışmaz");

        System.out.print("1. Sayı :");
        a = gr.nextInt();

        System.out.print("2. Sayı :");
        b = gr.nextInt();

        System.out.print("3. Sayı :");
        c = gr.nextInt();

        if ((a > b) && (a > c)){
            if ((b > c)){
                System.out.println(a+">"+b+">"+c);
            }
            else {
                System.out.println(a+">"+c+">"+b);
            }
        }
        if ((b > a) && (b > c)){
            if ((a > c)){
                System.out.println(b+">"+a+">"+c);
            }
            else {
                System.out.println(b+">"+c+">"+a);
            }
        }
        if ((c > a) && (c > b)){
            if ((a > b)){
                System.out.println(c+">"+a+">"+b);
            }
            else {
                System.out.println(c+">"+b+">"+a);
            }
        }

        }
    }
