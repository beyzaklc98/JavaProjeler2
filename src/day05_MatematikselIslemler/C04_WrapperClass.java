package day05_MatematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        // primitive data turu ile non primitive arasindaki farklar nelerdir?

        String str = "Java";
        int sayi = 10;

        System.out.println(str); // Java
        System.out.println(str.toUpperCase()); // JAVA

        // non primitive data turleri data depolamak yaninda bircok faydali metoda sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container)

        // primitive data turleri icin de bazi metodlar gerekli oldugunda
        // Java ara bir cozum uretmistir
        // Java her bir primitive data turunu, non primitive olarak kullanabilmek icin
        // ozel classlar olusturmus ve bunlara Wrapper Class adini vermistir

        double sayi2 = 20;
        // sayi2 primitive oldugunda double. dedigimizde hicbir method gelmez

        Double sayi3 = 15.7;
        // sayi3 wrapper class olan Double class'ini kullandigindan
        // Double. dedigimizde bircok method gelir
    }
}
