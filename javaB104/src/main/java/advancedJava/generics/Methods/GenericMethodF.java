package advancedJava.generics.Methods;

public class GenericMethodF {
    public static void main(String[] args) {
        Integer[] intArr = {3,1,4};
        Double[] dbArr = {3.14,0.4};

        print(intArr);
        System.out.println();
        print(dbArr);
    }

    public static  <T> void print(T[] arr){
        for (T t: arr){
            System.out.print(t+" ");
        }
    }
}
