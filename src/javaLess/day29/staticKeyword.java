package javaLess.day29;

public class staticKeyword {
    String scName = "law school";
    static String schoolTel = "3141592";

    public static void staticMethod() {
        System.out.println("static method worked");
    }
    public void unStaticMethod() {
        System.out.println("unStatic method worked");
    }

    public static void main(String[] args) {
        System.out.println(schoolTel); // 314159265
        // diğer class kalıcı olarak değiştirmedi
    }
}
