package javaLess.day30;

public class staticBlocks {
        // static {} ile oluşturulur
        // her şeyden önce çalışır ( bir kez )
        // class çalışmadan önce yapılması gereken atama varsa burada yapılır
        // başına static yazılmazsa block oluşur, obje ile çalışır
        // static olmayan blok en satırı geldiğinde çalışır ( birden fazla olabilir)
        static{
            System.out.println("static block worked");
        }
        staticBlocks(){
            System.out.println("constructor worked");
        }
    public static void main(String[] args) {
        System.out.println("main method begin");
        staticBlocks obj = new staticBlocks();
    }
    // obje oluşturulmazsa static ve main çalışır
    // obje oluşturulursa tamamı çalışır
}
