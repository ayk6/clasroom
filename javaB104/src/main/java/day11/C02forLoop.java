package day11;

public class C02forLoop {
    public static void main(String[] args) {
        // sum of digits

        int num = 324156;
        int sum = 0;

        for (int i = num; i>0; i/=10){
            sum+=i%10;
        }
        System.out.println(sum);
    }
}
