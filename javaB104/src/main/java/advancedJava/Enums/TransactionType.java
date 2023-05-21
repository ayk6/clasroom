package advancedJava.Enums;

public enum TransactionType {
    DEPOSIT(1),
    WITHDRAW(2),
    TRANSFER(3),
    PAYMENT(4),
    OTHER(5);

    private final int transactionCode;

    private TransactionType(int code) {
        this.transactionCode = code;
    }

    public int getTransactionCode() {
        return transactionCode;
    }
}
