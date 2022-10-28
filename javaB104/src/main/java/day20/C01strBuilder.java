package day20;

public class C01strBuilder {
    public static void main(String[] args) {
        // String is immutable but stringBuilder is mutable
        // immutable for security, mutable for performance

        StringBuilder sb = new StringBuilder("strB");
        System.out.println(sb); // strB

        StringBuilder sb2 = new StringBuilder();
        sb2.append("strB"); // strB
        System.out.println(sb);

        sb2.append("new");

        System.out.println(sb); // strB
        System.out.println(sb2); // strBnew

        sb2 = new StringBuilder("last");

        System.out.println(sb); // strB
        System.out.println(sb2); // last

        System.out.println(sb.length()); // 4
        System.out.println(sb.capacity()); // 20
    }
}
