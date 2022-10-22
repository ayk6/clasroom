package practiceJava.preAdvanced;

public class C09string {
    public static void main(String[] args) {

        String str="try sentence";

        // print ent
        System.out.println(str.substring(5,8));

        // print last 4 index
        System.out.println(str.substring(str.length()-4));

        String str2 = "$15.50 10% discount";
        // print without numbers  \\d => digits
        System.out.println(str2.replaceAll("\\d",""));
        // print only numbers
        System.out.println(str2.replaceAll("\\D",""));

        // hide letters and numbers
        System.out.println(str2.replaceAll("\\w","*"));
        //print only letters and nums
        System.out.println(str2.replaceAll("\\W",""));

        // print without spaces
        System.out.println(str2.replaceAll("\\s",""));
        // print letters but * - ignore spaces
        System.out.println(str2.replaceAll("\\S","*"));




    }
}
