package day08_StringManipulation;

public class C03_contains {

    public static void main(String[] args) {

        // Verilen bir String variable icinde baska bir String variable olup olmadıgını kontrol eder
        // kontrol edip sonuc olarak kac tane oldugunu vermez
        // varsa true yoksa false verir
        // yani boolean sonuc doner
        // contains case sensitive'dir. Buna gore arama yapar
        // parametre olarak sadece String deger kabul eder

        String str = "Ne guzel 1 gun";

        System.out.println(str.contains("e")); // true
        System.out.println(str.contains("ne")); // false
        System.out.println(str.contains("guzel")); //true
        System.out.println(str.contains("uz")); // true

        System.out.println(str.contains("1")); // alttaki de bunun bi versiyonu string hale getirmek icin
        System.out.println(str.contains(1+""));
        /*
        int sayi = 1;
        System.out.println(str.contains(sayi+""));
        // bu da bi yontem
         */

        // contains methodu String disinda parametre kabul etmez. Bu nedenle int olan 1 degerini string'e cevirmek gerekir
        // yanina String bir hiclik koydugumuzda bu  icerdeki tum degerlerin String algilanmasini saglar

    }
}
