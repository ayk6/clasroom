package practiceJava.preAdvanced;
import java.util.Scanner;
public class C08wordInSentence {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini bulun
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Karakter sayisi :"+ cumle.length());
        int sayac=0;
        for (int i=0; i<cumle.length(); i++) {
            if (cumle.charAt(i) ==' '){
                sayac++;
            }
        }
        System.out.println("Kelime sayisi : "+ (sayac+1));
    }
}

