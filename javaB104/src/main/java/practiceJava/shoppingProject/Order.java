package practiceJava.shoppingProject;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    List<Product> productList = new ArrayList<>();

    int orderPrice = totalPrice();

    @Override
    public String toString() {
        return "orderNum=" + orderNum +
                ", orderPrice=" + orderPrice;
    }

    public Order(int orderNum, Product p) {
        this.orderNum = orderNum;
        addProduct(p);
    }

    public void addProduct(Product p){
        if (p==null) System.out.println("invalid product");
        else productList.add(p);
        System.out.println("product added");
        orderPrice = totalPrice();
    }

    private int totalPrice() {
        int tp = 0;
        for (Product p: productList) {
            tp+=p.getPrice();
        }
        return tp;
    }

    public void printOrderList(){
        productList.forEach(System.out::println);
    }

    public static void printOrderList(List<Order> orders) {
        orders.forEach(System.out::println);
    }
}
