package day30;

import java.util.Arrays;

public class PassByValue2 {
    public static void main(String[] args) {
    // non-primitive data türlerinde referans değişmez ama içeriği değiştirir
    // içerik değişikliği kalıcı olur
    // referansı değiştirecek işlem yapılırsa (uzunluğu değiştirmek gibi)
    // burada referansı geçici değiştirir ve method sonrası eskiye döner

        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array)); // 1, 2, 3
        
        changeArray(array);

        System.out.println(Arrays.toString(array)+" <= method sonrası");
    }

    private static void changeArray(int[] array) {
        array[0]=9;
        array[1]=8;
        System.out.println(Arrays.toString(array)); // 9, 8, 3
    }
}
