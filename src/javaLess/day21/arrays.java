package javaLess.day21;

public class arrays {
    public static void main(String[] args) {
        //non-primitive data türü
        //birden fazla variable depolamak için kullanılır
        //primitive dataları depolar
        //non-primitive olanların da referansını depolar
        //arrays içinde tüm variable'lar aynı data türünde olmalıdır,
        //tr'ye dizi olarak çevirilmiş

        int arr[]= {1,2,3};
        int[] arr2= {1,2,3,4,5};
        int [] arr3= {1,2,3,4,5};

        double[] arr4= {1.5,5.6,5};

        String arr5[]={"asd","qwe","zxcvb"};

        int[] arr6; //boş atamaya izin verir
        //System.out.println(arr6); //kullanmaya izin vermez, değer ataması gerekir

        //değer atamadan oluşturmak için boyutunu beliremeliyiz
        int arr7[]=new int[5]; // 5 veri boyutunda
        System.out.println(arr7); // bu şekilde boş array kullanıma izin verir






    }
}
