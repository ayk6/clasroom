package basicPrac.day02;

public class nestedTernary {
    public static void main(String[] args) {
          /*    Final notu tanimlayin, Nested Ternary ile cozunuz
            'A'  ->  "Başarılı"
              'B'  ->  "orta"
                'C'  ->   "başarısız"
                     bu notlar disindakilere de Digerleri.. yazdiriniz   */
        char not = 'D';
        String result = (not == 'A') ? "Başarılı" :
                        (not == 'B') ? "orta" :
                        ((not == 'C') ? "başarısız:" : "hatalı giriş");

        System.out.println("SONUÇ : " + result);


    }
}

