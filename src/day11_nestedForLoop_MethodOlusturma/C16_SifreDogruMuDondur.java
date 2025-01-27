package day11_nestedForLoop_MethodOlusturma;

public class C16_SifreDogruMuDondur {
    public static void main(String[] args) {

        // Verilen sifre icin
        // asagidaki sartlari kontrol edip
        // kullaniciya duzeltmesi gereken tum eksikleri yazdiran,
        // tum sartlari kontrol ettikten sonra
        // sifrede hata yoksa true, hata varsa false donduren
        //  bir method olusturun
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        System.out.println(sifreDogruMu("Ali kos")); // false
       /*
            method'un icinde hatalari yazdirdi
            ilk harf kucuk harf olmali
            son karakter rakam olmali
            sifre bosluk icermemeli
            sifrenin uzunlugu en az 10 karakter olmali
         */
        System.out.println(sifreDogruMu("aliOkulaKos123"));
    }

    public static boolean sifreDogruMu (String sifre) {
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
       return true;
      } else {
          return false;
      }
    }
}
