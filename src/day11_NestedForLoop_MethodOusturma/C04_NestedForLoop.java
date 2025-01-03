package day11_NestedForLoop_MethodOusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz: ");
        int satirSayisi = scan.nextInt();

        System.out.println("Her satirda olmasini istediginiz * sayisini giriniz: ");
        int sutunSayisi = scan.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
