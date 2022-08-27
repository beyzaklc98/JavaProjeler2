package day09_TernaryCase;

import java.util.Scanner;

public class C04_Odev_Ternay {

    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sayi alin.
        //          Sayi pozitifse “Sayi pozitif” yazdirin, negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println(sayi1 > 0 ? "Sayi pozitif" : sayi1 * sayi1);
    }
}
