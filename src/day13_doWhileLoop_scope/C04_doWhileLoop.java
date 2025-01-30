package day13_doWhileLoop_scope;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {


        // Kullanicidan pozitif bir tam sayi alin
        // sayidan baslayarak 0'a kadar olan tamsayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int girilenSayi = scan.nextInt();


        /*
        do while loop icin ;

        pozitif yanlari:
        - kontrolden once loop body'si bir kere calisir,
        boylece ilk atamada hata yapma riskini giderir
        - loop body calisma sayisiyla kontrol sayisi ayni

        negatif yanlari:
        - kontrolden once loop body'si bir kere calisir,
        eger kullanici istenmeyen bir deger girmisse,
        o deger bir defa loop da calistirilir
         */

        do {
            System.out.print(girilenSayi+ " ");
            girilenSayi--;

        } while (girilenSayi > 0);

    }
}
