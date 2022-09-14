package javaLess.day18;

public class nestedForLoop4 {
    public static void main(String[] args) {
                /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.
       */
        char input ='F';
        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
