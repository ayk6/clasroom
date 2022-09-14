package javaLess.day12;

public class startsWith_isEmpty {
    public static void main(String[] args) {
        //startsWith istenen karakter(ler) ile başlarsa true
        //aksi halde false
        //isEmpty "" için true, aksi halde false

        String sentence = "Düzelicez ins";
        System.out.println(sentence.startsWith("D"));//TRUE
        System.out.println(sentence.startsWith("Düzelicez"));//TRUE
        System.out.println(sentence.startsWith("A"));//FALSE

        System.out.println(sentence.isEmpty());//FALSE

    }
}
