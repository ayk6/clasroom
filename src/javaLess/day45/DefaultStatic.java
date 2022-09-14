package javaLess.day45;

public interface DefaultStatic {
    // ınterface içerisinde abstract methodlar bulunur
    // body'si olan method oluşturmak istersek cte verir
    // Java 8 ve üzerinde istisnalar bulunur
    // static ya da default methodlar bulunabilir
    // burada yazan default access modifier değildir


    void method1();

    // void method2(){} CTE
    static void method2() {
        System.out.println("interface static method");
    }

    default void method3() {
        System.out.println("interface default method");
    }
}
