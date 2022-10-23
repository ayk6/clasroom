package day18;

public class C02postVsPre {
    public static void main(String[] args) {
        int num=4;

        num++; // post increment
        ++num; // pre increment

        num--; // post decrement
        --num; // pre decrement

        System.out.println(num); // 4
        System.out.println(num--); // 4
        System.out.println(num); // 3
        System.out.println(--num); // 2
    }
}
