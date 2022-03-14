package day19;

public class doWhileLoop {
    public static void main(String[] args) {
        //while şart sağlanmazsa çalışmaz, do while 1 kez çalışır
        //pozitif tam sayıdan küçük pozitif tam sayıları yazdır

        int num = 4;
        int count = 1;

        System.out.print("while loop ile alınan sonuç : ");
        while (count < num) {
            System.out.print(count+ " ");
            count++;
        }
        count =1;
        // aynısını do while ile yap
        //önce yazdırırı sonra kontrol eder, true ise başa döner
        System.out.print("\ndo-while loop ile alınan sonuç : ");
        do {
            System.out.print(count+" ");
            count++;
        }while (count < num);
    }
}
