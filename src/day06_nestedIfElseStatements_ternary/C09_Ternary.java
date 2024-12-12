package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // sayi 100den buyukse degerini 10 azaltin
        // sayi 100 veya 100den kucukse degerini 10 arttirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi = scan.nextInt();

        sayi = sayi> 100 ? sayi-10 : sayi+10;
        System.out.println(sayi);


        // sayi cift ise sayinin degerini yariya indirin
        // sayi tek ise sayinin degerini yirmi artirin

        sayi = sayi%2==0 ? sayi/2 : sayi+20;

        System.out.println(sayi);
    }
}
