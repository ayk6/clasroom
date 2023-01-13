package day32;

import java.util.SortedMap;
import java.util.TreeMap;

public class C002_treeMap {
    // orders (natural order)
    // slow
    // non thread-safe  non synchronized
    public static void main(String[] args) {

        TreeMap<String, Integer> salaries = new TreeMap<>();

        salaries.put("Walt",10000);
        salaries.put("Saul",30000);
        salaries.put("Jess",2000);
        salaries.put("Hank",20000);

        System.out.println(salaries);

        salaries.tailMap("Jess"); // returns sorted map jess to end

        salaries.tailMap("Jess",false);
        // returns sorted map jess to end but jess is not included

        salaries.subMap("Jess",true,"Walt",false);
        // returns sorted map jess to walt but walt is not included

        salaries.lowerEntry("Saul");
        // returns entry, before given key,
        // if key dont exists, still returns

        salaries.higherEntry("Saul");
        // returns entry, after given key,
        // if key dont exists, still returns

        salaries.ceilingEntry("Saul");
        // returns entry, if key exists, returns key, else returns after entry

        salaries.floorEntry("Saul");
        // returns entry, if key exists, returns key, else returns before entry



    }
}
