package javaLess.day52;

import javaLess.day49.MapMain;

import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> classMap= MapMain.mainMap();
        System.out.println(classMap);

        System.out.println(classMap.entrySet());
        // [1001=Saldıray, Durgun, Java, 1002=Bülent, Avi, C#, 1003=Vedat, İşçi, html]
        
        // entrySet methodu entry'lerden oluşan set döndürür
        // set değerine atanabilir
        // her key ve value ayrı parçalara dönüşür

        Set<Map.Entry<Integer,String>> classEntrySet=classMap.entrySet();

        System.out.println("\nNumara   İsim      Soyisim   Branş");
        System.out.println("==================================");

        for (Map.Entry<Integer,String> each:classEntrySet
             ) {
            int entryKey = each.getKey();
            String entryValue = each.getValue();

            String valueArray[]=entryValue.split(", ");

            System.out.printf("%-8d %-9s %-9s %s \n",entryKey,valueArray[0],valueArray[1],valueArray[2]);
        }
        
    }
}
