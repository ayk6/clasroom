package basicPrac.day02;

public class escapeSequences {
    public static void main(String[] args) {
         /*
      \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir.
              \": prints double quote :"" cift tirnak yazdirir. */
        //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdiriniz
        System.out.println("\"Hello \", \"World \\ /\"");

        // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.
        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");
        //Soru-3 : "Java" ile hayat cok 'kolay'   yazdiriniz
        System.out.println("\"Java\" ile hayat çok \'kolay\'");
        //Soru-4 : "Zaruret" insani
        //         'kasif'  yapar   yazdiriniz
        // sonraki "Education ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin.
        System.out.println("\t\"Zaruret\" insani\n\t\'kaşif\' yapar\n\n\n\t\"Education ile java cok kolay ...\"");

    }
}
