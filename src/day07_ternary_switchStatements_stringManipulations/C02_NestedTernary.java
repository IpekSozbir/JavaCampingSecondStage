package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C02_NestedTernary {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int sayi = scan.nextInt();


        System.out.println(

                sayi > 0

                        ?

                        sayi%2==0 ?"cift sayi" : "cift sayi degil"  //sayi pozitif ise calisacak kodlar

                        :

                        sayi>=-999 && sayi<=-100 ? "3 basamakli sayi" : "3 basamakli sayi degil"   //sayi pozitif degilse calisacak kodlar

        );

        // System.out.println( sayi > 0 ? sayi % 2 == 0 ? "cift sayi":"cift sayi degil":sayi>=-999 && sayi<=-100 ?"3 basamakli sayi":"3 basamakli sayi degil");
    }
}
