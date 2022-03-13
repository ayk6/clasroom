package day18;

public class whileLoop {
    public static void main(String[] args) {

        //iki tam sayıyı ve aralarındaki tam sayıları yazdır

        int begin= 4; int end=9;

        for (int i=begin; i<=end; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println(begin);

        int i=begin; // bunu yapmazsak while begin i değiştirir
        while (i<=end){
            System.out.print(i + " ");i++;
        }
        System.out.println("");
        System.out.println(begin);

    }
}
