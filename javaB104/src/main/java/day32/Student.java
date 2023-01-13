package day32;

public class Student {
    String name;
    String num;
    int age;
    boolean isPass;

    public Student(String name, String num, int age, boolean isPass) {
        this.name = name;
        this.num = num;
        this.age = age;
        this.isPass = isPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", age=" + age +
                ", isPass=" + isPass +
                '}';
    }
}
