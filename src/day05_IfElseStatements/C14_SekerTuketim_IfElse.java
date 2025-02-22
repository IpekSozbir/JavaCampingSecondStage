package day05_IfElseStatements;

import java.util.Scanner;

public class C14_SekerTuketim_IfElse {

    public static void main(String[] args) {

        /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz: ");
        double caySayisi = scan.nextDouble();

        if (caySayisi<=0) {
            System.out.println("Girmis oldugunuz bardak sayisiyla hesaplama yapilamaz...");
        } else {
            System.out.println("Her bardak icin kac kup seker kullaniyorsunuz: ");
        }

        double sekerSayisi = scan.nextDouble();

        double yillikseker = (caySayisi*sekerSayisi*365*2.77)/1000;
        double kirkyillikseker = (caySayisi*sekerSayisi*365*2.77*40)/1000;

        if (sekerSayisi<0) {
            System.out.println("Negatif seker degeriyle hesaplama yapilamaz...");
        } else if (sekerSayisi==0) {
            System.out.println("Aferin, boyle devam et :)");
        } else {
            System.out.println("Yillik seker tüketiminiz (kg): "+ yillikseker + "\n" + "40 yillik seker tiketiminiz (kg): "+ kirkyillikseker);
        }
    }
}
