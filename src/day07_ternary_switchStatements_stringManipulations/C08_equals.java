package day07_ternary_switchStatements_stringManipulations;

public class C08_equals {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ALI";
        String str3 = "ali";
        String str4 = "Ali ";
        String str5 = "Ali";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equals(str5)); // true
        System.out.println(str2.equals(str3)); // false

        // yazim farkliligi veya farkli karakter olursa sonuc false olur

        // eger sadece buyuk kucuk harf farkliliklarini gozardi etmek istersek
        System.out.println("===================");
        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==> ALI ==> true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ali <==> ali ==> true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ali <==> Ali  ==> false FARKLI KARAKTER VAR
        System.out.println(str1.equalsIgnoreCase(str5)); // Ali <==> Ali ==> true
        System.out.println(str2.equalsIgnoreCase(str3)); // ALI <==> ali ==> true

    }
}
