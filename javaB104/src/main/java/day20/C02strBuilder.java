package day20;

public class C02strBuilder {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        strB.append("Builder");
        strB.setCharAt(3,'w');
        System.out.println(strB); // Buiwder

        strB.delete(1,3); // including, excluding
        System.out.println(strB); // Bwder

        strB.deleteCharAt(2);
        System.out.println(strB); // Bwer

        System.out.println(strB.reverse());  // rewB

        String str = strB.toString();

        strB.insert(2,"*****"); // re*****wB
        strB.insert(0,"123456",2,4); // 34re*****wB
        System.out.println(strB);
    }
}
