package com.company;

public class Main {

    public static void main(String[] args) {

        SavingAccount zechSaveAcc = new SavingAccount(0);
        CheckingAccount zechCheckAcc = new CheckingAccount(0);

        zechCheckAcc.deposit(500);
        zechSaveAcc.deposit(500);

        zechSaveAcc.compound();

        zechCheckAcc.withdraw(550);
        zechSaveAcc.withdraw(550);


    }
}
