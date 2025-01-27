package day11_nestedForLoop_MethodOlusturma;

public class C15_SifreKontrolu {
    public static void main(String[] args) {


        // Verilen sifre icin
        // asagidaki sartlari kontrol edip
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyen,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdiran
        // bir method olusturun
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        sifreDogruMuYazdir("Java iyi calisiyor");
        //ilk harf kucuk harf olmali
        //son karakter rakam olmali
        //sifre bosluk icermemeli

        sifreDogruMuYazdir("javaYapmis1");
        // sifre basariyla kaydedildi
    }

    public static void sifreDogruMuYazdir (String sifre) {
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

        if (sayac==0) {
            System.out.println("Sifre basariyla kaydedildi");
        }
    }
}
