package day12;

public class C02while {
    public static void main(String[] args) {

        // sum number digits

        int num =12345;
        int sum =0;

        while (num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}
