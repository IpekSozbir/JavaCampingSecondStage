package day09_stringManipulation;

import java.util.Scanner;

public class C10_IsimDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scan.nextLine();


        if (isim.length() > soyisim.length()){ // isim daha uzun
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            System.out.println(
                    isim.substring(0,1).toUpperCase()+ // ilk harf buyuk harf
                            isim.substring(1).toLowerCase()+ // kalanlar kucuk harf
                            " "+
                            soyisim.substring(0,1).toUpperCase()+ // ilk harf buyuk harf
                            soyisim.substring(1).toLowerCase() // kalanlar kucuk harf
            );



        } else if (soyisim.length() > isim.length()) { // soyisim daha uzun
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin

            System.out.println(
                    isim.substring(0,1).toUpperCase()+ // ilk harf buyuk harf
                            isim.substring(1).toLowerCase()+ // kalanlar kucuk harf
                            " "+
                            soyisim.toUpperCase()
            );
        }
    }
}
