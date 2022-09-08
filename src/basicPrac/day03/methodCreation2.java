package basicPrac.day03;

public class methodCreation2 {
    public static void main(String[] args) {
        // bir string içerisindeki karakterleri yalnızca bir kere yazdıran method oluştur
        // input "aaaaabbbbcccccdddddddd", output "abcd"

        lowerToALetter("aaaabbbbccccdddddabcd");
    }

    private static void lowerToALetter(String str) {
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        System.out.println(result);
    }
}
