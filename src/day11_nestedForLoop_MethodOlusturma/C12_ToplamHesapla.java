package day11_nestedForLoop_MethodOlusturma;

public class C12_ToplamHesapla {
    public static void main(String[] args) {

        // Verilen iki tam sayi ve aralarindaki tum tam sayilari toplayip
        // sonucu donduren bir method olusturun

        araliktakiToplamiGetir(4,6); // calisir ama yazdirmadigimiz icin goremeyiz kaydetmedigimiz icin kullanamayiz
        System.out.println(araliktakiToplamiGetir(8,10)); // yazdirir ama tekrar kullanamayiz
        int ikiBasamakliSayilarToplami = araliktakiToplamiGetir(10,99); // yazdirmadigin icin gorunmez ama istedigin zaman kullanilabilir

        // iki basamakli sayilarin toplaminin asal olup olmadigini yazdirin
        C11_AsalSayiMi.asalMiYazdir(ikiBasamakliSayilarToplami);
    }

    public static int araliktakiToplamiGetir (int baslangic, int bitis) {
        int toplam =0;

        if (baslangic<bitis) {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }
        } else {
            for (int i = bitis; i >=baslangic ; i--) {
                toplam += i;
            }
        }
        return toplam;
    }

}
