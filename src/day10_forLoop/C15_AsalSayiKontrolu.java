package day10_forLoop;

import java.util.Scanner;

public class C15_AsalSayiKontrolu {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi isteyip
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int girilenSayi = scan.nextInt();

        // verilen sayinin asal olmadigina hemen karar verebiliriz
        // cunku herhangi bir sayiya bolunuyorsa asal olamaz
        // ama asal olduguna hemen karar veremeyiz
        // 2'den o sayiya kadar tum tam sayilari deneyip hicbirine bolunmezse o zaman asal diyebiliriz

        int flag =20;

        for (int i = 2; i <girilenSayi-1 ; i++) {
            if (girilenSayi%i==0) {
                System.out.println("Girilen sayi asal sayi degil");
                flag =42;
                break;
            }
        }

        // flag icin 2 olasi deger var. eger flag == 20 ise asaldir

        if (flag==20) System.out.println("Girilen sayi asal");
    }
}
