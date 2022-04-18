package day43;

public abstract class AbstractC2{

    // abstract class içerisinde abstract ya da concrete method bulunabilir.
    // child class'lar abstract methodları override yapmadan kullanamaz
    // concrete methodlar override olmaksızın kullanılabilir (Opsiyonel).


    public abstract void method1();

    public void method2(){
        System.out.println("abstract class concrete method");
    }

    public static void main(String[] args) {
        // AbstractC2 obj = new AbstractC2();
        // abstarct class'larda constructor bulunur ama obje oluşturulamaz
        // abstract class obje barındırmaz.
        // tüm elemanları child class'larda bulunur
        // main method da gereksizdir
        // abstract methodlar static olamaz
    }
}
