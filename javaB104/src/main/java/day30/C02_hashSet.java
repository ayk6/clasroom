package day30;

import java.util.HashMap;
import java.util.HashSet;

public class C02_hashSet {
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("firstEmail");
        emails.add("2ndEmail");
        emails.add("3rdEmail");
        emails.add("4thEmail");
        emails.add("5thEmail");
        emails.add("firstEmail");
        // keeps uniq elements,
        // if we add the same element it overwrites
        System.out.println(emails);
        emails.add(null); // adds null
        System.out.println(emails);
    }
}
