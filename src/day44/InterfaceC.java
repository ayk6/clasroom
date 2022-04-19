package day44;

public interface InterfaceC {
    // interface class değildir
    // full abstraction arayüzdür
    // yalnızca abstract method barındırır
    // Abstract class'larda isteğe bağlı concrete method bulunabilir
    //  interface'lerde concrete method
    // obje de oluşturulamaz
    // tüm elemanları public ve abstract olmalıdır
    // constructor bulunmaz


    // bir class birden fazla class'a extend yapılamaz
    // ama birden fazla interface'e IMPLEMENT yapılabilir
    // iki interface arasında da extends kullanılabilir
    // implement yapılan interface'lerde aynı isimde method ya da variable
    // var ise interface ismiyle birlikte kullanılır
    // aynı isme ve farklı return type'a sahip method var ise
    // ikisi birlikte kullanılmaz

    int num=4;
    public  static final int num2=4;
    // variable barındırır ise bunlar public static ve final olur
    // yazılmasa dahi bu şekilde kullanır
    // default değer kullanılmaz
}
