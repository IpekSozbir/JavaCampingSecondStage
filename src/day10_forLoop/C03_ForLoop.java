package day10_forLoop;

public class C03_ForLoop {

    public static void main(String[] args) {

        // iki basamakli sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 10; i <=99 ; i++) {

            toplam+=i;
        }
        System.out.println("Toplam: "+toplam);


        // uc basamakli pozitif cift sayilarin toplamini yazdirin

        toplam =0;

        for (int i = 100; i <1000 ; i+=2) {

            toplam+=i;
        }
        System.out.println("Toplam: "+toplam);

        // 234'den baslayip 673'e kadar (673 dahil) 7'ser 7'ser arttirarak sayilari yanyana yazdirin

        for (int i = 234; i <=673 ; i+=7) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 3 basamakli pozitif tamsayilardan 11'e bolunebilenleri yanyana yazdirin

        for (int i = 100; i <=999 ; i++) {

            if (i%11==0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("");

        // 437 ile 681 (sinirlar dahil) arasinda 23 ile bolunebilen sayilari yanyana yazdirin

        for (int i = 437; i <682 ; i++) {
            if (i%23==0) {
                System.out.print(i+" ");
            }
        }
    }
}
