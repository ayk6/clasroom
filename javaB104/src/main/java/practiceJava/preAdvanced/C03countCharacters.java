package practiceJava.preAdvanced;

public class C03countCharacters {
    public static void main(String[] args) {
        String str ="count each character.";

        int strLength = str.length();
        int[] counter = new int[256]; // extended ascii character num

        for (int i = 0;i<strLength;i++){
            counter[(int)str.charAt(i)]++;
        }

        for (int i =0; i<counter.length;i++){
            if (counter[i] !=0){
                System.out.println((char) i+" - " +counter[i]);
            }
        }
    }
}
