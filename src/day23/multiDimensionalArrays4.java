package day23;

public class multiDimensionalArrays4 {
    public static void main(String[] args) {

        int[][] array = {{1, 2},{3,4},{5,6}};
        //inner array'ler son indexler çarpımını bul
        int result = 1;

        for (int i = 0; i<array.length; i++){

                result *= array[i][array[i].length-1];
        }
        System.out.println(result);

    }

}
