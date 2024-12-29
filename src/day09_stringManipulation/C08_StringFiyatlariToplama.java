package day09_stringManipulation;

public class C08_StringFiyatlariToplama {

    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin
        // input1 : “15.30 €” , input2 : “11.45 €”
        // output : 26.70 €

        String fiyatStr1 = "15.30 €";
        String fiyatStr2 = "11.45 €";

        // sondaki parabirimini dinamik olarak almak istersek
        // spaceden sonraki kisim diyebiliriz
        // space'in indexini bulmak icin

        int spaceIndex = fiyatStr1.indexOf(" ");
        String parabirimi = fiyatStr1.substring(spaceIndex+1);

        System.out.println(fiyatStr1+fiyatStr2);

        // parse kullanabilmek icin once digit olmayan her seyi yok edelim

        fiyatStr1 = fiyatStr1.replaceAll("\\D",""); //1530
        fiyatStr2 = fiyatStr2.replaceAll("\\D",""); //1145

        double fiyat1 = Double.parseDouble(fiyatStr1) /100;
        double fiyat2 = Double.parseDouble(fiyatStr2) /100;

        System.out.println("Fiyatlarin toplami: "+ (fiyat1+fiyat2)+ " "+ parabirimi);
    }
}
