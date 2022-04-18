package day43;

public class FinalC {
    final static double pi=3.14159265357989323;

    public static void main(String[] args) {


        final  int num=4;

        // num =5;
        // final ile tanımlanan veriler kullanılabilir ama değiştirilemez
        // değişmeyecek verilerde kullanılabilir
        // diğer class'lardan da kullanılabilir
        // methodlarda da kullanılabilir. Override'a engel olur
        // isimleri genelde büyük harfle yazılır
        // default değer almaz
        // final class kullanılabilir. inherite izin vermez

    }
    public static final void method(){
        System.out.println("final method çalıştı");
    }
}
