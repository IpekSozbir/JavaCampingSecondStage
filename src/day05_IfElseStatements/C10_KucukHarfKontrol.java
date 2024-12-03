package day05_IfElseStatements;

import java.util.Scanner;

public class C10_KucukHarfKontrol {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        // 1.yontem = ASCII Table

        if (karakter >= 'a' && karakter <= 'z') {
            System.out.println("Girilen kucuk harfi buyuk harfe cevirdim :" + (char)(karakter-32));}
        else System.out.println("Girilen karakter: " + karakter);

        //2. yontem = wrapper class kullanarak

        if ( Character.isLowerCase(karakter)){
            System.out.println(Character.toUpperCase(karakter));
        }else System.out.println(karakter);
    }
}
