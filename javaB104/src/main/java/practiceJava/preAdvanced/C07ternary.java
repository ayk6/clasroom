package practiceJava.preAdvanced;

public class C07ternary {
    public static void main(String[] args) {
        int num=555;
        String digits =
        (num>99&&num<1000) ? "3": "not 3";
        System.out.println(digits);

        String day="friday";

        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("mid-week");
                break;
            case "saturday":
            case "sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
