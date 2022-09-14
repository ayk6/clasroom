package javaLess.day27;

public class volvoRunner {
    public static void main(String[] args) {

        volvo car1= new volvo();
        System.out.println(car1.title); // Volvo
        car1.fuel="gas";
        car1.automa= false;
        System.out.println(car1.automa);
        System.out.println(car1.maxSpeed);

        volvo car2= new volvo();
        car2.model="c40";
        System.out.println(car2.title+" "+ car2.model); // Volvo c40
        car2.fuel="gas";
        car2.automa= true;
        System.out.println(car2.automa);
        System.out.println(car2.maxSpeed);

        volvo car3= new volvo("c60","diesel", false, 2020, 250);
        System.out.println(car3.printt());

    }
}
