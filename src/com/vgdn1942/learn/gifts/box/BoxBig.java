package com.vgdn1942.learn.gifts.box;

import com.vgdn1942.learn.gifts.sweet.Sweet;

import java.util.List;

public class BoxBig extends Box {
    private final double maxWeight = 20;
    private final double cost = 5;
    private final String type = "Большая";

    public BoxBig(List<Sweet> sweets) {
        super(sweets);
    }

    public String getTypeBox() {
        return type;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCost() {
        return cost;
    }
}
