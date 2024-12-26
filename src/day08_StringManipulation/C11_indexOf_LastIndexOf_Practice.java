package day08_StringManipulation;

import java.util.Scanner;

public class C11_indexOf_LastIndexOf_Practice {

    public static void main(String[] args) {

        /*
        Kullanicidan bir metin alip metinde birden fazla a harfi varsa a harfinin ikincisinin
        hangi indexte oldugunu yazdirin. Bir tane varsa bir tane var yazdirin
        -Test data: Kitaplar bizim dostlarimizdir.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        String arananHarf = "a";

        int arananHarfinIlkIndexi = metin.indexOf(arananHarf);
        int arananHarfinIkinciIndexi = metin.indexOf("a", arananHarfinIlkIndexi + 1);

       if (metin.contains(arananHarf)) {
           if (arananHarfinIlkIndexi == metin.lastIndexOf(arananHarf)) {
               System.out.println("Metin bir adet 'a' harfi iceriyor");
           } else {
               System.out.println(arananHarfinIkinciIndexi);
           }
       }
    }
}
