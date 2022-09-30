package day06;

public class C01nestedIf {
    public static void main(String[] args) {
        // if (cond){
        //      if(cond2) res1
        //      else res2
        // }
        // else default

        // using nested if may cause time complexity

        String password = "Aazz12*";

        if (password.charAt(0)>='A' && password.charAt(0)<= 'Z'){
            if (password.charAt(0)=='A'){
                System.out.println("valid");
            }
            else System.out.println("invalid");
        }
        else if (password.charAt(0)>='a' && password.charAt(0)<= 'z'){
            if (password.charAt(0)=='z'){
                System.out.println("valid");
            }
            else System.out.println("invalid");
        }
        else System.out.println("invalid");
    }
}
