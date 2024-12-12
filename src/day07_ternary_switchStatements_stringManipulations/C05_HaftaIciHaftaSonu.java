package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C05_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // Kullanicidan gun ismini alin
        // buyuk kucuk harf fark etmez
        // girilen gunun haftaici veya haftasonu oldugunu yazdirin
        // kullanici gun ismini yanlis girerse uyarin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz: ");
        String gunIsmi = scan.nextLine().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis");
        }
    }
}
