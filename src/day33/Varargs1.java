package day33;

public class Varargs1 {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayan bir method olusturun
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        int num5=50;
        // bir de 3 sayiyi toplayan method olusturalim
        plus();
        plus(num1);
        plus(num1,num2);
        plus(num1,num2,num3);
        plus(num1,num2,num3,num4);
        plus(num1,num2,num3,num4,num5);
    }
    private static void plus(int... num) {
        int result=0;
        for (int each: num
        ) {
            result+=each;
        }
        System.out.println(result);
    }
}
