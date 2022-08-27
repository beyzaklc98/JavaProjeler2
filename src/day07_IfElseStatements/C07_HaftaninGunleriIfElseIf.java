package day07_IfElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {

    public static void main(String[] args) {

        //Soru 3) kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "yanlis giris" yazdirin
        // Ornek :   gun=Pazar output = "Hafta sonu"
        //           gun=Sali output = "Hafta ici"
        // ***       String icin equals method'unu kullanin

        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ===> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();

        // hatali girisleri yazdirmak icin
        // olasiliklari 3'e cikarin
        // haftasonu - hafta ici - yanlis giris

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");

        } else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }

        // eger if else if ..... statement else ile bitiyorsa
        // olasiliklardan sadece bir tanesi mutlaka calisir
        // Java ile ilk buldugu true'a ait sonuc yazdirir
        // ve kalan sartlara bakmaz

        // if else if .... cumleleri ile bitmese de calisir
        // *** ancak bu durumda sadece bir olasilik calisabilir veya hicbir islem yapilmayabilir
    }
}
