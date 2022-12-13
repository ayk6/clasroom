package practiceJava.others;

public class ArmstrongNum {
    public static void main(String[] args) {

        for (int i=100; i<=999; i++){
            int basNumber=0;
            int number=i;
            while (number!=0) {
                number /= 10;
                basNumber++;
            }
            number=i;

            int result=0;

            while (number!=0){
                int basValue=number%10;
                int basPow=1;

                for (int k=1; k<=basNumber; k++){
                    basPow *= basValue;
                }
                result+=basPow;
                number/=10;
            }
            if (i==result){
                System.out.print(i+" ");
            }

        }

//        int yuzler,onlar,birler,toplam;
//        System.out.println("Armstrong Sayilar: ");
//        for (int i=100;i<1000;i++){
//            yuzler=i/100;
//            onlar=(i%100)/10;
//            birler=i%10;
//            toplam= (int) (Math.pow(yuzler,3)+Math.pow(onlar,3)+Math.pow(birler,3));
//            if (i==toplam){
//                System.out.println(i+" ");

    }
}
