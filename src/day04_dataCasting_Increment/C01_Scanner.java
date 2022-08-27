package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        // charAt(index) metodu parametre olarak yazdigimiz index'deki char'ı bize getirir
        // String'de index 0'dan baslar
        // E r s i n (0.1.2.3.4.5. index seklinde oldugu icin 0 yazdik)

        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);

        // Kullanicidan ismini alip, ilk harfini buyuk yazarak yazdirin

        // Scanner scan= new Scanner (System.in);
        // System.out.println("Lutfen isminizi giriniz");

        // Java Scanner class'inda nextChar() methodu yoktur
        // bunun yerine String olarak ilk kelimeyi alip
        // onun da ilk harfini alabiliriz
        // char ilkHarf=scan.next().toUpperCase().charAt(0);
        // System.out.println("Ismin ilk harfi: " + ilkHarf);
    }
}
