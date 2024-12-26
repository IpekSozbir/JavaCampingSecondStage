package day09_stringManipulation;

import java.util.Scanner;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java ile yazilim dunyasina giris yap";

        System.out.println(str.replaceFirst("a", "A"));

        // str.replaceFirst('a','A') // replaceFirst methodu char paramaetre kabul etmez

        str = "Java 1-3 ayda ogrenilir";

        System.out.println(str.replace("1", "2"));

        // kullanicidan bir cumle isteyin
        // eger cumle icinde rakam varsa, ilk rakam yerine X yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine();

        // regex regular expression ==> belirlenmis kisaltmalar

        //  \\d	Bir rakam (0-9)
        //  \\D	Rakam olmayan karakter
        //  \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
        //  \\W	Kelime karakteri olmayan bir karakter
        //  \\s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
        //  \\S	Beyaz boşluk olmayan karakter

        System.out.println(cumle.replaceFirst("\\d", "X"));
    }
}
