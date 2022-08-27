package day04_dataCasting_Increment;

public class C04_ExpilictNarrowing {

    public static void main(String[] args) {

        int sayi1 = 879;
        double sayi2 = 10;

        double sayi3 = sayi1 / sayi2; // 87.9
        System.out.println(sayi3);

        int sayi4 = (int) (sayi1 / sayi2); //87
        // deger dauble, variable int
        // yani variable daha dar dolayisiyla java bunu otomatik olarak yapmaz
        // sorumlulugu ustlenmemizi ister (buyuk data turunu kucuge cevırmek istedigimizde)
        // sag tarafa yazdigimiz (int) sorumluluk bende demek
        // int sayi4 = sayi1/(int) sayi2); //87.9 bu da olabilirdi, sayi1 int old. icin sayi2'yi int'a cevirdik

        System.out.println(sayi4); //87

        int sayi5 = 140;
        byte sayi6 = (byte) sayi5; // kabul etmiyor sag taraftaki deger int büyük sol taraftaki variable byte

        System.out.println(sayi6); //-116 //cunku byte 127e kadar aliyor 127den sonra kalan sayilar -128 den ilerliyor

        sayi5 = 130;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6); // *** -126

        sayi5 = 260;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6); // *** 127,256 0 a gelecek sonuc 4 cıkacak

        sayi5 = 520;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6); // 8

        sayi5 = -130;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6); // *** 126 // -'den baslayarak +'ya gecer

        sayi5 = 44;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6); // 44
    }
}
