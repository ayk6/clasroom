package practiceJava.ATMproject;

import java.util.Scanner;

public class Options extends Account {
    int opt;

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
    
    public void accountType(){
        System.out.println("1 - Checking account");
        System.out.println("2 - Saving account");
        System.out.println("3 - Exit");
        System.out.print("Chose the account you want to process : ");

        int accType = scan.nextInt();

        if (accType ==1){checkingOperations();}
        if (accType ==2){savingOperations();}
        if (accType ==3){//////////////////
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
