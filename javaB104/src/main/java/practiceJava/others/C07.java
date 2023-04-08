package practiceJava.others;

public class C07 {
    public static void main(String[] args) {
        int sayac = 1;
        int toplam = 0;

        while (sayac<=10){
            toplam+=sayac;
            sayac++;
            if (toplam>25) break;
        }
        System.out.println(sayac+ "\n"+ toplam);
    }
}
