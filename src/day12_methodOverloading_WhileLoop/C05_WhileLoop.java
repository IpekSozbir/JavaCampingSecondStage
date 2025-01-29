package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere pozitif tam sayilar isteyin
        Kullaniciya bitirmek istediginde Q'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        ve bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse
        "negatif sayi kullanamazsiniz " yazdirin
        bu negatif sayiyi sayi adedine ve toplama eklemeyin
        */

        Scanner scan = new Scanner(System.in);

        String harf2 = "";
        int toplam2 = 0;
        int sayac2 = 0;
        int sayi2 = 0;
        while (!(harf2.equals("Q") || harf2.equals("q"))) {
            System.out.println("Toplanmak uzere pozitif tam sayilar giriniz\nIslem sonucunu gormek icin Q tusuna basiniz\nSayi: ");
            if (scan.hasNextInt()) {  // Kullanicinin int bir sayi girip girmedigini kontrol ediyor
                sayi2 = scan.nextInt();
                if (sayi2 < 0) {
                    System.out.println("Negatif sayi kullanilamaz");
                } else {
                    toplam2 += sayi2;
                    sayac2++;
                }
            } else {
                // Harf girdisini aliyoruz ve kontrol ediyoruz
                harf2 = scan.next();
                if (!(harf2.equals("Q") || harf2.equals("q"))) {
                    System.out.println("Lutfen geçerli bir sayi veya 'Q' giriniz.");
                }
            }
        }
        // Sonuclari yazdiriyoruz
        System.out.println("Girilen pozitif tam sayi adedi: " + sayac2);
        System.out.println("Girilen pozitif tam sayilarin toplami: " + toplam2);
    }
}

