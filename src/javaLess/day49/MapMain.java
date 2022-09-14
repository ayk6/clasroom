package javaLess.day49;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static Map<Integer,String> mainMap(){
        Map<Integer,String> classMap=new HashMap<>();
        classMap.put(1001,"Saldıray, Durgun, Java");
        classMap.put(1002,"Bülent, Avi, C#");
        classMap.put(1003,"Vedat, İşçi, html");

        return classMap;
    }
}
