package basicPrac.day04;

public class C02_arrays {
    public static void main(String[] args) {
        // given an array, calculate average value of array elements
        // than print greater than average

        int[] arr = {1,2,3,5,8,9,0};
        int sum =0;
        int average=0;

        for (int i=0; i<arr.length; i++){
            sum +=i;
        }
        average= sum/arr.length;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>average){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
