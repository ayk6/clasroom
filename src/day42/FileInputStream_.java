package day42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
        String filePath="src/day41/file";

        try {
            FileInputStream fs= new FileInputStream(filePath);
            int num=0;
            while ((num=fs.read()) !=-1) {
                System.out.print((char)num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileInputStream'ın altını çizer
        // CTE değil CTException, Exception verebilir uyarısı
        // CTException hatalı kod yazımı değil
        // try catch ile çözülebilir
        // tek try birden fazla catch kullanılabilir
        // parent child ilişkisi var ise (catch ler arasında)
        // sadece parent kullanılabilir ya da önce child yazılır
        // nested try catch de kullanılabilir




    }
}
