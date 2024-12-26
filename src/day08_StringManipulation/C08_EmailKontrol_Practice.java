package day08_StringManipulation;

import java.util.Scanner;

public class C08_EmailKontrol_Practice {

    public static void main(String[] args) {

           /*
    SORU : kullanicidan bir mail alin
    - mail @ icermiyorsa “gecersiz mail”
    - mail @gmail.com icermiyorsa, “mail gmail olmali”
    - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
    yazdirin

    ---> if else ile cozumu
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Mail adresinizi giriniz : ");
        String mail = scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Geçersiz Mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
    }
}
