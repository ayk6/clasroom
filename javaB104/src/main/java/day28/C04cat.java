package day28;

public class C04cat extends C03mammal{
    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void move() {
        System.out.println("cats climb");
    }
}
