package day10_forLoop;

public class C02_ForLoop {

    public static void main(String[] args) {

        //1'den 10'a kadar (10 haric) olan tamsayilari yanyana aralarinda bosluk birakarak yazdirin

        for (int i = 1     ;      i < 10  ;    i++) {

            System.out.print(i +" ");

        }

        // forloop icindeki olusturulan variable gecici variabledir
        // i: loop boyunca kullanmak istedigimiz degerleri kullanmamiza izin veren gecici variabledir
        // sadece loop icerisinde gecerlidir. Loop disida kullanilamaz

        // i<10 boolean sarttir, bu sart true oldugu muddetce loop calismaya devam eder
        // false oldugunda loop biter

        //i++ baslangic degerinden itibaren i'nin nasil degisecegini belirler

    }
}
