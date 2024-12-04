package day05_IfElseStatements;

import java.util.Scanner;

public class C12_VucutKitleEndeksi {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse "obez",
        // 25-30 arasi ise "kilolu", 20-25 arasi ise "normal",
        // 20’den kucukse "zayif" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Kilogram olarak kilonuzu giriniz:" );
        double kilo = scan.nextDouble();

        System.out.println("Cm olarak boyunuzu giriniz:");
        double boy = scan.nextDouble();
        double vke = (kilo*10000 / (boy *boy));

        if ( !(kilo<30 || boy <50)) {
            System.out.println("Vucut kitle endeksiniz: " + vke);
        }


        if (kilo<30 || boy <50)
            System.out.println("Verilen degerler icin vucut kitle endeksi hesaplanamaz");
        else if (vke > 30) System.out.println("Durumunuz : obez");
        else if (vke > 25) System.out.println("Durumunuz : kilolu");
        else if (vke > 20) System.out.println("Durumunuz : normal");
        else System.out.println("Durumunuz : zayıf");

    }

}
