package basicPrac.day03;

public class multTable {
    public static void main(String[] args) {
        //1 sayısı için çarpım tablosu oluştur


        for (int i=1; i<=10;i++){
            for (int j=1; j<=10;j++){
                System.out.println(i+" . "+j+" = "+(i*j));
            }
            System.out.println("");
        }

    }
}
