package day10_forLoop;

import java.util.Scanner;

public class C10_FaktoriyelYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 18’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 18'den kucuk pozitif bir tam sayi giriniz:");
        int sayi = scan.nextInt();

        int faktoriyelDegeri =1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >=1 ; i--) {
            if (i>1) System.out.print(i+ " *");
            else System.out.print(i);
            faktoriyelDegeri *= i;
        }
        System.out.print(" = "+faktoriyelDegeri);
    }
}
