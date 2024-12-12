package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C01_NestedTernary {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int sayi = scan.nextInt();


        // Sayi, 0'dan buyukse "pozitif"
        // 0'dan buyuk degilse "pozitif degil" yazdirin

        System.out.println( sayi > 0 ? "pozitif" : "pozitif degil");



        // Sayi, 0'dan buyukse "pozitif",
        // 0'dan kucukse "negatif",
        // 0 ise "notr" yazdirin

        System.out.println( sayi>0 ? "pozitif" : ( sayi<0 ? "negatif" : "notr") );
    }
}
