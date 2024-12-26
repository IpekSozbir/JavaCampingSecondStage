package day08_StringManipulation;

public class C10_lastIndexOf {

    public static void main(String[] args) {

        /*
        lastindexof method'u indexof method'una benzer
        fakat bu method sondan itibaren aranan degerin nerede olduguna bakar
        sondan basa dogru arar
        fakat bulunda hangi indexte oldugunu bastan sayarak soyler
         */

        String str = "cok calismam lazim cok";
        System.out.println(str.indexOf("cok")); //0 // indexof bastan aramaya basladı aha buldum dedi
        System.out.println(str.lastIndexOf("cok")); //19 // lastindexof sondan aramaya basladı aha buldum dedi

        // cok kelimesi ne kadar kullanilmis
        int a = str.indexOf("cok");
        int b = str.lastIndexOf("cok");

        if (a==b) {
            System.out.println("cok kelimesi 1 kere kullanilmis");
        } else {
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }






    }
}
