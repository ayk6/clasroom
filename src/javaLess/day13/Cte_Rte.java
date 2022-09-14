package javaLess.day13;

public class Cte_Rte {
    public static void main(String[] args) {
        //projede hatalı kod varsa projede hiçbir bölüm(class) çalışmaz

        String str = "deneme cümlesi";

        //kodlama hatası varsa uyarı verir ve çalışmaz(syntax[şekilsel] hata)
        //(compile time error - CTE)


        //run time error - RTE
        //yazımda hata yok ancak çalıştığında hata verebilir (execute)

        System.out.println(str.substring(99));
        //kodda hata yok ama 99. index olamdığı için çalıştırıldığında hata sonucu verir



    }
}
