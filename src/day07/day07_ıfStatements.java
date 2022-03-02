package day07;

public class day07_ıfStatements {
    public static void main(String[] args) {
        // if(boolean){şartın sonucu yazılır}
        //ilk parantez içine true or false sonuç veren bir veri girilir

        int a = 4;
        int b = 5;
        if (a > b) {
            System.out.println(a * b);
        }
        if (a == b) {
            System.out.println(a + b);
        }//kod çalıştı ama sonuç vermedi çünkü şartlar gerçekleşmedi

        if (a < b) {
            System.out.println(a - b);
        }//şartlar gerçekleşti ve yazdı -1
        //her if bağımsız çalışır, parantezlere dikkat

        if (a<b && b<100){
            System.out.println("çalıştı"); //çalıştı
        }
        if (a>0) System.out.println("tek satır çalıştı");
        //süslü parantez olmazsa tek sonuca izin verir ve ; yazınca kod biter

        if (a>0) {
            System.out.println("ilk satır çalıştı");
            System.out.println("ikinci satır da çalıştı");
        }//süslü parantez içindeki tüm satırlar çalışır




    }

}
