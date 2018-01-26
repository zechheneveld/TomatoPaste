package com.company;

public class BankAccount {

    double balance;
    double newBalance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double value){
        balance += value;
        System.out.println("Depositing $" + balance);

    }

    public void withdraw(double value){
        balance -= value;
        System.out.println("Withdrawing $" + balance);

    }


}
