package day09_stringManipulation;

import java.util.Scanner;

public class C11_IsimDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan bir String alin;
        // String'in uzunlugu cift sayi ise tam ortasina :) ekleyin
        // String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scan.nextLine();

        if (metin.length()%2==0) {
            // String'in uzunlugu cift sayi ise tam ortasina :) ekleyin
            System.out.println(
                    metin.substring(0, metin.length()/2) +
                            ":)" +
                            metin.substring(metin.length()/2));


        } else {
            // String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin
            System.out.println(

                    metin.substring(0,metin.length()/2)+
                            ":("+
                            metin.substring( 1+metin.length()/2   )

            );
        }
    }
}
