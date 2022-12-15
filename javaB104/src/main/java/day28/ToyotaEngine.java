package day28;

public interface ToyotaEngine {
    void eco(); // interface methods can not have body
                // there is no need public or abstract keywords

    void gas();
    void tsi();

    // if we need concrete method in interface, we use default or static

    default void defaultMethod(){
        System.out.println("default concrete method works in interface");
    }

    static void staticMethod() {
        System.out.println("static concrete method works in interface");
    }
}
