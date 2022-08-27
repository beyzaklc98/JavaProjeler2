package day07_IfElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("Verilen sayilar esit"); // false, if bady calismaz
        }

        if (a > 100) {

            System.out.println("a yuzden buyuk"); //false, if bady calismaz
        }

        if (a * b > 5) {

            System.out.println("sayilarin carpimi 5'ten buyuk"); // true, if bady calisir
        }

        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklanir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin bady'si calisabilecegi gibi
        // hicbirisinin bady'si calismaya da bilir
    }
}
