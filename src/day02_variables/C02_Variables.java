package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

        // java çalışmaya main methoddan başlar
        // sonra yukarıdan aşagı, soldan saga dogru çalısır
        // eger istersek bir variable'ı declare edip sonra deger atayabiliriz

        String okulIsmi;

        // Java deger ataması yapmadığımız bir variable oluşturmamıza itiraz etmez
        // ancak deger ataması yapıncaya kadar o variableyi kullanmamıza izin vermez

        okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi);

        okulIsmi = "Star Koleji";
        System.out.println(okulIsmi);

        // println ile print arasındaki fark
        // println dediğinizde yazdırma işleminden sonra alt satıra geçerken
        // sadece print dediğimizde yazdırma işleminden sonra alt satıra geçmez

        okulIsmi = "Java Koleji";
        System.out.print(okulIsmi);
        System.out.println(" " + okulIsmi);

        okulIsmi = "Star Koleji";
        System.out.print(okulIsmi);
    }

}
