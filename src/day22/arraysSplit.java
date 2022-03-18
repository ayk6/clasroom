package day22;

public class arraysSplit {
    public static void main(String[] args) {

        String sentence = "Arrays split deneEme cümlesi";
        //verilen cümlede kaç e var
        String letter ="e";

        letterCOunt(sentence,letter);



    }

    private static void letterCOunt(String sentence, String letter) {
        int count = 0;
        String allLetters[]= sentence.split("");
        for (int i=0; i<allLetters.length;i++){
            if (allLetters[i].equalsIgnoreCase(letter)){
                count+=1;
            }
        }
        System.out.println("cümlede istenene harf "+count+" kez kullanılmış");
    }
}
