package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {

    public static void main(String[] args) {

        /*
        Switch statements
        switch parantezine yazilan variable'in alabilecegi degere gore
        case'ler olusturur

        Switch parantesine boolean, long, float ve double variable yazilamaz
        bunun dısındaki data turleri olabilir  String char short byte in....

        Switch calismaya basladiginda
        girilen degere uygun olan case'e gider ve calismaya baslar

        Eger break ile karsilasirsa durur
        break ile karsilasmazsa switch'in sonuna kadar calisir
         */


        // Kullanicidan rakam olarak gun numarasini alip (Haftanin kacinci gunu oldugu)
        // gun ismini yazzdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz: ");
        int gunNo = scan.nextInt();

        switch ( gunNo ) {

            case 1: // gunNo'nun degerinin 1 olmasi durumunda
                System.out.println("Gunlerden pazartesi");
                break;
            case 2: // gunNo'nun degerinin 2 olmasi durumunda
                System.out.println("Gunlerden sali");
                break;
            case 3: // gunNo'nun degerinin 3 olmasi durumunda
                System.out.println("Gunlerden carsamba");
                break;
            case 4: // gunNo'nun degerinin 4 olmasi durumunda
                System.out.println("Gunlerden persembe");
                break;
            case 5: // gunNo'nun degerinin 5 olmasi durumunda
                System.out.println("Gunlerden cuma");
                break;
            case 6: // gunNo'nun degerinin 6 olmasi durumunda
                System.out.println("Gunlerden cumartesi");
                break;
            case 7: // gunNo'nun degerinin 7 olmasi durumunda
                System.out.println("Gunlerden pazar");
                break;
            default: //yazilan caselere uymayan degerler icin
                System.out.println("Girilen deger gecersiz");
        }
    }
}
