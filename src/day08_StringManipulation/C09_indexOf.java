package day08_StringManipulation;

public class C09_indexOf {

    public static void main(String[] args) {

        // indexOf methodu tek parametre ile yazilirsa o parametrenin ilk bulundugu index'i
        // iki parametre olarak yazilirsa da verilen indexten sonra ki ilk kullanilan index'i verir DIKKAT


        String str = "Cok calismam lazim cok";

        System.out.println(str.indexOf('a')); // a'nin hangi indexte oldugunu söyledi // 5
        System.out.println(str.indexOf("calis")); // calis hangi indexten itibaren basliyor // 4
        System.out.println(str.indexOf('o',5));  // DIKKAT: Aramaya verilen indexten başlar fakat index yazarken baştan sayar

        //metin icinde olmayan bir harf ya da kelime aranirsa
        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf("murat"));
        //sonuc -1 yazarsa aranan şey metinde yoktur
    }
}
