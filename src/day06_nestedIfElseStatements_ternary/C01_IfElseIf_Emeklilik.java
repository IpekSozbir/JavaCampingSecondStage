package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C01_IfElseIf_Emeklilik {

    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasi dikkate alarak “Emekli olabilirsiniz”
        // veya “Emekli olmak icin .. yil daha calismaniz gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E: Erkek");

        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas = scan.nextDouble();

        if (cinsiyet== 'K' && yas>=60 && yas<80) {
            System.out.println("Emekli olabilirsiniz. \nKadinlarin emeklilik icin yas siniri 60'dir. 60 yasindan buyuk oldugunuz icin emekli olabilirsiniz. ");
        } else if (cinsiyet=='K' && yas<60 && yas>20) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismaniz gerekir");
        } else if (cinsiyet=='E'&& yas>=65 && yas<80) {
            System.out.println("Emekli olabilirsiniz. \nErkeklerin emeklilik icin yas siniri 65'dir. 65 yasindan buyuk oldugunuz icin emekli olabilirsiniz. ");
        } else if (cinsiyet == 'E' && yas<65 && yas>20) {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismaniz gerekir");
        } else {
            System.out.println("Girilen degerlerde hata var");
        }
    }
}
