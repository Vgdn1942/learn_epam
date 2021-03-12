package com.vgdn1942.learn.gifts.sweet;

public class Chocolate implements Sweet {
    private final String name = "Шоколад";
    private final double cost = 1.8;
    private final double weight = 0.1;
    private int count;

    public Chocolate(int count) {
        this.count = count;
    }

    public Chocolate() {
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
        return "Шоколад{" +
                "имя='" + name + '\'' +
                ", цена=" + getCost() +
                ", вес=" + getWeight() +
                ", итого=" + count +
                '}';
    }
}
