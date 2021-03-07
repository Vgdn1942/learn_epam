package com.vgdn1942.learn.bankaccount;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Василий");
        BankAccount account1 = new BankAccount(12345);
        BankAccount account2 = new BankAccount(56789);
        BankAccount account3 = new BankAccount(54321);
        BankAccount account4 = new BankAccount(98765);
        BankAccount account5 = new BankAccount(65432);
        BankAccount account6 = new BankAccount(87654);
        BankAccount account7 = new BankAccount(23456);
        BankAccount account8 = new BankAccount(34567);
        person1.addBankAcc(account1);
        person1.addBankAcc(account2);
        person1.addBankAcc(account3);
        person1.addBankAcc(account4);
        person1.addBankAcc(account5);
        person1.addBankAcc(account6);
        person1.addBankAcc(account7);
        person1.addBankAcc(account8);
        person1.printInfo();
        account1.setFreeze(true);
        account3.setFreeze(true);
        account5.setFreeze(true);
        person1.removeBankAcc(account2);
        person1.removeBankAcc(account5);
        account1.setMoney(250.25);
        account4.setMoney(50.25);
        account6.setMoney(-90.00);
        account7.setMoney(-10.5);
        person1.printInfo();
        person1.findByNum(12345);
        person1.sortByAcc();
        person1.printInfo();
        person1.printSumAll();
        person1.printSumPositive();
        person1.printSumNegative();
    }
}
