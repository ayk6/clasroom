package day29;

public interface Engine extends Vehicle {

    // all interface variables are public and final and static
    // there is no const. in interfaces , abstracts have
    // so we cannot create object in interface  , abstracts too
    int price=2000;
    // protected int price2=2000; CTE
    // int price2; CTE

    void run();

}
