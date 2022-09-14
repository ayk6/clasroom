package javaLess.day52;


import javaLess.day49.MapMain;
import java.util.Map;
import java.util.Set;

public class UpdateC {
    // map içerisindeki tüm branşları java ile değiştir
    public static void main(String[] args) {
        Map<Integer,String> classMap= MapMain.mainMap();
        System.out.println(classMap);

        Set<Map.Entry<Integer,String>> classEntrySet=classMap.entrySet();

        for (Map.Entry<Integer,String> each: classEntrySet
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry=each.getValue();
            String[] valueArray =valueEntry.split(", ");
            valueArray[2]="Java";

            String newValue=valueArray[0]+", "+valueArray[1]+", "+
                    valueArray[2];
            classMap.put(keyEntry,newValue);
        }
        System.out.println(classMap);
        // {1001=Saldıray, Durgun, Java, 1002=Bülent, Avi, Java, 1003=Vedat, İşçi, Java}
        // yalnızca belirli key'lere ait veriyi değiştirmek isttersek
        // if kullanılabilir
    }

}
