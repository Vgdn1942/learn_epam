package com.vgdn1942.learn.gifts.sweet;

public class Candy implements Sweet {
    private final String name = "Конфеты";
    private final double cost = 0.2;
    private final double weight = 0.05;
    private int count;

    public Candy(int count) {
        this.count = count;
    }

    public Candy() {
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost * count;
    }

    public double getWeight() {
        return weight * count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Конфеты{" +
                "имя='" + name + '\'' +
                ", цена=" + getCost() +
                ", вес=" + getWeight() +
                ", итого=" + count +
                '}';
    }
}
