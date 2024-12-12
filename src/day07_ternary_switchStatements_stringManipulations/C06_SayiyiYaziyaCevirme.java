package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C06_SayiyiYaziyaCevirme {

    public static void main(String[] args) {

        // Kullanicidan 100'den kucuk bir dogal sayi (sinirlar haric) girmesini isteyin
        // girilen sayiyi metin olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0-99 arasi bir sayi giriniz: \n0 ve 100 kullanilamaz");
        int sayi = scan.nextInt();


        int birlerBasamagi = sayi%10;
        int onlarBasamagi = sayi/10;

        switch (onlarBasamagi) {
            case 0:
                break;
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kirk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmıs ");
                break;
            case 7:
                System.out.print("Yetmis ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");

        }

        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("Iki");
                break;
            case 3:
                System.out.print("Uc");
                break;
            case 4:
                System.out.print("Dort");
                break;
            case 5:
                System.out.print("Bes");
                break;
            case 6:
                System.out.print("Alti");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
        }
    }
}
