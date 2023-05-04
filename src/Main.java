import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Dik Kenarı Giriniz : ");
        a = input.nextInt();

        System.out.print("İkinci Dik Kenarı Giriniz : ");
        b = input.nextInt();

        c= Math.sqrt((a*a)+(b*b)); //kök almak için
        System.out.println("Hipotenüs : " + c);
    }
}