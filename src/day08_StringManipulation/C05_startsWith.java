package day08_StringManipulation;

public class C05_startsWith {

    public static void main(String[] args) {
        /*
        Bir String'in belirli baska bir string ile baslayip baslamadigini kontrol eder
        Iki kullanimi vardir
        Ilkinde bastan bakar
        Ikinci kullanimda istediginiz indexin istediginiz bir String ile baslayip baslamadigini kontrol eder
         */

        String str = "Java ogrenmek cok guzel, cok";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java ")); // true
        System.out.println(str.startsWith("Java ogrenmek cok guzel, cok")); // true

        System.out.println(str.startsWith("ogrenmek", 5)); // true // 5. index ogrenmek ile mi basliyor

    }
}
