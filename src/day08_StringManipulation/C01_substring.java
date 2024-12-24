package day08_StringManipulation;

public class C01_substring {

    public static void main(String[] args) {


        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.length());

        /*
        //19. karakteri yazdirin
        System.out.println(str.substring(19,20).toUpperCase());

        //10.karakterden baslayip sona kadar yazdirin
        System.out.println(str.substring(10));

        // 10. karakter ile 10. index farkli seylerdir
        // index 0'dan basladigi icin 10. karakter 9.indexteki karakterdir
         */

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1,2));

        // ilk kelime haricini yazdir
        System.out.println(str.substring(5));

        // son 6 karakteri yazdir
        System.out.println(str.substring(str.length()-6));

        // son harfi yazdir
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(29));

        System.out.println(" ");
        System.out.println(str.substring(str.length())); // hiclik yazdirir
        // System.out.println(str.substring(str.length()+1)); // aralik disinda diye hata verir
        // System.out.println(str.substring(str.length(5,2))); // hata verir

        // ilk on karakteri yazdirin
        System.out.println(str.substring(0,10));

    }
}
