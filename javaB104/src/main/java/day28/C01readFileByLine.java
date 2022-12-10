package day28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C01readFileByLine {
    public static void main(String[] args) {
        printFileByLine();
    }
    public static void printFileByLine(){
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("javaB104/src/main/java/day27/textFile.txt"));
            String textLine = bfr.readLine(); // only first line
            // for all lines use loop
            while (textLine!=null){
                System.out.println(textLine);
                textLine = bfr.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
