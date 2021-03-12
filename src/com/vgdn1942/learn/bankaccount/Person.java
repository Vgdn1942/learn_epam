package com.vgdn1942.learn.bankaccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void addBankAcc(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void removeBankAcc(BankAccount bankAccount) {
        bankAccounts.remove(bankAccount);
    }

    public void findByNum(int num) {
        for (BankAccount acc : bankAccounts) {
            if (num == acc.getNumber()) {
                System.out.print("Информация о номере счёта: " + acc.getNumber() + ", ");
                System.out.print("Сумма: " + acc.getMoney() + "; ");
                System.out.println("Блокирован: " + (acc.isFreeze() ? "Да" : "Нет"));
            }
        }
    }

    public void sortByAcc() {
        Collections.sort(bankAccounts);
    }

    public void printInfo() {
        System.out.println("Количество счетов: " + bankAccounts.size());
        System.out.println("Счета: ");
        for (BankAccount acc : bankAccounts) {
            System.out.print("Номер счёта: " + acc.getNumber() + ", ");
            System.out.print("Сумма на счету: " + acc.getMoney() + "; ");
            System.out.println("Блокирован: " + (acc.isFreeze() ? "Да" : "Нет"));
        }
        System.out.println();
    }

    public void printSumAll() {
        Double sum = 0.0;
        for (BankAccount acc : bankAccounts) {
            sum += acc.getMoney();
        }
        System.out.println("Общий баланс на всех счетах: " + sum);
    }

    public void printSumPositive() {
        Double sum = 0.0;
        for (BankAccount acc : bankAccounts) {
            if (acc.getMoney() > 0) {
                sum += acc.getMoney();
            }
        }
        System.out.println("Общий положительный баланс на всех счетах: " + sum);
    }

    public void printSumNegative() {
        Double sum = 0.0;
        for (BankAccount acc : bankAccounts) {
            if (acc.getMoney() < 0) {
                sum += acc.getMoney();
            }
        }
        System.out.println("Общий отрицательный баланс на всех счетах: " + sum);
    }
}
