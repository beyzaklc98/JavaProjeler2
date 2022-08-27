package day02_variables;

public class C03_Variables {

    public static void main(String[] args) {

        String ogrenciIsmi = "Melih";

        ogrenciIsmi = "Furkan";

        ogrenciIsmi = "Beyza";

        System.out.println(ogrenciIsmi);

        // bir variable declare edildikten sonra istediğimiz kadar değer degişimi yapabiliriz
        // *** ancak declare edilen bir variable tekrar declare edilmez
        // *** String ogrenciİsmi="Abdullah"

        String isim, soyisim, dogumYeri;

        isim = "Fatih";
        soyisim = "Sultan";
        dogumYeri = "İstanbul";

        System.out.println(soyisim);

        String tcNo = "72727726356";
        String hiclik = "";

        // String non-primitive olduğu için biz sadece data saklamak değil
        // ekstra bazı özellikler de kullanabiliyoruz
        // Eğer Tc No, okul numarası veya tel numarası gibi
        // kendisi sayısal olan ancak matematiksel bir işlemde kullanılmayan
        // değerler için de string kullanılabilir

        String harf = "A";
        char harf2 = 'A';

        // bu ikisi için de aynı durum geçerli
        // bu A harfi için bir variable'i char olarak da oluşturabilirim String olarak da oluşturabilirim
        // Eğer sadece saklayacaksak char kullanılabilir ama
        // String'in özelliklerinden istifade etmek için String olarak tanımlamak daha avantajlı olabilir

        int level, yaş, maaş;
        yaş = 24;
        System.out.println(yaş);

        // 6) Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi = 10;
        char harf3 = 'a';
        String str = "banan";
        System.out.println(sayi + harf3); // 10 + a'nin ascii degerini alıp isleme girerek yazdirir
        System.out.println(str + harf3); // * banana
        System.out.println(sayi * harf3); // 970
        System.out.println(harf3 + 2); // * 99
        System.out.println(str + sayi + harf3); // banan10a

        // 2) str+harf3; banana String variable cok gucludur, hangi data turu ile isleme girerse
        //               girsin diger data turunu kendisine benzetir

        // 3) konsolda verilen variable'lari kullanarak 10a gormek istersek nasil yazdiririz

        System.out.println("" + sayi + harf3); // 10a // *** hiclik "" ayni zamanda String'dir

        char deger = '1';
        System.out.println(deger + harf3); // 49+97=146 '1' + 'a'

        char harf4 = 98; // *** tek tirnak yok cunku tek karakter degil ve ASKII tablosunda 98 in karsiligi b
        System.out.println("harf4: " + harf4); // *** b yazdirir yani ASCII tablosunda 98'in karsiligi b
    }
}
