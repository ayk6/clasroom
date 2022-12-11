package practiceJava.shoppingProject;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    int age;

    List<Order> orderList = new ArrayList<>();

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer(String name, int age, Order order) {
        this.name = name;
        this.age = age;
        addOrder(order);
    }

    public void addOrder(Order ord){
        if (ord==null) System.out.println("invalid order");
        else orderList.add(ord);
        System.out.println("order added");
    }

    public void printOrderList(){
        orderList.forEach(System.out::println);
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

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return"name='" + name + '\'' +
                ", age=" + age +
                ", orderList=" + orderList;
    }
}
