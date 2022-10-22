package practiceJava.day01;

public class C03array {
    public static void main(String[] args) {
        /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */
        int[] arr ={4,6,5,-10,8,5,20};
        int anInt =10;
        
        sum2(arr,anInt);
    }
    private static void sum2(int[] arr, int anInt) {
        for (int i =0;i<= arr.length-2;i++){
            for (int j = i+1;j<=arr.length-1;j++){
                if (arr[i]+arr[j]==anInt){
                    System.out.println(""+arr[i]+" + "+arr[j]+" = "+anInt);
                }
            }
        }
    }

}
