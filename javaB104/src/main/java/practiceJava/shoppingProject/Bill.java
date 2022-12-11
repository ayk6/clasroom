package practiceJava.shoppingProject;

public class Bill {
    int billPrice;
    int billNum;

    public Bill(int billPrice, int billNum) {
        this.billPrice = billPrice;
        this.billNum = billNum;
    }

    public int getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(int billPrice) {
        this.billPrice = billPrice;
    }

    public int getBillNum() {
        return billNum;
    }

    public void setBillNum(int billNum) {
        this.billNum = billNum;
    }
}
