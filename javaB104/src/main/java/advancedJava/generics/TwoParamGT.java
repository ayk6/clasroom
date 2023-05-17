package advancedJava.generics;

public class TwoParamGT<S,U> {

    private S s;
    private U u;

    public TwoParamGT(S s, U u) {
        this.s = s;
        this.u = u;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public static void main(String[] args) {
        TwoParamGT<String,Integer> obj1 = new TwoParamGT<>("str",1);
        TwoParamGT<Integer,String> obj2 = new TwoParamGT<>(2,"str2");

        System.out.println(obj1.getS());
        System.out.println(obj1.getU());
    }
}
