package day37;

import day36.Child;
import day36.Parent;

public class ChildC extends Parent {
    ChildC() {
        super();
        System.out.println("child parametresiz const.");
        // bir class'ı child yaptığımızda parent class'ta bulunan const.
        // public olmalı, ya da ulaşılabilir olmalı
    }
    ChildC(int s){
        System.out.println("parametreli child const.");
    }
    ChildC(int s1, int s2){
        super(s1, s2);
        // parametreli super koymazsak parametresiz parent çalışır,
        // parametreli parnt çalışsın istersek parametreli super eklemeliyiz
        System.out.println("iki parametreli child const.");
    }

    public static void main(String[] args) {

        ChildC chld = new ChildC(4,5);
        // parametre koyarsak parametreli const çalışır
        // tüm child const. ilk satırında parametresiz super const bulunur.
    }
}
