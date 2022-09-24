package day02;

public class Car {

    public static String brand = "Toyota";
    public static String model = "Auris";
    public static int year = 2022;

    public static void main(String[] args) {
        Car myToyota = new Car(); // constructor object

        brake();
        System.out.println(brand);

    }

    public static void brake(){
        System.out.println("Hold brake");
    }

}
