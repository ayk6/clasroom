package day27;

public class C01exceptions {
    public static void main(String[] args) {
        try {
            int i =0;
            System.out.println(10/i);
        }
        catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("database disconnected"); // always works
        }
    }
}
