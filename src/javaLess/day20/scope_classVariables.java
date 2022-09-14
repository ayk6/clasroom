package javaLess.day20;

public class scope_classVariables {
    //class (static) variables
    //main metod dışında static olarak oluşturulur
    //değer atanmazsa default değerler atanır
    //obje olmaksızın çalışır

    static int num; //0 atadı (default)
    static String sentence; //null atadı
    static boolean tOrF; //false atadı
    static char firstLetter; //boş atadı

    public static void main(String[] args) {
        System.out.println(sentence + num + tOrF + firstLetter);
        //static oldukları için kullanılabilir
        num=1; sentence="asd"; tOrF=true; firstLetter='w';
        System.out.println(sentence + num + tOrF + firstLetter);
        //değer atabailir ve yeni değerler kullanılabilir

        staticMethod();
        System.out.println(num); //aşağıda değiştiği için burada da kalıcı olarak değişti
    }
    public static void staticMethod(){
        //class variable'lara buradan da ulaşılabilir
        System.out.println(sentence + num + tOrF + firstLetter);
        num=2;
        System.out.println(num); //2 yazdırır
    }
}
