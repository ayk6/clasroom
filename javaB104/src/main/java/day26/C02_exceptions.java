package day26;

public class C02_exceptions {
    public static void main(String[] args) {
        String str = "125a";
        System.out.println(method1(str));
        System.out.println(method2(str));
        System.out.println(method3(str));
        System.out.println(method4(str));
    }

    private static double method1(String str) {
        double length = 0;
        double value = 0;
        double result = 0;
        try {
            length = str.length();
            value = Integer.parseInt(str);
            result = (value / length);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    private static double method2(String str) {
        double length = 0;
        double value = 0;
        double result = 0;
        try {
            length = str.length();
            value = Integer.parseInt(str);
            result = (value / length);
        } catch (NullPointerException | NumberFormatException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    private static double method3(String str) {
        double length = 0;
        double value = 0;
        double result = 0;
        try {
            length = str.length();
            value = Integer.parseInt(str);
            result = (value / length);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    private static double method4(String str) {
        double length = 0;
        double value = 0;
        double result = 0;
        try {
            length = str.length();
            value = Integer.parseInt(str);
            result = (value / length);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
