package day14;

public class stringCollecting {
    public static void main(String[] args) {
        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //  String str1 = “$13.99”
        //  String str2 = “$10.55”
        //  ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D","");
        str2 = str2.replaceAll("\\D","");

        double str1num = Double.valueOf(str1);
        double str2num = Double.valueOf(str2);
        //valueOf yerine parseDouble de kullanılabilir

        double result = (str1num+str2num)/100;

        System.out.println("Verilen String'ler toplamı : $"+result+"");

    }
}
