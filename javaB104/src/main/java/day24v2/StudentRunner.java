package day24v2;

public class StudentRunner {
    public static void main(String[] args) {

        Student std = new Student();
        Student std2 = new Student();

        System.out.println(std.stdName);    // kim wexler
    //
        System.out.println(std.getStdId()); // 1001
        System.out.println(std.getStdName());   // kim wexler
        System.out.println(std.getGpa());   // 2.3
        System.out.println(std.isPass());   //true

        std.setStdName("new kim");
        std.setGpa(1.2);
        std.setPass(false);

        System.out.println(std.stdName); // new kim
        System.out.println(std2.stdName); // kim wexler

        System.out.println(std.getStdId()); // 1001
        System.out.println(std.getStdName()); // new kim
        System.out.println(std.getGpa()); // 1.2
        System.out.println(std.isPass()); // false




    }
}
