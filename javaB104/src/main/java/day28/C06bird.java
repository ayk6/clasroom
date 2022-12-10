package day28;

public class C06bird extends C02animal{
    @Override
    public void eat() {
        System.out.println("birds eat");
    }

    @Override
    public void move() {
        System.out.println("birds fly");
    }
}
