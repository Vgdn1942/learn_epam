package com.vgdn1942.learn.gifts.box;

import com.vgdn1942.learn.gifts.sweet.Sweet;

import java.util.List;

public class BoxSmall extends Box {
    private final double maxWeight = 3;
    private final double cost = 1;
    private final String type = "Маленькая";

    public BoxSmall(List<Sweet> sweets) {
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
