package day13_doWhileLoop_scope;

import java.util.Scanner;

public class C03_KullanicidanAlinanSayilariToplama {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tam sayilar isteyin
        // kullanici 0'a basincaya kadar islemi devam ettirin
        // kullanici 0'a bastiginda (0 haric) kac sayi girdigini ve toplamlarinin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1; // buna 0 yazma da baska herhangi bir deger ver cunku asagida 0 la calismaz
        int toplam = 0;
        int sayac = 0;

       /* while (girilenSayi != 0) {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz: \n bitirmek icin 0 a basınız");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        }
        System.out.println("girilen " + sayac + "adet sayinin toplami :  " + toplam );

        */

        // Bizim ilk atama yaptigimiz degeri while kontrolune sokmadan
        // kullanicidan deger aliyor
        // boylece ilk deger atamasi yaparken hata yapmamizi engelliyor

        do {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz: \n Bitirmek icin 0 a basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0 ) {
                toplam += girilenSayi;
                sayac++;
            }
        }while (girilenSayi != 0);

        System.out.println("Girilen " + sayac + "adet sayinin toplami :  " + toplam );
    }
}
