package day11_nestedForLoop_MethodOlusturma;

public class C10_FaktoriyelDegeriYazdirma {
    public static void main(String[] args) {

     // 18'den kucuk pozitif bir tamsayi verildiginde
     // sayinin faktoriyel degerini yazdiracak
     // bir method olusturun

        faktoriyelYazdir(4);
        faktoriyelYazdir(6);
    }

    public static void faktoriyelYazdir (int sayi) {
        int faktoriyelDegeri =1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyelDegeri *= i;
        }

        System.out.println(sayi+"! = "+ faktoriyelDegeri);
    }
}
