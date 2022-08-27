package day07_IfElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdiririn
        // Ornek:  gun=Pazar output = "Hafta sonu"
        //         gunSali output = "Hafta ici"
        // *** String icin equals method'unu kullanin

        // pazar veya cumartesi ise ===> haftasonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> hafta ici

        // String  senstivedir yani buyuk ve kucuk harflere duyarlidir
        // yani pazar, Pazar, PAZAR, PazAR farkli kelimelerdir

        // bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase(); // kullanici nasil yazarsa yazsin kucuk harfe cevirir

        // *** String ifadelere == kullanilmasi tavsiye edilmez
        // *** cunku bekledigimizden farkli bir sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");
        }
    }
}
