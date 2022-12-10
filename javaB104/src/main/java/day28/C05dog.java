package day28;

public class C05dog extends C03mammal{
    @Override
    public void eat() {
        System.out.println("dogs eat");
    }

    @Override
    public void move() {
        System.out.println("dogs run");
    }
}
