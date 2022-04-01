package day31;

public class Equals2 {
    public static void main(String[] args) {

        String a="";
        a += 2; // "2"
        a += 'c'; // "2c"
        a += false; // "2cfalse

        if (a=="2cfalse"){
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        // result = equals
        // a eklenerek oluşturulduğu için == false sonuç verir
    }
}
