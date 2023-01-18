package practiceJava.ATMproject;

import java.util.Scanner;

public class Account {
    private int accountID;
    private int password;

    private double checkingBalance;
    private double savingBalance;

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

    private double calcCheckBalanceWithdraw(double amount){
        return checkingBalance -= amount;
    }

    private double calcCheckBalanceDeposit(double amount){
        return checkingBalance += amount;
    }

    private double calcSavingBalanceWithdraw(double amount){
        return savingBalance -= amount;
    }

    private double calcSavingBalanceDeposit(double amount){
        return savingBalance += amount;
    }
}
