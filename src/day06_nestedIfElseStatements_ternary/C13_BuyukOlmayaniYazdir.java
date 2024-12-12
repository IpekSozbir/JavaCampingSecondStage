package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C13_BuyukOlmayaniYazdir {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz: ");
        int sayi1 = scan.nextInt();

        int sayi2 = scan.nextInt();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);
    }
}
