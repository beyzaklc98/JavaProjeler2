package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi + 10); // 30
        // *** bu satirda sayiyi 10 arttirmadim
        // *** sayinin 10 fazlasini yazdirdim

        System.out.println(sayi); // 20

        //eger atama yapmazsak sayida yaptigimiz arttirma veya azaltma kalici olmaz yani kaydedilmez

        sayi = sayi + 10;
        System.out.println(sayi); // 30

        System.out.println(sayi = sayi += 10); // 40
        System.out.println(sayi); // 40

        System.out.println(sayi += 10); // 50
        System.out.println(sayi); // 50

        // bir variable'in degerini kalici olarak arttirmak veya azaltmak isterseniz assigment sart

        System.out.println("28. satir :" + sayi++); // *** 50
        System.out.println("29. satir :" + sayi); // *** 51

        System.out.println("31. satir :" + ++sayi); //52
        System.out.println("32. satir :" + sayi); // 52
    }
}
