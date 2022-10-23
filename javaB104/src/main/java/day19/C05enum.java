package day19;

public class C05enum {
    public static void main(String[] args) {
        Countries country = Countries.SWEDEN;

        switch (country){
            case UK:
                System.out.println("queen"); break;
            case EGYPT:
                System.out.println("pyramids"); break;
            case USA:
                System.out.println("Escalade"); break;
            case SWEDEN:
                System.out.println("wish"); break;
        }
    }
}
