package day11;

public class C01forLoop {
    public static void main(String[] args) {
        String str = "sentence with non-repeating letters";
        String newStr = "";

        // print str non-repeating letters

        for (int i =0;i<str.length();i++){
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                newStr+=str.charAt(i);
            }
        }
        System.out.println(newStr); // cwho-pagl
    }
}
