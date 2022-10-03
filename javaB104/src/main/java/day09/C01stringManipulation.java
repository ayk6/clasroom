package day09;

public class C01stringManipulation {
    public static void main(String[] args) {
        String str = "qwertyasdasd";

        System.out.println(str.indexOf('a')); // gives first 'a' index
        System.out.println(str.indexOf("asd")); // gives first asd beginning index
        System.out.println(str.lastIndexOf("asd")); // gives last asd beginning index

        System.out.println(str.indexOf('a',7));
        // gives first 'a' index, but starts given index num

        System.out.println(str.indexOf("asd",10));
        // gives first 'a' index, but starts given index num

        // if there is no given ch or str in string, returns -1


    }
}
