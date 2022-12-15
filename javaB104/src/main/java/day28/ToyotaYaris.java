package day28;

public class ToyotaYaris implements ToyotaAc,ToyotaEngine,ToyotaHood {
    @Override
    public void eco() {
        System.out.println("yaris uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("yaris uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("yaris uses tsi engine");
    }

    @Override
    public void digital() {
        System.out.println("yaris uses digital mm");
    }

    @Override
    public void climate() {
        System.out.println("yaris has climate");
    }

    @Override
    public void steel() {
        System.out.println("yaris made by steel");
    }
}
