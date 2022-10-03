package basicPrac.day05;

public class C02objectClass {
    // create an object

    public static void main(String[] args) {
        // create object
        C03teacher obj1 = new C03teacher();

        obj1.name = "Walter";
        obj1.age = 51;
        obj1.phoneNum = "3141592";

        C03teacher obj2 = new C03teacher();

        obj2.name = "White";
        obj2.age = 49;
        obj2.phoneNum = "4815122342";
    }
}
