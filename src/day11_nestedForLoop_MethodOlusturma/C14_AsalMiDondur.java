package day11_nestedForLoop_MethodOlusturma;

public class C14_AsalMiDondur {
    public static void main(String[] args) {

        // Verilen sayi asal ise true
        // asal degilse false donduren bit method olusturun

        System.out.println(asalMi(23));
        System.out.println(asalMi(97));
        System.out.println(asalMi(111));

    }

    public static boolean asalMi (int sayi) {
        boolean asalMi = true;

        for (int i = 2; i <sayi-1 ; i++) {
            if (sayi%i==0) {
                asalMi = false;
                break;
            }
        }
        return asalMi;
    }
}
