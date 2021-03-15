package com.vgdn1942.learn.cave.treasure;

public class TreasureGold implements Treasure {
    private TreasureType treasureType;
    private String name;
    private double cost;

    public TreasureGold(TreasureType treasureType, String name, int cost) {
        this.treasureType = treasureType;
        this.name = name;
        this.cost = cost * 3;
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
        return "Золотое сокровище {" +
                "тип=" + treasureType.toString() +
                ", имя='" + name + '\'' +
                ", стоимость=" + cost +
                '}';
    }
}
