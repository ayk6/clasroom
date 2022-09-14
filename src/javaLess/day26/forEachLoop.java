package javaLess.day26;

public class forEachLoop {
    public static void main(String[] args) {

        int array[]={2,4,6,8,11};

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");

        //for each loop
        //çalıştırmak için hedef collection verilmeli

        for (int each:array
             ) {
            System.out.print(each +" ");
        }
        //hedefteki tüm indexleri getirir
        //indexe bağlı işlem yapamayız. (artırma azaltma gibi)
    }
}
