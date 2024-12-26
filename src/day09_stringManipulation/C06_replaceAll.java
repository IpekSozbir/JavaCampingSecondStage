package day09_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // J1a4v*a )G*&^56uzel_!dir.
        // Java Guzeldir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scan.nextLine();

        // once sayilardan kurtulun
        metin = metin = metin.replaceAll("\\d", "");

        // ozel karakterleri silmeden once bosluklari korumaya almamiz gerek
        // yukarida sayilari yok etmistik space yerine herhangi bir rakam yazalim

        metin = metin.replace(" ","3");

        // ozel karakterlerden kurtulun
        metin =  metin.replaceAll("\\W",""); // W rakam harf ve altcizgi disindaki her sey demektir

        // _'yi yok edelim
        metin = metin.replaceAll("_","");

        // space'i geri getirelim
        metin = metin.replaceAll("3"," ");

        // en sona bir nokta ekleyelim
        metin = metin + ".";

        System.out.println(metin);
    }
}
