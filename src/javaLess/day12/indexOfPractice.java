package javaLess.day12;

public class indexOfPractice {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //    - Girilen kelime cumlede kullanilmamis.
        //    - Girilen kelime cumlede 1 kere kullanilmis.
        //    - Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle = "Geleceği merak edenler fallara değil mezarlıklara baksın";
        String kelime= "merak";
        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index
        int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);
        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if(ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
    }
}
