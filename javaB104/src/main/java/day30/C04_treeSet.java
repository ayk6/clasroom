package day30;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class C04_treeSet {
    // keeps uniq elements in alphabetic order
    // or numeric order
    // too slow
    // create hashset and add elements, then convert treeset -> fast
    public static void main(String[] args) {
        System.out.println(LocalTime.now().toNanoOfDay());
        TreeSet<String> mails = new TreeSet<>();
        mails.add("firstEmail");
        mails.add("2ndEmail");
        mails.add("3rdEmail");
        mails.add("4thEmail");
        mails.add("5thEmail");

        System.out.println(mails);
        System.out.println(LocalTime.now().toNanoOfDay());

        HashSet<String> emails = new HashSet<>();
        emails.add("firstEmail");
        emails.add("2ndEmail");
        emails.add("3rdEmail");
        emails.add("4thEmail");
        emails.add("5thEmail");
        TreeSet<String> sortedEmails = new TreeSet<>(emails);
    }
}
