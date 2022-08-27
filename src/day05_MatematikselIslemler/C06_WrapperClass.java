package day05_MatematikselIslemler;

public class C06_WrapperClass {

    public static void main(String[] args) {

        int str1 = 12345;
        int str2 = 23456;

        System.out.println(str1 + str2); // 35801
        System.out.println("toplamlari: " +str1+str2); // *** 1234523456 // parantez olmadigi icin yan yana yazdirdi

        // verilen iki stringteki sayilari toplayin

        String str3 = "12345";
        String str4 = "23456";
        System.out.println(str3 + str4); //1234523456

        System.out.println(Integer.valueOf(str3) + Integer.valueOf(str4)); // *** 35801

        // Integer.valueOf(str1) metodu sadece sayisal deger iceren String'lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata verir
    }
}
