package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C10_Ternary_AtamaYazdirma {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // sayi cift ise "cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin

        // Ternary tek basina kullanilmaz
        // ya sout icinde ya da
        // bir variable'a atanmalidir


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scan.nextInt();

        // bu soru ternary ile cozulemez cunku atama ve yazdirma ayir ayri isteniyor


        int verilenSayi = 23;

        if (verilenSayi % 2 == 0){
            System.out.println("Cift sayilari sevmem");
        } else {
            verilenSayi += 10 ;
        }


        // verilen bir sayinin degerini kontrol edip
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin ve yeni degeri yazdirin

        verilenSayi = 45;

        System.out.println( verilenSayi % 2 == 0 ? "Cift sayilari sevmem"  : (verilenSayi+=10)    );


        // verilen 3 basamakli bir sayinin degerini kontrol edip
        // 500'den buyukse rakamlar toplamini yazdirin
        // 500'den buyuk degilse 10'lar basamagindaki rakami yazdirin

        // Bu tur uzun islem gerektiren gorevler de Ternary ile YAPILAMAZ

    }
}
