package com.vgdn1942.learn.bankaccount;

public class BankAccount implements Comparable<BankAccount> {
    private Integer number;
    private Double money;
    private boolean freeze = false;

    public BankAccount(int number) {
        this.number = number;
        this.money = 0.0d;
    }

    public BankAccount(int number, double money) {
        this.number = number;
        this.money = money;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isFreeze() {
        return freeze;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

    @Override
    public int compareTo(BankAccount account) {
        int result = this.number.compareTo(account.number);
        if (result == 0) {
            result = this.money.compareTo(account.money);
        }
        return result;
    }
}
