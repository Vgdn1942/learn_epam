package com.vgdn1942.learn.gifts.sweet;

public class Cake implements Sweet {
    private final String name = "Печенье";
    private final double cost = 7;
    private final double weight = 0.9;
    private int count;

    public Cake(int count) {
        this.count = count;
    }

    public Cake() {
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
        return "Печенье{" +
                "имя='" + name + '\'' +
                ", цена=" + getCost() +
                ", вес=" + getWeight() +
                ", итого=" + count +
                '}';
    }
}
