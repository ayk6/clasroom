package practiceJava.shoppingProject;

public class Bill {
    private final Order order;
    int billPrice;

    public Bill(Order order) {
        this.billPrice = order.getOrderPrice();
        this.order = order;
    }

    public int getBillPrice() {
        return billPrice;
    }

    public Order getOrder() {
        return order;
    }

}
