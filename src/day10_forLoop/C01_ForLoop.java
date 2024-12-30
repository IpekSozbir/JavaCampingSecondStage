package day10_forLoop;

public class C01_ForLoop {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'in harflerini her satirda bir harf olacak sekilde alt alta yazdirin

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));

        // kullanicinin verdigi baslangic degerinden baslayip
        // verdigi bitis degerine kadar olan sayilari toplayin

        int baslangicDegeri = 97;
        int bitisDegeri = 467;

        int toplam = 0;

        for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);
    }
}
