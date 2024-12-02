package day05_IfElseStatements;

import java.util.Scanner;

public class C05_SayacMethodu {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Girilen sayilar hicbir sarti saglamiyor" yazdirin
        // 6-Eger tum if bodyleri calistiysa "Mukemmel sayi secmissiniz" yazdirin
        // 7-Eger 2 sarti saglamissa "Idare eder" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz: ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sayac = 0;

        if ( sayi1 < sayi2 ){
            System.out.println("Birinci sayi daha kucuk");
            sayac++;
        }

        if ( sayi1 > 0 ) {
            System.out.println("Birinci sayi sifirdan buyuk");
            sayac++;
        }

        if ( sayi2 > 50 ) {
            System.out.println("Ikinci sayi 50'den buyuk");
            sayac++;
        }

        if ( sayi2 % 5==0 ) {
            System.out.println("Ikinci sayi 5'in tam kati");
            sayac++;
        }

        if (sayac ==0 ) System.out.println("Girilen sayilar hicbir sarti saglamiyor");

        if (sayac == 4 ) System.out.println("Mukemmel sayi secmissiniz");

        if ( sayac == 2 ) System.out.println("Idare eder");
        
    }
}
