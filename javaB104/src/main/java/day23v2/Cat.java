package day23v2;

public class Cat extends Mammal{

    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void feedWMilk() {
        super.feedWMilk(); // parent method works
    }

    public void meow(){
        System.out.println("cats meow");
    }
}
