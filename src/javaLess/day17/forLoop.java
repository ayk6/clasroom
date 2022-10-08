package javaLess.day17;

public class forLoop {
    public static void main(String[] args) {

        //başlangıç değeri koşulu sağlamazsa loop çalışamadan kırılır
        //boş çıktı verir
        //hiç true vermezse de aynı sonuç

        // 10 ile 30 arasındaki sayıları virgül kullanarak aynı satırda yazdır

        for (int i = 10; i <=30; i++){
            if (i <30){
            System.out.print(i + ", "); }
            else System.out.println(i); //son virgülü yazmaması için
        }
        int begin = 10; int end =30;
        for (int i = begin; i <= end; i++){
            if ( i<end){
                System.out.print(i + ", "); }
            else System.out.println(i); //son virgülü yazmaması için
        }



    }
}
