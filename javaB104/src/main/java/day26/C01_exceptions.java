package day26;

public class C01_exceptions {
    public static void main(String[] args) {
        String str ="a";
        System.out.println(stringToInt(str)); // number format exception
    }
    public static int stringToInt(String s){
        int i = 0;
        try {
            i=Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.err.println("parameter must be numeric");
        }
        return i;
    }
}
