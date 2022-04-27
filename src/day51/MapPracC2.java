package day51;

import day49.MapMain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MapPracC2 {
    // verilen Map'te istenen veriyi içeren value'leri döndüren method oluştur

    public static void main(String[] args) {
        Map<Integer,String> classMap= MapMain.mainMap();
        String lang= "Java";

        List<String> result= langMethod(classMap,lang);

    }

    private static List<String> langMethod(Map<Integer, String> classMap, String lang) {
        List<String> result= new ArrayList<>();

        Collection<String> classValueColl = classMap.values();


        return result;
    }

}
