package advancedJava.serialization;

import java.io.*;

public class Serialization_Deserialization {
    public static void main(String[] args) {
       // writeObj();
        readObj();
    }

    private static void writeObj() {
        System.out.println("object created");
        User us1 = new User(1001L, "mike", 50);
        User us2 = new User(1002L, "huel", 40);
        User us3 = new User(1003L, "lalo", 45);

        try {
            FileOutputStream fos = new FileOutputStream("user.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(us1);
            oos.writeObject(us2);
            oos.writeObject(us3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObj(){
        try {
            FileInputStream fis = new FileInputStream("user.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User us1 = (User) ois.readObject();
            User us2 = (User) ois.readObject();
            User us3 = (User) ois.readObject();
            System.out.println(us1);
            System.out.println(us2);
            System.out.println(us3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable { // transferable
    private Long id;
    private String name;
    private int age;

    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
