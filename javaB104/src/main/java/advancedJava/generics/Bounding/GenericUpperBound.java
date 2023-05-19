package advancedJava.generics.Bounding;

public class GenericUpperBound <T extends Number>{
    // generic but only children of the number class
    private T[] numArr;

    public GenericUpperBound(T[] numArr) {
        this.numArr = numArr;
    }

    public double getAvg(){
        double sum =0;
        for (T t : numArr){
            sum+=t.doubleValue();
        }
        return sum/numArr.length;
    }

    public static void main(String[] args) {
        Integer[] intArr = {3,1,4,1,5,9,2};
        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>(intArr);
        System.out.println(obj1.getAvg());

        Double[] dbArr = {3.14,0.4,4.0};
        GenericUpperBound<Double> obj2 = new GenericUpperBound<>(dbArr);
        System.out.println(obj2.getAvg());

        // string arr? No! not child of number class
    }
}
