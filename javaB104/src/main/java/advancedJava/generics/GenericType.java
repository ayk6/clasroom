package advancedJava.generics;

public class GenericType<T>{
    // E - element (collections)
    // K - key
    // V - value
    // N - number
    // T - type

    // type cannot be primitive

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        GenericType<String> obj1 = new GenericType<>();
        GenericType<Integer> obj2 = new GenericType<>();

        obj1.setType("generic types");
        obj2.setType(4);
        int a = obj2.getType();
    }
}
