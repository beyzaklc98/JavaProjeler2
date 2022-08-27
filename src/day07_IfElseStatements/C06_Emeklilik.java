package day07_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {

        // Soru3) Kullanicidan yasini isteyin 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsain, calismalisi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >= 65) {
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65 - yas + " sene daha calismalisin");
        }

        // if else statement'larda iki durumdan sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calisma ihtimali ====> YOK

        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b); // 2*3=6
        }
    }
}
