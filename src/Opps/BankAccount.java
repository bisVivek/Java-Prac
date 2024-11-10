package Opps;

import java.util.Scanner;

public class BankAccount {

    private String accountHolderName;
    private double balance;

    // Constructor to initialize account holder's name and initial balance
    public BankAccount(String accountHolderName, double initialBalance){
        this.accountHolderName=accountHolderName;

        if(initialBalance>0){
            this.balance=initialBalance;
        }else {
            this.balance=0.0;
        }
    }

    // Getter to get value og accountHolderName and balance
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: $"+ amount);
        }else {
            System.out.println("Deposited amount must be positive");
        }
    }

    // Method to Withdraw money
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw $"+amount);
        }else if(amount > balance){
            System.out.println("Insufficient Fund :(");
        }else {
            System.out.println("Withdraw amount must be positive");
        }
    }
}
