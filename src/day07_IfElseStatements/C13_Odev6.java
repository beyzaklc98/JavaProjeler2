package day07_IfElseStatements;

import java.util.Scanner;

public class C13_Odev6 {

    public static void main(String[] args) {

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk
        // diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan= new Scanner (System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazar")){
            System.out.println("Pazar: "+"Paz");
        } else if(gunIsmi.equals("pazartesi")){
            System.out.println("Pazartesi: " +"Paz");
        }else if(gunIsmi.equals("sali")){
            System.out.println("Sali: "+"Sal");
        }else if(gunIsmi.equals("carsamba")){
            System.out.println("Car");
        }else if(gunIsmi.equals("Persembe: "+"persembe")){
            System.out.println("Per");
        }else if(gunIsmi.equals("cuma")){
            System.out.println("Cuma: "+"Cum");
        }else if(gunIsmi.equals("cumartesi")){
            System.out.println("Cumartesi: "+"Cum");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
        // isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        // gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        // *** 2. COZUM ***

        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun= scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba")
                || gun.equals("persembe") || gun.equals("cuma")
                || gun.equals("pazar") || gun.equals("cumartesi")){
            System.out.println(""+gun.toUpperCase().charAt(0)+""+gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2));
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }

        // *** "" yani hiclik isareti ile char data turunu stringe cevirdik
        // *** eger cevirmeseydik harflerin toplamini yazdirdigimiz icin
        // *** char ASCII karsiligini alip yazdirirdi
    }
}
