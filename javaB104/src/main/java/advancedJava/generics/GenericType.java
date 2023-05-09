package advancedJava.generics;

public class GenericType<T>{
    // E - element (collections)
    // K - key
    // V - value
    // N - number
    // T - type

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
