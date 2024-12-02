package day05_IfElseStatements;

import java.util.Scanner;

public class C06_FlagMethodu {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Girdiginiz sayilar hicbir sarti saglamiyor" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz: ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int flag = 47; // flag'a atanan degerin kac oldugu hic onemli degil
        // ifler calisirsa flaga baska deger veriyorum hep ayni deger olmali

        if ( sayi1 < sayi2 ){
            System.out.println("Birinci sayi daha kucuk");
            flag = 72;
        }

        if ( sayi1 > 0 ) {
            System.out.println("Birinci sayi sifirdan buyuk");
            flag = 72;
        }
        if ( sayi2 > 50 ) {
            System.out.println("Ikinci sayi 50'den buyuk");
            flag = 72;
        }

        if ( sayi2 % 5==0 ) {
            System.out.println("Ikinci sayi 5'in tam kati");
            flag = 72;
        }

        // sona geldigimizde flag icin iki ihtimal var
        // flag bastaki degere(47) esitse hic bir sarti saglamadi demektir
        // flag if bodylerinde verilen degerer esitse (72) en az bir sarti sagladi demektir
        // ama kaci calistigini bilemeyiz

        if (flag == 47 ) System.out.println("Girilen sayilar hicbir sarti saglamiyor");

    }
}
