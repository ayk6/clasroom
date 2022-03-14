package day19;

public class scope {
    //num alttaki metodlarda kullanılamaz, yalnızca kendi metodunda
    //göndermek gerekir ya da ana class level'da oluşturmak gerek
    // static yaparsak tüm methodlarda kullanılabilir
    //static olmazsa yalnızca static olmayanlarda kullanılabilir
    //main açmadan atanan değerler class level'dadır
    //loop içinde oluşturulan variable'lar loop dışında kullanılamaz

    static String sentence="deneme";
    String sentence2 = "deneme2";


    public static void main(String[] args) {
        System.out.println(sentence);
        //System.out.println(sentence2); çalışmadı

    }
    public static void method1(){

        System.out.println(sentence);
        //System.out.println(sentence2); çalışmadı

    }
    public void method2(){
        System.out.println(sentence);
        System.out.println(sentence2); //çalıştı

    }
}
