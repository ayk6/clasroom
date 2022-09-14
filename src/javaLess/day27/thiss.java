package javaLess.day27;

public class thiss {
    String name;
    String surname;
    int age;
    boolean alive;


    public thiss(String name, String surname, int age, boolean alive) {
        this.name = name;   // this olmazsa hangisi parametre hangisi variable anlayamaz
        this.surname = surname;  // tis yazdığımızı variable yaptı
        this.age = age;          // diğerini parametre
        this.alive = alive;
    }
    public String toString() {
        return (name + " " + surname + " " + age + " " + alive);
    }
}
