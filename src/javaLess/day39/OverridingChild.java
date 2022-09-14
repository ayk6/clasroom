package javaLess.day39;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child method1");
    }
    // data türü ve const. aynı ise o class'tan veri alır yoksa parent
    // data türü parent, const. child ise variable'larda parent çalışır
    // data türü parent, const. child ise methodlarda override yapan child çalışır

    public static void main(String[] args) {
        OverridingChild obj1 = new OverridingChild();
        obj1.method1(); // child class'ta olduğu için çalıştırır
        // child classta aynı isimle oluşturulan method parent methodu override yapar
        obj1.method2(); // parent class'ta olduğu için orana alır

        OverridingParent obj2 = new OverridingChild();
        obj2.method1(); // child class
        // parent'tan çağırsak da override olduğu için override yapan çalışır
        obj2.method2(); // parent class

        OverridingParent obj3 = new OverridingParent();
        obj3.method1(); // parent class
        // hem data türür hem const. parent olduğu için parent çalışır
        obj3.method2(); // parent class

    }
}
