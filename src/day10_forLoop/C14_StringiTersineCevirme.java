package day10_forLoop;

import java.util.Scanner;

public class C14_StringiTersineCevirme {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");

        String metin = scan.nextLine();

        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
         tersMetin += metin.charAt(i);
        }

        System.out.println("metnin tersten yazilisi: " + tersMetin);

        // tersten yazilisi ayni olan kelimelere palidrom denir
        // girilen metnin palidrom olup olmadıgını kontrol ediniz

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        }else System.out.println("Girilen metin PALINDROME degil");
    }
}
