package day18;

public class C01listPassByValue {
    public static void main(String[] args) {
        int org = 5;

        change(org); // 15
        System.out.println(org); // 5

        System.out.println(changeReturn(org)); // 15
        System.out.println(org); // 5
    }
    private static int changeReturn(int org) {
        org*=3;
        return org;
    }
    private static void change(int org) {
        org*=3;
        System.out.println(org);
    }
    // java is pass by value language
    // retains the original value. creates a copy. working on the copy
    // some languages are pass by reference
}
