package day11_nestedForLoop_MethodOusturma;

public class C11_AsalSayiMi {
    public static void main(String[] args) {

        // Verilen sayi asal ise true,
        // asal degil ise false yazdiran bir method olusturun

        asalMiYazdir(23);
        asalMiYazdir(679);
        asalMiYazdir(5677);
    }

    public static void asalMiYazdir (int sayi) {
        int flag =20;

        for (int i = 2; i <sayi-1 ; i++) {
            if (sayi%i==0) {
                System.out.println("false");
                flag =42;
                break;
            }
        }
        if (flag==20) System.out.println("true");
    }
}

