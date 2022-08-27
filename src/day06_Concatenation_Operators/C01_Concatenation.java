package day06_Concatenation_Operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        // variable'larin degerlerini degistirmeden
        // asagidaki ifadeleri, bu variable'lari kullanarak yazdirin

        // Java5Guzel
        System.out.println(str1 + sayi1 + str2);

        // 2Guzel15
        System.out.println(sayi1 - sayi2 + str2 + sayi1 * sayi2);

        // Java22
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2));

        // 53Guzel
        System.out.println(sayi1 + sayi2 + str2); // 8Guzal
        System.out.println(sayi1 + (sayi2 + str2));
        System.out.println("" + sayi1 + sayi2 + str2);

        //35JavaGuzal
        System.out.println(sayi2 + (sayi1 + str1 + str2)); // 35JavaGuzel
        System.out.println("" + sayi2 + sayi1 + str1 + str2); // 35JavaGuzel

        /* eger tamamen sayilardan olusan bir string varsa ve biz bunu integer'a cevirmek istersek
        integer.valueOf (str) methodunu kullaniriz

        *** bir sayiyi String'e cevirmek istersek hiclik ile toplariz
        "" + sayi yapariz
        */
    }
}
