package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C06_NestedIfElse_Indirim_UrunAdediTemelDegiskeniIle {

    public static void main(String[] args) {

        /*
        Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun.
        Musteri karti varsa ve 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        Musteri karti yoksa ve 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz: ");
        int urunAdedi = scan.nextInt();
        System.out.println("Lutfen urunun indirimsiz fiyatini giriniz: ");
        double urunFiyati = scan.nextDouble();

        double indirimsizToplamFiyat = urunAdedi * urunFiyati;

        System.out.println("Musteri kartiniz var mı?: E:'evet H: 'Hayir");
        char kartVarMı = scan.next().toUpperCase().charAt(0);

        //Temel degisken urun adedi olsun

        if (urunAdedi<=0){
            System.out.println("Urun adedi girisi yanlıs");
        } else if (urunAdedi<=10) {
            // 0-10 urun alanlar icin karta gore degerlendirme yapalim
            if (kartVarMı=='E') {
                System.out.println("%15 indirimli toplam fiyat:" + indirimsizToplamFiyat* 85/100);
            } else if (kartVarMı=='H') {
                System.out.println("%10 indirimli toplam fiyat:" + indirimsizToplamFiyat* 90/100);
            } else {
                System.out.println("Kart bilgisi icin e veya h girilmeli");
            }
        } else {
            //10 urunden fazla alanlar icin karta gore degerlendirme yapalim
            if (kartVarMı=='E') {
                System.out.println("%20 indirimli toplam fiyat:" + indirimsizToplamFiyat* 80/100);
            } else if (kartVarMı=='H') {
                System.out.println("%15 indirimli toplam fiyat:" + indirimsizToplamFiyat* 85/100);
            } else {
                System.out.println("Kart bilgisi icin e veya h girilmeli");
            }
        }
    }
}