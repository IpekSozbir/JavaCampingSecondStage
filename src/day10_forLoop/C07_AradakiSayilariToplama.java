package day10_forLoop;

import java.util.Scanner;

public class C07_AradakiSayilariToplama {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic icin bir tam sayi giriniz:");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis icin bir tam sayi giriniz:");
        int bitis = scan.nextInt();

        int toplam = 0;

        if (bitis < baslangic){
            System.out.println("Bitis degeri baslangictan kucuk olamaz..");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }
        }

        System.out.println("Toplam : " + toplam);
    }
}
