package day14;

public class C01forEachLoop {
    public static void main(String[] args) {
        // arrays hold only primitive data types
        // if u put non-primitive, array holds pointer

        String[] names ={"tom","jim","amy","john","jef"};

        //print until amy
        for (String name : names){
            System.out.print(name+ ", ");
            if (name=="amy") break;
        }
        System.out.println("");

        // print without jim and jef
        for (String name : names){
            if (!name.equals("jim") && !name.equals("jef")) {
                System.out.print(name + ", ");
            }
        }
    }
}
