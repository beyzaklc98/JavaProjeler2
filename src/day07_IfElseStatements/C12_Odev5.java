package day07_IfElseStatements;

import java.util.Scanner;

public class C12_Odev5 {

    public static void main(String[] args) {

        // Soru4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin, eger uc kenar uzunlugu birbirine esitse
        // "Eskenar ucgen" yazdirin. Diger durumlarda ekrana "Eskenar degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üçgenin bir kenar uzunlugunu giriniz");
        double a = scan.nextDouble();
        System.out.println("lütfen üçgenin ikinci kenar uzunlugunu giriniz");
        double b = scan.nextDouble();
        System.out.println("lütfen üçgenin üçüncü kenar uzunlugunu giriniz");
        double c = scan.nextDouble();

        if (a == b && b == c) {
            System.out.println("eşkenar uçgendir");
        } else {
            System.out.println("eşkenar ucgen değildir");
        }
    }
}

