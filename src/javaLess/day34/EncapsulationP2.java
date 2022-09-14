package javaLess.day34;

public class EncapsulationP2 {
    // buradan diğer class'taki varible'lara ulaşılamaz (private)
    // access modifier için private variable oluşturulur
    // getter = veriyi okuma - değişklik ya da atama yapamaz
    // setter = veriye değer girme - okuma yapamaz
    // getter and setter ikisi de gerektiğinde kullanılır
    // public yerine daha çok getter ve setter kullanılır
    // java beans ismi de kullanılır (getter nd setter)
    // boolean dataların isimler getterda is..... ile başlar
    // diğerleri get....
    // set olduğunda set.....

    public static void main(String[] args) {

        Encapsulation object = new Encapsulation();

        System.out.println(object.getNum()); // 0
        // get metoduyla veriye ulaşılabilir

        object.setStr("asdf");
        System.out.println(object.getStr()); // asdf
        // set metoduyla veride değişiklik yapılabilir

        System.out.println(object); // toString methodu ile yazdırıldı
    }
}
