package day09_stringManipulation;

import java.util.Scanner;

public class C09_SifreKontrol {

    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz: ");
        String sifre = scan.nextLine();

        int sayac = 0;

        if (! Character.isLowerCase(sifre.charAt(0)) ) {
            System.out.println("Ilk harf kucuk harf olmali");
            sayac++;
        }

        if (! Character.isDigit(sifre.charAt(sifre.length()-1)) ) {
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }

        if (!(sifre.length()>=10)) {
            System.out.println("Sifre uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        // sayac 0-4 arasi olabilir
        // eger 0'sa hata yok demektir
        // eger 4'se hepsi hatali

        if (sayac==0) {
            System.out.println("Sifre basariyla kaydedildi");
        }
    }
}
