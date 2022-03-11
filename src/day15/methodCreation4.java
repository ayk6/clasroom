package day15;

public class methodCreation4 {
    public static void main(String[] args) {
        // string'i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazn bir method olustur
        hosgeldinYazdir();

        //public yapılırsa diğer class'larda da çağırılabilir
    }
    private static void kapanmaMethodu() {
        System.out.println("teşekkürler");
    }
    private static void hosgeldinYazdir() {
        System.out.println("Hosgeldiniz");
        stringYazdir("devam");
    }
    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
