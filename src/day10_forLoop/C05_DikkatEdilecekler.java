package day10_forLoop;

public class C05_DikkatEdilecekler {

    public static void main(String[] args) {

        // ilk deger icin boolean sart false olursa
        // for body'si hic devreye girmez
        // Bu durumda KOD CALISMAZ diyemeyiz
        // ama KOD CALISIR ve degerler sarti saglamadigi icin LOOP BODY calismaz diyebiliriz

        for (int i = 50; i <40 ; i++) {
            System.out.println(i);
        }


        // artıs veya azalis ile boolean sart surekli true olursa
        // teknik olarak SONSUZ loop olusur. int sinirina kadar

        for (int i = 10; i >0 ; i++) {
            System.out.print(i+" ");
        }
    }
}
