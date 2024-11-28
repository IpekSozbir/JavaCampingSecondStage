package day05_IfElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Soru- Kullancidan bir sayi alin,
        // sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi",
        // 5 ile bolunuyorsa "Bes ile bolunen sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");

        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 ==0 ) {
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (girilenSayi % 5 ==0 ) {
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
