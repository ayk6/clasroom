package javaLess.day29;

public class v03 {
    public static void decrease(){
        v01.num--;
        System.out.println("v03 değeri : "+v01.num);
        v01.increase(); // her seferinde increase de çalışır
    }
}
