package practiceJava.ATMproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountID;
    private int password;

    private double checkingBalance;
    private double savingBalance;

    DecimalFormat usdFormat = new DecimalFormat("'$'###,##0.00");

    Scanner scan = new Scanner(System.in);

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    private double calcCheckBalanceWithdraw(double amount) {
        return checkingBalance -= amount;
    }

    private double calcCheckBalanceDeposit(double amount) {
        return checkingBalance += amount;
    }

    private double calcSavingBalanceWithdraw(double amount) {
        return savingBalance -= amount;
    }

    private double calcSavingBalanceDeposit(double amount) {
        return savingBalance += amount;
    }

    public void withdrawFromCheckBalance() {
        System.out.println("Checking balance : " + usdFormat.format(checkingBalance
        ));
        System.out.println("Amount to be withdrawn : ");
        double withdrawn = scan.nextDouble();

        if (withdrawn <= 0) {
            System.out.println("Invalid amount");
            withdrawFromCheckBalance();
        }
        if (withdrawn > checkingBalance) {
            System.out.println("Cannot withdraw more than balance");
            withdrawFromCheckBalance();
        }

        calcCheckBalanceWithdraw(withdrawn);
        printCheckBalance();

    }

    public void depositToCheckBalance() {
        System.out.println("Checking balance : " + usdFormat.format(checkingBalance
        ));
        System.out.println("Amount to be deposit : ");
        double deposit = scan.nextDouble();

        if (deposit <= 0) {
            System.out.println("Invalid amount");
            depositToCheckBalance();
        }

        calcCheckBalanceDeposit(deposit);
        printCheckBalance();

    }
    public void withdrawFromSavingBalance() {
        System.out.println("Saving balance : " + usdFormat.format(savingBalance));
        System.out.println("Amount to be withdrawn : ");
        double withdrawn = scan.nextDouble();

        if (withdrawn <= 0) {
            System.out.println("Invalid amount");
            withdrawFromSavingBalance();
        }
        if (withdrawn > savingBalance) {
            System.out.println("Cannot withdraw more than balance");
            withdrawFromSavingBalance();
        }

        calcSavingBalanceWithdraw(withdrawn);
        printSavingBalance();

    }

    public void depositToSavingBalance() {
        System.out.println("Checking balance : " + usdFormat.format(savingBalance));
        System.out.println("Amount to be deposit : ");
        double deposit = scan.nextDouble();

        if (deposit <= 0) {
            System.out.println("Invalid amount");
            depositToSavingBalance();
        }

        calcSavingBalanceDeposit(deposit);
        printSavingBalance();

    }


    public void printCheckBalance() {
        System.out.println("Current checking account balance : " + usdFormat.format(checkingBalance
        ));
    }
    public void printSavingBalance() {
        System.out.println("Current saving account balance : " + usdFormat.format(checkingBalance
        ));
    }
}
