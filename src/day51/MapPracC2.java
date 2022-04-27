package day51;

import day49.MapMain;

import java.util.*;

public class MapPracC2 {
    // verilen Map'te istenen veriyi içeren value'leri döndüren method oluştur

    public static void main(String[] args) {
        Map<Integer,String> classMap= MapMain.mainMap();
        String lang= "Java";

        List<String> result= langMethod(classMap,lang);
        System.out.println(result);

    }

    private static List<String> langMethod(Map<Integer, String> classMap, String lang) {
        List<String> result= new ArrayList<>();

        Collection<String> classValueColl = classMap.values();
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

        for (int i=0; i<outerArrayLength; i++ ){
            for (int j=0; j<innerArrayLength; j++){
                if (valueMDArray[i][j].equals(lang)){
                    result.add(valueMDArray[i][0]);
                }
            }
        }

        return result;
    }

}
