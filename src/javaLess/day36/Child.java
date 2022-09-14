package javaLess.day36;

public class Child extends Parent{
    Child(){
        System.out.println("Child const. çalıştı");
    }

    public static void main(String[] args) {
        Child chld = new Child();
        //parent constuctor çalıştı
        //Child const. çalıştı

        // tüm  ext kullanan const. ilk satırında görmediğimiz super() const. vardır
        // yani parametresiz default const.
        // bu yüzden parent const. da çalışır
    }
}
