package javaLess.day20;

public class scope_loopVariables {

    //loop içinde oluşturulan variable'lar dışında kullanılmaz
    //loop dışında oluşturulanlar loop içinde kullanılabilir

    public static void main(String[] args) {

        for (int i = 0; i <5; i++){
            int num = 10;
            System.out.println(num);
        }
       // System.out.println(num); yazdırmaz
    }
}
