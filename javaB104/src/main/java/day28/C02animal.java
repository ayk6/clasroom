package day28;

public abstract class C02animal {

    public abstract void eat(); //abstract class can have abstract method

    public void drink() {
        System.out.println("animals drink");
    } //abstract class can have concrete (non-abstract) method

    public abstract void move();
}
