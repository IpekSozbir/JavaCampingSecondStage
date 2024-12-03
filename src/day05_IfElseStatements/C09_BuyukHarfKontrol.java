package day05_IfElseStatements;

import java.util.Scanner;

public class C09_BuyukHarfKontrol {

    public static void main(String[] args) {

        // Soru- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        // 1. yontem = ASCII Table

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Girilen karakter buyuk harf");}
        else {
            System.out.println("Girilen harf buyuk harf degil");
        }

        //2. yontem = wrapper class kullanimi

        if (Character.isUpperCase(karakter)){
            System.out.println("Girilen karakter buyuk harf");}
        else {
            System.out.println("Girilen harf buyuk harf degil");
        }

    }
}
