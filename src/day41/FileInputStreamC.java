package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamC {
    public static void main(String[] args)  {
        String filePath="src/day41/file";

        // sorun çıkabilecek kodu try catch içine alabiliriz
        // hatayı yazdırır ama çalışmaya devam eder
        // hata mesajını değiştirebiliriz

        try {
            FileInputStream fs = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
