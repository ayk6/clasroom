package day45;

public class InterfaceChild implements DefaultStatic{
    @Override
    public void method1() {
        System.out.println("child class method1");
    }
    // static methodlar override edilemez
    // default olanlar ise isteğe bağlı
    // interface de olsa override zorunlu değil

    public static void main(String[] args) {
        DefaultStatic.method2(); // static methodlara bu şekilde ulaşılabilir
        // abstract methodlara ve default'lara bu şekilde ılaşılamaz

        InterfaceChild childObj = new InterfaceChild();
        childObj.method1();
        // abstract method'a obje ile ulaşılabiilir
        childObj.method3();
        // default method'a da obje ile ulaşılabilir
    }
}
