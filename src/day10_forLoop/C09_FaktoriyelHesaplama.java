package day10_forLoop;

import java.util.Scanner;

public class C09_FaktoriyelHesaplama {

    public static void main(String[] args) {

        // Kullanicidan 14’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // 5! = 5*4*3*2*1==>120

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 14'ten kucuk pozitif bir tam sayi giriniz:");
        int sayi = scan.nextInt();

        int faktoriyelDegeri =1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyelDegeri *= i;
        }

        System.out.println(sayi+"! = "+ faktoriyelDegeri);
    }
}
