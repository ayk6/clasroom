package day07;

public class C02stringManipulation {

    public static void main(String[] args) {

        // equals() -> returns boolean , check sameness
        // equalsIgnoreCase()
        // toLowerCase() , toUpperCase()
        // charAt() -> returns index character
        // length() -> returns int
        // contains() -> returns boolean
        // split() -> returns array
        // replace()

        String password = "password123";

        boolean isPassValid = true;

        if (password.length()<8) isPassValid = false;
        if (password.contains(" ")) isPassValid = false;
        if (password.charAt(password.length()-1)!='?') isPassValid = false;

        System.out.println("pass valid : " +isPassValid);

    }

}
