package javaLess.day30;

public class PassByValue {
    // java pass by value kullanır
    // mehodda yapılan değişiklik methodda kalır
    // kalıcı olması için :
        // class level kullanılabilir
        // returnu olan method kullanılabilir

    static double value;
    static double discount;

    public static void main(String[] args) {
        value=100;
        discount=10;
        discount10percent(); //90
        discount10percent(); //81
        // her seferinde kalıcı indirim yapar



    }
    public static void discount10percent() {
        value = value * ((100 - discount) / 100);
        System.out.println(value);
    }

}
