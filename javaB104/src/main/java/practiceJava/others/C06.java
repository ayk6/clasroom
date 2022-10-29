package practiceJava.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06 {
    public static void main(String[] args) throws Exception {
        // Question : kullanıcıdan istenen iki değer arasında
        // yer alan tüm asal sayıların listesini veren kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.print("First num : ");
        int num1= scan.nextInt();
        System.out.print("2nd num : ");
        int num2= scan.nextInt();

        List<Integer> primeList = new ArrayList<>();

        if (num1<=0||num2<=0){
            throw new Exception("numbers must be positive");
        }
        if (num1==num2){
            throw new Exception("numbers must be different");
        }
        int min=Math.min(num1,num2);
        int max=Math.max(num1,num2);

        for (int i =min;i<=max;i++){
            if (i==1) continue;
            if(isPrime(i)) primeList.add(i);
        }
        System.out.println(primeList);
    }

    private static boolean isPrime(int num) {
        for (int i = 2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
