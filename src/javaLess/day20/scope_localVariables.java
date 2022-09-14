package javaLess.day20;

public class scope_localVariables {
    //bir method içerisinde oluşturulur ve yalnızca o method'da kullanılabilir
    //default değer almaz
    public static void main(String[] args) {

        int num ;
        // num++; değer ataması olmadığı için kabul etmez

    }
    public void lV(){
        String name ;
        //  System.out.println(name); yazdırmaz

    }
}
