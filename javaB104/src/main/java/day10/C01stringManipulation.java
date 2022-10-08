package day10;

public class C01stringManipulation {
    public static void main(String[] args) {
        String str = "Last index test sentence.";

        System.out.println(str.lastIndexOf("e",10));
        // check 0 to from index nd returns last keyword.

        System.out.println(str.startsWith("ast", 1)); // returns boolean

        // str.replaceFirst(" ","*");
        System.out.println(str.replace('e', 'a')); // Last indax tast santanca.
        System.out.println(str);

        System.out.println(str.concat(" Added new words.")); // Last index test sentence. Added new words.

        System.out.println(str+=" Added new words.");            // Last index test sentence. Added new words.

        String str2 = "asdf";
        System.out.println(str.compareTo(str2)); // compares two strings lexicographically.
        str.compareToIgnoreCase("sasdasdad"); // compare but ignore lower case and upper case differences.

    }
}
