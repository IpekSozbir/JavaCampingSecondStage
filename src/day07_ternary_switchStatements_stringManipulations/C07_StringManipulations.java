package day07_ternary_switchStatements_stringManipulations;

import java.util.Locale;

public class C07_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Candir";

        // buyuk harfe cevirme
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir. yani anlik degisim kalici degil

        // kucuk harfe cevirme
        System.out.println(str.toLowerCase()); //java candir

        // str'i kucuk harfe cevirip o haliyle kaydedin

        // bir String2in degerini kalici olarak degistirmek istiyorsak atama yapmaliyiz

        str = str.toLowerCase();
        System.out.println(str);

        // kalici olarak buyuk harfe cevir
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println("turkce karakterle "+ str);

        System.out.println(str.toLowerCase()); //java candır

    }
}
