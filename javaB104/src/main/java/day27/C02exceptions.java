package day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02exceptions {
    public static void main(String[] args){
        // read the text file
        readTextFromFile();
    }

    public static void readTextFromFile(){

        try {
            FileInputStream fis = new FileInputStream("javaB104/src/main/java/day27/textFile.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
