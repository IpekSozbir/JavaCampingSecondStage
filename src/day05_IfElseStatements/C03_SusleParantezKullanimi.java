package day05_IfElseStatements;

import java.util.Scanner;

public class C03_SusleParantezKullanimi {

    public static void main(String[] args) {

        // Kullanicidan iki tam sayi isteyin
        // eger birinci sayi daha kucukse
        // iki sayiyi yazdirin
        // alt satira gecip "ilk sayi daha kucuk" yazdirin

        // eger 2. sayi cift ise
        // "2. sayi cift" yazdirin
        // alt satira "cift sayilari severim" yazin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz:");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 < sayi2) {
            System.out.println("Girilen sayilar: " + sayi1 + " ve " + sayi2);
            System.out.println("ilk sayi daha kucuk");
        }

        if (sayi2 % 2 ==0) {
            System.out.println("2. sayi cift \ncift sayilari severim");
        }

        // eger if cumlesinde boolean sarttan sonra { kullanilmazsa
        // java if boy'si olarak ilk ;'e kadar olan kismi alir
        // sonraki sartlarin if ile ilgisi olmaz
        // ik satir her durumda calisir
        // ilk satirdan sonrasi yok sayilir

        // kullanimda suna dikkat etmeliyiz: if body'si sadece 1 satir ise { kullanmazsak da olabilir
        // fakat if body'si bir satirdan fazla ise mutlaka { kullanmaliyiz

    }
}
