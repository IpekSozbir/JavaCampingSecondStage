package day05_IfElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan iki tam sayi isteyin
        // eger 1. sayi daha buyukse, "Girilen ilk sayi daha buyuk",
        // eger 2. sayi cift sayi ise "Girilen 2. sayi cift",
        // eger 1. sayi pozitif sayi ise "Pozitif sayilar guzeldir" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        // eger 1.sayi daha buyukse, "Girilen ilk sayi daha buyuk" yazdirin
        if (sayi1 > sayi2){
            System.out.println("Girilen ilk sayi daha buyuk");
        }

        // eger 2.sayi cif sayi ise "Girilen 2.sayi cift" yazdirin
        if ( sayi2 % 2 == 0){
            System.out.println("Girilen 2.sayi cift");
        }

        // sayi1 pozitifse "Pozitif sayilar guzeldir"
        if (sayi1 > 0){
            System.out.println("Pozitif sayilar guzeldir");
        }
    }
}
