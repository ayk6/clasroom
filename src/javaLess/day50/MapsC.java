package javaLess.day50;

import javaLess.day49.MapMain;
import java.util.*;

public class MapsC {
    // öğrenci listesini düzenli olarak yazdır
    // map, index yapısını desteklemediği için key'leri set'e
    // daha sonra set'i list'e aktardık
    // sonra value'ları index ile ulaşılabilir hale getireceğiz
    // MultiDimentional Array

    public static void main(String[] args) {
        Map<Integer,String> classList = MapMain.mainMap();
        System.out.println(classList);
        // {1001=Saldıray, Durgun, QA, 1002=Bülent, Avi, C#, 1003=Vedat, İşçi, Dev}

        Set<Integer> classKeySet = classList.keySet();
        Integer[] keyArray= new Integer[classKeySet.size()];
        // atama zor olur

        List<Integer> keyList = new ArrayList<>();
        // for (Integer each: classKeySet) {
        //    keyList.add(each);
        keyList.addAll(classKeySet); // daha kolay yolu

        Collection<String> classValueColl = classList.values();
        List<String> classValueList = new ArrayList<>();
        classValueList.addAll(classValueColl);

        String firstValue= classValueList.get(0); // Saldıray, Durgun, QA
        String [] firstValueArray= firstValue.split(", ");
        int outerArrayLength = classValueList.size();
        int innerArrayLength = firstValueArray.length;

        String valueMDArray[][]=new String [outerArrayLength][innerArrayLength];

        for (int i=0; i<outerArrayLength; i++){
            String temp [] = classValueList.get(i).split(", ");
            for (int j=0; j<innerArrayLength; j++){
                valueMDArray [i][j]= temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArray));
        // [[Saldıray, Durgun, QA], [Bülent, Avi, C#], [Vedat, İşçi, Dev]]

        System.out.println("Numara   İsim   Soyisim   Branş");
        System.out.println("===============================");
        for (int i=0; i<keyList.size(); i++){
            System.out.print(keyList.get(i)+"    ");
            for (int j=0; j<innerArrayLength;j++){
                System.out.print(valueMDArray[i][j]+"    ");
            }
            System.out.println("");
        }

    }
}
