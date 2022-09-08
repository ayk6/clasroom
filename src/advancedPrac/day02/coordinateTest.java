
package advancedPrac.day02;

import java.util.Scanner;

public class coordinateTest {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("x koordinatı giriniz");
        int x=scan.nextInt();
        System.out.println("y koordinatı giriniz");
        int y=scan.nextInt();
        if (x>0 && y>0){
            System.out.println("1. bölge");}
        else if (x<0 && y>0){
            System.out.println("2. bölge");}
        else if (x<0 && y>0){
            System.out.println("2. bölge");}
        else if (x<0 && y<0){
            System.out.println("3. bölge");}
        else if (x>0 && y<0){
            System.out.println("4. bölge");}
        else if (x==0 && y!=0){
            System.out.println("y ekseni üzerinde");}
        else if (y==0 && x!=0){
            System.out.println("x ekseni üzerinde");}
        else if (x==0 && y==0){
            System.out.println("başlangıç noktası (origin)");}
        else System.out.println("hatalı veri girişi");
        }

}
