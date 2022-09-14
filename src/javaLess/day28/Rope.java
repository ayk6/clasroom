package javaLess.day28;

public class Rope {
    public static void swing(){
        System.out.print("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        // climb(); // static olmadığı için çalışmadı
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 =null;
        rope2.play(); // farklı class'ta olsa çalışmazdı - obje gerekirdi

        // işlem çıktısı nedir  - swingswing

    }



}
