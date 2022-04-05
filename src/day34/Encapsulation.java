package day34;

public class Encapsulation {
    // data hiding
    // method'lar için çok kullanılmaz
    // genellikle variable'lar üzerinde kullanılır

    // encapsule edilecek iki variable oluştur
    private int num;
    private String str;

    public static void main(String[] args) {


    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}
