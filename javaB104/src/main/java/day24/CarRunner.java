package day24;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        // best pracc : use static methods w class, not objects
        System.out.println(Car.counter); // 4
        System.out.println(car1.price); // 15001

        System.out.println(Car.counter); // 4
        System.out.println(car2.price); // 15001
    }
}
