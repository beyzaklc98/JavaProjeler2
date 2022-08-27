package day09_TernaryCase;

import java.util.Scanner;

public class C06_Odev_Nested_Ternary {

    public static void main(String[] args) {

        // Soru 2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
        //          buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? "K Harf" : (harf>'A' && harf<='Z' ? "B Harf" : "girilen karakter harf degil"));

    }
}
