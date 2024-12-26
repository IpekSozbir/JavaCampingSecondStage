package day09_stringManipulation;

import java.util.Scanner;

public class C01_indexOfSoru {

    public static void main(String[] args) {

        // Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
        //-String aranan metni icermiyor
        //-Aranan metin String’de sadece 1 kere kullanilmis
        //-Aranan metin String’de sadece 1’den fazla kullanilmis

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arama yapilacak metni giriniz: ");
        String anaMetin = scan.nextLine();

        System.out.println("Lutfen arama yapilacak kelime veya metni giriniz: ");
        String aranacakMetin = scan.nextLine();

        // anaMETİN = Javayi cok sevdik, hem de cok cok sevdik
        // aranacak metin = java

        int ilkKullanimIndexi = anaMetin.indexOf(aranacakMetin);
        int sonKullanim = anaMetin.lastIndexOf(aranacakMetin);

        if (ilkKullanimIndexi==-1) {
            System.out.println("Ana metin aranacak metni icermiyor");
        } else if (ilkKullanimIndexi==sonKullanim) {
            System.out.println("Ana metin aranacak metni sadece 1 kere iceriyor");
        } else {
            System.out.println("Ana metinde aranacak metin birden fazla kullanilmis");
        }
    }
}
