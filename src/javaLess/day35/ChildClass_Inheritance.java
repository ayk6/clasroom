package javaLess.day35;

public class ChildClass_Inheritance extends ParentClass_Inheritance{
    public static void main(String[] args) {
        System.out.println(name); // saldıray
        // child class obje kullanmadan parent class verilerine ulaşır

        System.out.println(prWord); //prWorddd
        // child class protected verilere de ulaşır

        method1(); method2();
        // tüm methodlara da ulaşabilir

    }

}
