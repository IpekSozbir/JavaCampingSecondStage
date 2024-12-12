package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C04_HaftaninCalismaGunleri {

    public static void main(String[] args) {

        // Kullanicidan gun ismini alin
        // buyuk kucuk harf fark etmez
        // girilen gun haftaici ise o gun haric haftasonuna kac gun kaldigini yazidirin
        // cuma ise yarin haftasonu
        // cumartesi ise bugun tatilin ilk gunu
        // pazar ise maalesef yarin is basliyor yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz: ");
        String gunIsmi = scan.nextLine().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi" :
                System.out.println("Haftasonuna daha 4 gun var");
                break;
            case "sali" :
                System.out.println("Haftasonuna daha 3 gun var");
                break;
            case "carsamba" :
                System.out.println("haftasonuna daha 2 gun var");
                break;
            case "persembe" :
                System.out.println("Haftasonuna daha 1 gun var");
                break;
            case "cuma" :
                System.out.println("Yarin haftasonu");
                break;
            case "cumartesi" :
                System.out.println("Bugun tatilin ilk gunu");
                break;
            case "pazar" :
                System.out.println("Maalesef yarin is basliyor");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis");
        }
    }
}
