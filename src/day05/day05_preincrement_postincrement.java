package day05;

public class day05_preincrement_postincrement {
    public static void main(String[] args) {
        int num=10;
        num += 1;
        System.out.println(num);
        num ++;
        System.out.println(num);
        //6 ve 7. satırda yaptığımız işlemleri aynı satırda yaparsak
        //hangi işlemi önce yapmamız gerekteğini belirtmeliyiz

        System.out.println(num++); //önce yazdır sonra artır(ya da azalt) - post-increment
        System.out.println(num);
        System.out.println(++num); //önce artır(ya da azalt) sonra yazdır - pre-increment
        System.out.println(num);

        int a=15;
        int b=a++;
        System.out.println(a); //16
        System.out.println(b); //15 , ++a yapsaydık 16 verirdi

        int num1= 10; int num2=20; int num3=30;
        num2=num1++;
        System.out.println(num1 + " , " + num2 + " , " + num3); // 11 10 30
        //num1 arttı num2 önce atamayı yaptı
        //++num1 olsaydı ikisi de 11 çıkardı



    }
}
