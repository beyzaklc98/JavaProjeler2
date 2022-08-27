package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {

        int sayi1 = 8;
        int sayi2 = 4;
        System.out.println(sayi1 / sayi2); // 2

        sayi2 = 3;
        System.out.println(sayi1 / sayi2); // 2.66666 // 2

        sayi1 = 22;
        System.out.println(sayi1 / sayi2); // 7.33333 // 7

        // Java 2 int sayiyi birbirine bolerse sonuc integer olur
        // eger virgulden sonra kusurat varsa siler

        sayi1 = 4786;
        sayi2 = 10;
        sayi1 = sayi1 / sayi2; //478.6
        System.out.println(sayi1); // 478


        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1); // 47

        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1); // 4

        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1); // 0


        sayi1 = 4895;
        double sayi3 = 10;
        // sayi1 = sayi1 / sayi3
        // Java iki farklı data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autowidening yapar
        // bu islemi dusunursek sayi1/sayi3 = islemin sonucunu double kabul eder

        System.out.println(sayi1 / sayi3); // 489.5
        System.out.println(sayi3 / sayi1);// 0.002

        short sayi4 = 456;
        short sayi5 = 10;
        System.out.println(sayi4 / sayi5); // 45

        sayi4 = 10;
        byte sayi6 = 122;
        System.out.println(sayi6 / sayi4); // 12

        char harf2 = 98;
        System.out.println("harf2: " + harf2); // b *** ASCII tablosunda 98'in karsiligi b ve '' olmadigi halde hata X
    }
}
