package day08;

public class C01stringManipulation {
    public static void main(String[] args) {
        String name = "Jimmy";

        // print name with censorship

        System.out.println(name.charAt(0)+"******");

        System.out.println(name.substring(0,1)+"******");

        String fullName = "Jimmy Mc";

        // print full name with censorship

        System.out.println(
                fullName.charAt(0)+"*****" + " "
                + fullName.split(" ")[1].charAt(0)+"*****"
        );

        // print character count without space
        int cCount = fullName.replace(" ", "").length();
        System.out.println(cCount);

        String password = "psw12345//";
        // print passw but convert nums to *

        System.out.println(password.replaceAll("[0-9]","*"));

        // "\\p{Punct}" for punctuation
        // "^...." all characters without chosen  [^ ] -> without space

    }
}
