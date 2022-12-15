package day28;

public class ToyotaAuris implements ToyotaAc,ToyotaEngine,ToyotaHood {
    @Override
    public void eco() {
        System.out.println("auris uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("auris uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("auris uses tsi engine");
    }

    @Override
    public void digital() {
        System.out.println("auris uses digital mm");
    }

    @Override
    public void climate() {
        System.out.println("auris has climate");
    }

    @Override
    public void steel() {
        System.out.println("auris made by steel");
    }
}
