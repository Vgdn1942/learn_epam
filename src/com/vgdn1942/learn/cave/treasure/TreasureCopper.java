package com.vgdn1942.learn.cave.treasure;

public class TreasureCopper implements Treasure {
    private TreasureType treasureType;
    private String name;
    private double cost;

    public TreasureCopper(TreasureType treasureType, String name, int cost) {
        this.treasureType = treasureType;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public TreasureType getTreasureType() {
        return treasureType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Медное сокровище {" +
                "тип=" + treasureType.toString() +
                ", имя='" + name + '\'' +
                ", стоимость=" + cost +
                '}';
    }
}
