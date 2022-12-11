package practiceJava.shoppingProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product iPhone = new Product("iPhone11", "Phone", 15000, 10);
        Product mac = new Product("macBookAir", "Laptop", 20000, 5);
        Product tv = new Product("SamsungTV", "TV", 10000, 15);


        Order order1 = new Order(1, iPhone);
        Order order2 = new Order(2, mac);
        Order order3 = new Order(3, tv);


        List<Bill> billList = new ArrayList<>();
        Bill bill1 = new Bill(order1);
        Bill bill2 = new Bill(order2);
        Bill bill3 = new Bill(order3);

        billList.add(bill1);
        billList.add(bill2);
        billList.add(bill3);

        List<Customer> customerList = new ArrayList<>();

        Customer fatih = new Customer("Fatih", 30);
        fatih.addOrder(order1);
        customerList.add(fatih);

        Customer ismail = new Customer("İsmail", 25);
        ismail.addOrder(order2);
        customerList.add(ismail);

        Customer mustafa = new Customer("Mustafa", 20);
        mustafa.addOrder(order3);
        customerList.add(mustafa);

        Customer nuretdin = new Customer("Nuretdin", 35);
        nuretdin.addOrder(order1);
        nuretdin.addOrder(order2);
        customerList.add(nuretdin);

        System.out.println("Customer List : ");
        customerList.stream().map(Customer::getName).forEach(System.out::println);

        // -Calculate the number of products purchased by customers whose name is Nuretdin.
        System.out.println("products bought by Nuretdin");
        customerList.stream().filter(t -> t.getName().equals("Nuretdin")).map(Customer::getOrderList).forEach(System.out::println);

        // -Calculate the total shopping amount of customers whose name is Mustafa and who are younger than 30 and
        //  older than 15.
        System.out.println("print customers whose name is ali and 15<age<30 ");
        customerList.stream().filter(t -> t.getName().equals("Mustafa")).filter(t -> t.getAge() < 30 && t.getAge() > 15).forEach(System.out::println);

        // -List all bills over 1500 TL in the system.
        System.out.println("print bills greater than 15000");
        for (Bill bill : billList) {
            int price = bill.getBillPrice();
            if (price > 15000) {
                System.out.println("Order Num : " + bill.getOrder().getOrderNum() + " => Price : " + price);
            }
        }
    }

}
