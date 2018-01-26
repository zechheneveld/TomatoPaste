package com.company;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
}

@Override
public void withdraw(double value){
        if (balance < value){
            System.out.println("Checking Account withdraw amount: $" + value);
            balance = (balance - value) - 10;
            System.out.println("Overdraft fee: $10");
            System.out.println("New Checking Account balance: $" + balance);
        } else {
            System.out.println("Total Checking Account Balance: $" + balance);
        }

    }
}
