package day12;

public class C03doWhile {
    public static void main(String[] args) {
        double num =4.12345;
        // print decimal digits sum
        int sum =0;

        String numStr= String.valueOf(num);
        String decimalStr = numStr.split("\\.")[1]; // escape meta character
        int decimalInt = Integer.parseInt(decimalStr);

        do {
            sum+=decimalInt%10;
            decimalInt /=10;
        }while (decimalInt>0);

        System.out.println(sum);
    }
}
