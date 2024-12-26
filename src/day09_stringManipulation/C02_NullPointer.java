package day09_stringManipulation;

public class C02_NullPointer {

    public static void main(String[] args) {

        String isim1;

        // bir method içinde olusturulan String veriable'lara deger atamadan kullanamayiz

        String isim2 = "Ali";
        String isim3 = "";
        String isim4 = "Buse Sena";

        // hiçlik de bir deger. isim3'e bir deger atandi yani

        // EGER bir variable'a deger atamadan variable'i listeyebilmek istersek
        // o variable'ı null olarak isaretleyebilriiz

        String isim5= null;

        System.out.println(isim5); // null

        // NOT: null olarak isaretlenen variablelar yazidirilabilir
        // ama baska methodlarla kullanilamaz

        System.out.println(isim2.length()); // 3
        System.out.println(isim3.length()); // 0
        //System.out.println(isim5.length()); //hata verir. Deger atamadinki deger olsun der
    }
}
