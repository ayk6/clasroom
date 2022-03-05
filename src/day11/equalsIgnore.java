package day11;

import java.util.Scanner;

public class equalsIgnore {
    public static void main(String[] args) {
        // büyük küçük harf değiştirmez ve büyük küçük harf duyarlılığını kaldırır

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılacak mısınız?\nEvet ya da Hayır yazın");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız : " + cevap + ". Derse katılımınız onaylandı");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabınız : " + cevap + ". Sonraki derse bekleriz");
        } else System.out.println("Hatalı giriş (evet ya da hayır yazınız)");

    }
}
