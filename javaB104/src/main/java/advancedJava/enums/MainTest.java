package advancedJava.enums;

public class MainTest {
    public static void main(String[] args) {
        usingEnum(TransactionType.DEPOSIT);
        usingEnum(TransactionType.WITHDRAW);
        usingEnum(TransactionType.TRANSFER);
        usingEnum(TransactionType.PAYMENT);
        usingEnum(TransactionType.OTHER);
        // usingEnum(TransactionType.OTHER2); CTE
    }

    private static void usingEnum(TransactionType transactionType){
        if (transactionType==TransactionType.DEPOSIT){
            System.out.println("money is deposited");
        }if (transactionType==TransactionType.WITHDRAW){
            System.out.println("money is withdrawn");
        }if (transactionType==TransactionType.TRANSFER){
            System.out.println("money being transferred");
        }if (transactionType==TransactionType.PAYMENT){
            System.out.println("payment is in progress");
        }if (transactionType==TransactionType.OTHER){
            System.out.println("other transaction");
        }

        // Enum methods
        System.out.println(transactionType.name());
        System.out.println(transactionType.getTransactionCode());
        System.out.println(transactionType.ordinal()); // which rank
    }
}
