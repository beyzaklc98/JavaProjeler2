package day03_scanner;

public class C01_Variables {

    public static void main(String[] args) {


        // 1- Farklı 3 data türünde variable oluşturun ve bunları yazdırın
        String okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi); // Yildiz Koleji

        char ilkHarf;
        ilkHarf = 'K';
        System.out.println(ilkHarf);

        int sayi1 = 10, sayi2 = 20;
        System.out.println(sayi1 + sayi2); // 30

        // 2- İsim ve soyisim icin iki variable oluşturun ve bunları
        // isminiz : Mehmet
        // soyisminiz : Bulutluoz
        // seklinde yazdırın

        String isim = "Beyza";
        String soyIsim = "KILIC";

        System.out.println("isminiz: " + isim.toUpperCase());
        System.out.println("soyIsminiz:" + soyIsim);

        // 3- Iki farklı tamsayı data türünde 2 variable oluşturun ve bunların toplamını yazdırın
        short okulMevcudu = 12097;
        double ondalikliSayi = 9;
        System.out.println("iki sayinin toplami : " + (okulMevcudu + ondalikliSayi)); // 12106.0
        // 4- Bir tamsayı ve bir ondalikli sayı oluşturun ve bunların toplamini yazdirin.

        // 5- char data turunde bir variable oluşturun ve yazdirin
        char sonHarf = 'A';
        System.out.println(sonHarf); // *** A yazar A'nin ASCII karsiligi matematiksel isleme girildiginde alınır sadece

        // 6- Bir tamsayi, bir de char degişken oluşturun ve bunlarin toplamini yazdirin
        int sayi3 = 751;
        char karakter = '%';

        System.out.println(sayi3 + karakter); // 788
        // char data turundeki degişkenler matematiksel işlemlerde kullanilirsa
        // o char degerinin ASCII karşiligi işleme alinir
    }
}
