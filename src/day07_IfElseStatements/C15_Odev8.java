package day07_IfElseStatements;

import java.util.Scanner;

public class C15_Odev8 {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden kac aldiginizi giriniz");
        int not = scan.nextInt();

        if (0 <= not && not < 50) {
            System.out.println("harf notu: " + "D");
        } else if (50 <= not && not < 60) {
            System.out.println("harf notu: " + "C");
        } else if (60 <= not && not < 80) {
            System.out.println("harf notu: " + "B");
        } else if (80 <= not && not <= 100) {
            System.out.println("harf notu: " + "A");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }
    }
}
