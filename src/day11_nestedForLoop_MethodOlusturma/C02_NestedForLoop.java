package day11_nestedForLoop_MethodOlusturma;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
        Asagidaki sekli olusturacak bir kod yaziniz

        2 3 4 5
        3 4 5 6
        4 5 6 7
        5 6 7 8

         */

        for (int i =1 ; i <=4 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.print((i+j) +" ");

            }
            System.out.println(" ");

        }
    }
}
