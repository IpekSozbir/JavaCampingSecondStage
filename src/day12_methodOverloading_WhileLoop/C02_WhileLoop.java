package day12_methodOverloading_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        /*
        1'den 100'e kadar olan sayilarin toplamini yazdirin
         */

        int toplam =0;

        for (int i = 1; i <100 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam :" +  toplam);

        System.out.println("-------------------------------------------------");


        int sayi=1;
        int toplam2 = 0;

        while (sayi<100) {
            toplam2+=sayi;
            sayi++;
        }
        System.out.println("toplam2 = " + toplam2);

        /*
        forLoop bize otomatik olarak bir format verir
        artıs miktari baslangic ve bitis degerleri otomatik olarak verilir

        whileLoop da ise baslangic, bitis degerleri ve artis miktari manuel olarak tanimlanir
         */

    }
}
