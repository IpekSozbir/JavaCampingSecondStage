package day12_methodOverloading_WhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // while loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tam sayilari yazdirin

        /*
        while ile yaptıgımız icin baslangic-bitis degerlerini ve artis miktarini belirlemeliyiz
         */


        String sayilar = "" ;
        int sayi = 10;

        while (sayi<100) {

            if (sayi%7==0) {
                sayilar+= sayi + "," ; //yani 7ye bolunebiliyorsa bir stringin icinde yazdirsin diye yukarda string yaptik
            }
            sayi++;
        }
        System.out.println(sayilar);

        // while loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tam sayilarin toplamini yazdirin

        int toplam = 0;
        int sayi2 = 10;

        while (sayi2<100) {

            if (sayi2%7==0) {
                toplam+= sayi2; //yani 7ye bolunebiliyorsa bir stringin icinde yazdirsin diye yukarda string yaptik
            }
            sayi2++;
        }
        System.out.println("toplam: "+toplam);
    }
}
