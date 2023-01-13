package day32;

import java.util.Hashtable;

public class C01_hashTable {
    // hashtable is a map
    // randomly sort - fast   -- but hashMap is faster
    // thread-safe and synchronized
    // key or value cannot be null

    public static void main(String[] args) {
        Hashtable<String,Integer> populations = new Hashtable<>();
        populations.put("USA",400000000);
        populations.put("TR",80000000);
        populations.put("GER",70000000);
        // populations.put("FRA",null); null pointer exception
        // populations.put(null,10000000); null pointer exception

        Hashtable<String,Student> studentHashtable = new Hashtable<>();
        studentHashtable.put("Stu001",new Student("Jim","001",25,false));
        System.out.println(studentHashtable);
        // Stu001=Student{name='Jim', num='001', age=25, isPass=false}}
        studentHashtable.get("Stu001"); // Student{name='Jim', num='001', age=25, isPass=false}
        System.out.println(studentHashtable.get("Stu001").name); // Jim
    }
}
