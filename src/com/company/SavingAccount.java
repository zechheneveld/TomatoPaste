package com.company;

public class SavingAccount extends BankAccount {

    public SavingAccount(double balance) {
        super(balance);
    }

    public void compound(){
        newBalance = balance + (balance * .06);
        System.out.println("New Savings Account Balance with interest: $" + newBalance);
    }



    @Override
    public void withdraw(double value){
        System.out.println("Savings Account withdraw amount: $" + value);
        if (newBalance < value){
            System.out.println("Error. Cannot withdraw more then what is your Savings account");
        }

    }


}
