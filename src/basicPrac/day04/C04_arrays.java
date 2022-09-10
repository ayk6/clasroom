package basicPrac.day04;

public class C04_arrays {
    public static void main(String[] args) {
        // given a md array, create a method that adds even numbers

        int[][] arr={{1,2,5},{8,0},{9,6,13,18}};
        int sum =0;

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (arr[i][j]%2==0){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
