package day07_IfElseStatements;

import java.util.Scanner;

public class C08_Odev1 {

    public static void main(String[] args) {

        // Soru2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin
        // Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //        ilkHarf=S output = “Sali”
        // *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini girin");
        char ilkHarf= scan.next().toLowerCase().charAt(0);

        switch (ilkHarf){
            case 'p':
                System.out.println("Pazar,Pazartesi,Persembe");
                break;
            case 's':
                System.out.println("Salı");
                break;
            case 'ç':
                System.out.println("Çarsamba");
                break;
            case 'c':
                System.out.println("Cuma, Cumartesi");
                break;
            default:
                System.out.println("hatali giris");
        }
    }
}
