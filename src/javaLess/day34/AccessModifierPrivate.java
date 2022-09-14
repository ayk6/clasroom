package javaLess.day34;

public class AccessModifierPrivate {
    private static int num = 4;
    private static String str = "asdf";

    // private atamalar yalnızca bulunduğu class'larda kullanılır
    // obje dahi oluşturulsa diğer class'lar göremez
    // class'lar private olmaz

    private void method1() {

    }
    // method'lar da aynı şekilde diğer class'lara gizlidir

    // private constructor da oluşturulabilir


}
