package day05_IfElseStatements;

import java.util.Scanner;

public class C08_EmeklilikHesaplama {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // degilse emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas = scan.nextDouble();

        if ( yas >= 65 ) System.out.println( "Emekli olabilirsin");
        else System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");

    }
}
