package javaLess.day28;

public class StaticKeyword {
    static int num1;
    int num2; //class level'da oldukları için default değerler atandı
    // buradaki değişiklikler kalıcı olur
    // instance variable'lar obje içerisinde değiştirilebilir
    // obje içerisinde yapılan değişiklik obje içerisinde kalır

    public static void main(String[] args) {
        System.out.println(num1);

        // System.out.println(num2);  num2 static olmadığı için yazdırmadı
                                    // oje oluşturarak kullanabiliriz

        StaticKeyword obj = new StaticKeyword();
        System.out.println(obj.num2); // default değer - 0
        num1++;
        obj.num2++;
        System.out.println(num1 + " " + obj.num2); // 1 1

        StaticKeyword obj2 = new StaticKeyword();
        System.out.print(obj2.num2);  // 0  instance vrbl olduğu için objeye bağlı
        System.out.print(num1);     // 1
        System.out.println(obj2.num1); //1  static olduğu için objeden bağımsız

        obj2.num1++;
        obj2.num2++;

        System.out.print(obj2.num2);  // 1  instance vrbl olduğu için objeye bağlı
        System.out.print(num1);     // 2
        System.out.println(obj2.num1); //2  static olduğu için objeden bağımsız

    }
}
