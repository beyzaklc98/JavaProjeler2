package day07_IfElseStatements;

import java.util.Scanner;

public class C09_Odev2 {

    public static void main(String[] args) {

        // Soru4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        int a = scan.nextInt();
        System.out.println("a: " + a);

        int b = scan.nextInt();
        System.out.println("b: " + b);

        if (a < b || a > b) {
            System.out.println("dikdortgendir");
        } else {
            System.out.println("karedir");
        }
    }
}
