package day08_StringManipulation;

public class C06_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        System.out.println(str.endsWith("i")); // true
        System.out.println(str.endsWith("zevkli")); // true
        System.out.println(str.endsWith("cok zevkli")); // true

    }
}
