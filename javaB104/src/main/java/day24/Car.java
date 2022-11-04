package day24;

public class Car {
    public static String make = "Toyota";
    public String model = "Auris";
    public int price = 15000;
    public static int counter = 0;

    public Car() {
        counter++;
        price++;
    }
}
