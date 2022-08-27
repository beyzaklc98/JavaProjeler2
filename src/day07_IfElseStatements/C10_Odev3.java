package day07_IfElseStatements;

import java.util.Scanner;

public class C10_Odev3 {

    public static void main(String[] args) {

        // Soru5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");

        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");

        } else if (gun.equals("pazar"))  {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else {
            System.out.println("Kutsal bir gun degildir");
        }
    }
}
