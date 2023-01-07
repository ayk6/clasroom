package day30;

import java.util.LinkedHashSet;

public class C03_linkedHashSet {

    // using insertion order
    // more slowly than hashset
    public static void main(String[] args) {
        LinkedHashSet<String> mails = new LinkedHashSet<>();
        mails.add("firstEmail");
        mails.add("2ndEmail");
        mails.add("3rdEmail");
        mails.add("4thEmail");
        mails.add("5thEmail");
        mails.add("firstEmail");

        System.out.println(mails);
    }
}
