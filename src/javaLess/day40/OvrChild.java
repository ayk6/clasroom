package javaLess.day40;

public class OvrChild extends Overriding{
    // sağ click ile oluşturulan ovrride method
    @Override // parent methodların silinmemesi için eklenir
    // bu uyarı eklendiğinde override edilen method silinirse cte verir
    // uyarı kullanılmazsa rte verir
    public void method2() {
        System.out.println("child method2");
    }

    public static void main(String[] args) {
        OvrChild obj=new OvrChild();
        obj.method1(); // parent method1
        obj.method2(); // child method2

        Overriding obj2=new OvrChild();
        obj2.method1(); // parent method1
        obj2.method2(); // child method2

        Overriding obj3=new Overriding();
        obj3.method1(); // parent method1
        obj3.method2(); // parent method2

    }
}
