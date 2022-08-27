package day09_TernaryCase;

import java.util.Scanner;

public class C03_Odev_Ternary {

    public static void main(String[] args) {

        // Soru 3 : Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi < 0 ? (-sayi) : (sayi));

    }
}
