package practiceJava;

public class C01performanceTest {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<50000; i++){
            sb.append("add");
        }
        System.out.println("StringBuffer\t: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<50000; i++){
            sb2.append("add");
        }
        System.out.println("StringBuilder\t: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i=0; i<50000; i++){
            str+="add";
        }
        System.out.println("String\t\t\t: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
