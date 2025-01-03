package day11_NestedForLoop_MethodOusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        Asagidaki sekli cizdiricek kodu yaziniz
            *
            * *
            * * *
            * * * *

         */


        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
