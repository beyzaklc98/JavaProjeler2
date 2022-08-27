package day07_IfElseStatements;

public class C02IfStatements {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteginiz gerceklesecek"); // true, if bady calisacak
            System.out.println("bady icindeki tum kodlar calisir"); // true
        }

        if (a > 0) System.out.println("suslu parantez olmazsa sadece bir satir calisir"); // true // if'e bagli olarak

        if (b > a) System.out.println("a"); // true

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if bady' sini suslu parantez icerisini yazmalisiniz
        // bady'yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde  if cumlesi bitmis olur
        // 25. ve 26. satirdaki kod 17. satirdaki if dogru olsa da calisir false olsa da calisir

        System.out.println("ikinci satir calisti");
        System.out.println("satir 3");

        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
        Eger birden fazla satir ayni if sartina baglanmissa mutlaka suslu parantes kullanmaliyiz {}
        */

        int sayi = 23;

        if (sayi > 0) //  *** { } koymazsak burada biter alt satiri baglamaz
            System.out.println("sayi pozitif");
        System.out.println("pozitif kalacaktir"); // her zaman calisir {} yok cunku
        System.out.println("ucuncu satir"); // her zaman calisir {} yok cunku

        if (sayi % 2 == 0)
            System.out.println("sayi cift"); // false *** {} yok ve ilk satir oldugu icin calismadi
        System.out.println("cift kalacaktir"); // {} olmadigi icin her zaman calisir

        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati"); // false
    }
}
