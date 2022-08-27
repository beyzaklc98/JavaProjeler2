package day05_MatematikselIslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi = 10;
        // bu sayiyi bir arttirmak istersek

        sayi++;
        System.out.println(sayi); // 11
        System.out.println(sayi++); // 11

        sayi++;
        System.out.println("pre-incrementten once" + sayi); // 12
        // eger 11. ve 12. satirda yaptigim iki islemi tek satirda yaparsam
        // java iki islemden once hangisini yapacagini bilmek ister
        // once arttirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra arttirirsak bu durumda eski deger yazdirilir

        System.out.println("pre-increment satirinda" + ++sayi); // 13 //once arttir sonra yazdir
        System.out.println("pre-incerementten sonra" + sayi); // 13

        System.out.println("post-increment satirinda" + sayi++); // 13 once yazdir sonra arttir
        System.out.println("post-incrementten sonra" + sayi); // 14
    }
}
