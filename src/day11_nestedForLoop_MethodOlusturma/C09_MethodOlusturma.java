package day11_nestedForLoop_MethodOusturma;

public class C09_MethodOlusturma {
    public static void main(String[] args) {

        // Verilen iki notun ortalamasini yazdiran bit method olusturun

        double not1 = 78.9;
        double not2= 56.5;

        notOrtalamasiYazdir(not1,not2);

        notOrtalamasiYazdir(45.6,87.34); // kaydetmeyip boyle de yapabilirsin


    }

    public static void notOrtalamasiYazdir ( double not1, double not2) {
        System.out.println("Verilen notlarin ortalamasi: " + (not1+not2)/2);
    }
}
