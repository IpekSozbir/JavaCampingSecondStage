package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C07_NestedIfElse_HarfKontrolu {

    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "Guzel harf"
                - b,c veya d ise "Idare eder"
                - diger kucuk harfler icin "Girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "Guzel harf"
                - L, V veya Z ise "Idare eder"
                - diger buyuk harfler icin "Girilen buyuk harfi begenmedim" yazdirin
           Kullanici harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char girilenKarakter = scan.next().charAt(0);

        // degisken tek ama iki kademeli bir secim yapmaliyiz
        // 1. kademe kucuk harf, buyuk harf ve geriye kalanlar

        if (girilenKarakter>='a' && girilenKarakter<='z') { // kucuk harf secimini ASCIIyle yapalim
            if (girilenKarakter=='a') System.out.println("Guzel harf");
            else if (girilenKarakter == 'b' || girilenKarakter == 'c'
                    || girilenKarakter == 'd') System.out.println("Idare eder");
            else System.out.println("Girilen kucuk harfi begenmedim");         }

        else if (Character.isUpperCase(girilenKarakter)) { // buyuk harf secimi Wrapper Classla
            if (girilenKarakter=='K') System.out.println("Guzel harf");
            else if (girilenKarakter == 'L' || girilenKarakter == 'V'
                    || girilenKarakter == 'Z') System.out.println("Idare eder");
            else System.out.println("Girilen buyuk harfi begenmedim");
        } else {
            System.out.println("Tanimlanmamis karakter");
        }
    }
}
