package day09_stringManipulation;

public class C05_replaceAll {

    public static void main(String[] args) {

        String str = "Ali okula gitti, 3 saat sonra gelecek";

        // tum t'leri T yapin
        System.out.println(str.replace('t', 'T'));

        // 3'un yerine 2 yazin
        System.out.println(str.replace("3", "2"));

        // replace methodu verilen metinde aranan char veya String'in
        // tum kullanimlarini bulur ve degistirir

        //replaceAll'un farki regex kullanilabilmesidir
        str = "ben 2 veya 3 saat sonra gelirim";

        // tum sayilari 5 yapin
        System.out.println(str.replaceAll("\\d", "5"));
    }
}
