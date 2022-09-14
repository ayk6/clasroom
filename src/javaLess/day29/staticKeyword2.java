package javaLess.day29;

public class staticKeyword2 {
    public static void main(String[] args) {

        // başka class'taki (staticKeyword) static class verilerine ulaşmak
        // için classİsmi.veri yazmalıyız

        System.out.println(staticKeyword.schoolTel); // 3141592

        staticKeyword.schoolTel="123456"; // bu class için değeri değiştirir
        // run bitince eski veriye döner

        System.out.println(staticKeyword.schoolTel); // 123456

        // staticKeyword.scName  veri static olmadığı için çalışmaz
        // obje oluşturarak ulaşabiliriz.

        staticKeyword obj1 = new staticKeyword();
        staticKeyword obj2 = new staticKeyword();

        System.out.println(obj1.scName); // law school

        obj2.scName = "eng school";
        System.out.println(obj1.scName); // law school
        // değişiklik sadece kendi objesinde geçerli


    }
}
