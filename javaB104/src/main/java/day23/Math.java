package day23;

public class Math extends Courses{

    public Math(){
        super("str");
        System.out.println("math empty constructor");
    }

    public Math(int i){
        this();
        System.out.println("math int constructor");
    }
}
