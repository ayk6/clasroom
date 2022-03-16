package day20;

public class scope_instanceVariables {
    //instance (object) variables
    int num; //0 atadı (default)
    String sentence; //null atadı
    boolean tOrF; //false atadı
    char firstLetter; //boş atadı

    public static void main(String[] args) {
            // burada yukarıdaki değerler kullanılmaz
            // statik olmadıkları için
            // kullanmak için obje oluşturmak gerekir

        scope_instanceVariables obj1 = new scope_instanceVariables();
        System.out.println(obj1.num + obj1.sentence + obj1.tOrF);
        //bu şekilde kullanılabilir
        obj1.tOrF = true;
        obj1.num =1;
        obj1.sentence ="asd";
        System.out.println(obj1.firstLetter);
        System.out.println(obj1.num + obj1.sentence + obj1.tOrF); //değişiklik yapıldı

        scope_instanceVariables obj2 = new scope_instanceVariables();
        System.out.println(obj2.num + obj2.sentence + obj2.tOrF); //obj1 değerlerinden etkilenmez
        //bu şekilde kullanılabilir
        obj2.tOrF = false;
        obj2.num =2;
        obj2.sentence ="qwe";
        System.out.println(obj2.num + obj2.sentence + obj2.tOrF); //yeni değerler atanabilir ve sadece bu objeyi bağlar

    }
}
