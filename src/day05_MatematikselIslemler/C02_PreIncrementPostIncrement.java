package day05_MatematikselIslemler;

public class C02_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        // burada once sayi2'ye deger atanacak sonra sayi bir arttirilacak
        // yani once sayi2 10 olur ardindan ise sayi1  bir arttirilarak sayi1=11 olur
        System.out.println(sayi1 + " , " + sayi2 + " , " + sayi3); // 11,10,30

        sayi3 = ++sayi1;
        System.out.println(sayi1 + " , " + sayi2 + " , " + sayi3); // 12,10,12
        // sayi 1'in degeri en son 11'di bir arttirdik 12 oldu

        System.out.println(sayi3++); // 12
        System.out.println(sayi3); // 13

        System.out.println(--sayi2); // 9
    }
}
