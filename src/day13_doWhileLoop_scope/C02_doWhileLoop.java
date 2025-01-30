package day13_doWhileLoop_scope;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // sayidan baslayarak 0'a kadar olan sayilari yazdirin (0 haric)
        // ornek input: 5 output: 5 4 3 2 1

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int girilenSayi = scan.nextInt();

        // 1.negatif durum : loop body calisma sayisindan, daha fazla kontrol var

       /* while (girilenSayi > 0) {
            System.out.print(girilenSayi+" ");
            girilenSayi--;
        }

        */

        // loop body calisma sayisi ile kontrol sayisi esit, ayni

        do {
            System.out.println(girilenSayi+" ");
            girilenSayi--;
        } while (girilenSayi>0);
    }
}
