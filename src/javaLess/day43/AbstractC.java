package javaLess.day43;

public abstract class AbstractC {
    // başlığında abstract olarak belirtilir
    // tek başına obje içermez
    // child class larda override edilmesi gereken methodları barındırır
    // bu yüzden method body kullanılmaz
    // abstract olmayan method/classlara concrete denir
     // concrete method'lar body'siz olmaz
    // abstract class simgesi de farklıdır. run işareti bulunmaz

    public abstract void AbstractMethod();
    // abstract methodlar method body olmadan kullanılır
}
