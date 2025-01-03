package day11_nestedForLoop_MethodOusturma;

public class C07_NestedForLoop_Practice {

    public static void main(String[] args) {
          /*
        Asagidaki sekli cizdiricek kodu yaziniz
             1
            1 2
           1 2 3
          1 2 3 4
         */


        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <5-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) { // sekil ucgense i'ye kadar
                System.out.print(j +" ");
            }
            System.out.println("");

        }



           /*
        Asagidaki sekli cizdirecek kodu yaziniz

                  1
                 1 1
                1 2 1
               1 2 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
         */


        int maxSatir = 7;//n  satir sayisi

        int number = 0;// M =


        for (int satir = 1; satir <= maxSatir; satir++) {

            for (int t = 0; t < maxSatir - satir; t++) {

                System.out.print(" ");

            } // once bastaki bosluklari yaziyor


            if (satir % 2 == 0) { // satir sayisi cift ise


                number = satir / 2;


                for (int i = 1; i <= number; i++) { // ilk for  1'dan satirin yarisina kadar yazdiriyor
                    // orn satir 6 ise  1 2 3
                    System.out.print(i + " ");

                }

                for (int i = number; i >= 1; i--) { // ikinci for  satirin yarisindan 1'e  kadar  yazdiriyor
                    // orn satir 6 ise  3 2 1
                    System.out.print(i + " ");
                }

            } else {   // satir sayisi tekse
                number = (satir + 1) / 2;

                for (int i = 1; i <= number; i++) { // ilk for  1'dan satirin yarisi+1 e kadar yazdiriyor
                    // orn satir 5 ise  1 2 3
                    System.out.print(i + " ");

                }

                for (int i = number - 1; i >= 1; i--) { // ikinci for  satirin yarisindan 1'e kadar  yazdiriyor
                    // orn satir 5 ise  2 1
                    System.out.print(i + " ");

                }
            }
            System.out.println(" ");
        }
    }
}

