package day09_stringManipulation;

import java.util.Scanner;

public class C07_replaceAll {

    public static void main(String[] args) {

        // kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen bilgiler : I** S****, **** **** **** 4567

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz:");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen 16 haneli kredi karti numarasinizi giriniz:");
        String kkNo = scan.nextLine();

        System.out.println(
                "Girilen bilgiler: "+
                        isim.substring(0,1).toUpperCase()+// ismin ilk harfi buyuk harf olarak
                        isim.substring(1).replaceAll("\\w","*")+ // ismin geri kalani * olarak
                        " "+
                        soyisim.substring(0,1).toUpperCase()+ // soyismin ilk harfi buyuk harf olarak
                        soyisim.substring(1).replaceAll("\\w","*")+ // soyismin geri kalani * olarak
                        " ,"+
                        "**** **** ****"+ // kredi kartinin ilk 12 rakami
                        kkNo.substring(12)
        );
    }
}
