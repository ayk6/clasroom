package practiceJava.ATMproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    int opt;

    HashMap<Integer, Integer> users = new HashMap<>();

    public void login() {
        ;

        users.put(1001, 1234);
        users.put(1002, 4321);
        users.put(1003, 1010);
        users.put(1004, 1213);
        try {
            System.out.print("Account ıd : ");
            setAccountID(scan.nextInt());
            System.out.print("Pın : ");
            setPassword(scan.nextInt());
        } catch (Exception e) {
            System.out.println("invalid entry");
            System.out.print("press 'q' for quit / press another key for try again : ");
            scan.nextLine();
            String str = scan.nextLine();
            if (str.equalsIgnoreCase("q")) {
                System.out.println("Good Bye...");
            } else login();
        }

        for (Map.Entry<Integer, Integer> w : users.entrySet()) {
            if (w.getKey() == getAccountID() && w.getValue() == getPassword()) {
                accountType();
            } else System.out.println("wrong username or password");
            System.out.println("press 'q' for quit / press another key for try again");
            String str = scan.next();
            if (str.equalsIgnoreCase("q")) {
                System.out.println("Good Bye...");
            } else login();

        }
    }

    public void checkingOperations() {
        do {
            displayOptionPanel();
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    printCheckBalance();
                    break;
                case 2:
                    withdrawFromCheckBalance();
                    break;
                case 3:
                    depositToCheckBalance();
                    break;
            }
        } while (opt != 4);
    }

    public void savingOperations() {
        do {
            displayOptionPanel();
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    printCheckBalance();
                    break;
                case 2:
                    withdrawFromCheckBalance();
                    break;
                case 3:
                    depositToCheckBalance();
                    break;
            }
        } while (opt != 4);
    }

    public void accountType() {
        System.out.println("1 - Checking account");
        System.out.println("2 - Saving account");
        System.out.println("3 - Exit");
        System.out.print("Chose the account you want to process : ");

        int accType = scan.nextInt();

        if (accType == 1) {
            checkingOperations();
            accountType();
        }
        if (accType == 2) {
            savingOperations();
            accountType();
        }
        if (accType == 3) {
            System.out.println("Good Bye...");
        } else {
            System.out.println("invalid choice ");
            accountType();
        }
    }

    public void displayOptionPanel() {
        System.out.println("1 - View balance");
        System.out.println("2 - Withdraw money");
        System.out.println("3 - Deposit money");
        System.out.println("4 - Exit");
        System.out.print("Chose an option : ");
    }
}
