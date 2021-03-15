package com.vgdn1942.learn.gifts.box;

import com.vgdn1942.learn.gifts.sweet.Sweet;

import java.util.List;

public class BoxMiddle extends Box {
    private final double maxWeight = 10;
    private final double cost = 3;
    private final String type = "Средняя";

    public BoxMiddle(List<Sweet> sweets) {
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
