package day07_ternary_switchStatements_stringManipulations;

public class C09_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(2)); // v

        /*
        Javada karakter sayisi ve indeks farklidir

        kac karakter oldugunu kontrol ederken 1'den baslar
        ama index icin 0'dan baslar

        Bir String'de son indeks (karakter sayisi kadar -1) dir
         */

        // bastan 6. karakteri yazdirin
        System.out.println(str.charAt(5)); // C

        // son karakteri yazdirin
        System.out.println(str.charAt(10)); // r

        // olmayan bir indeks kullanilirsa
        // System.out.println(str.charAt(13));// StringIndexOutOfBoundsException

    }
}
