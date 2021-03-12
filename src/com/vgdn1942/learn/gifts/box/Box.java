package com.vgdn1942.learn.gifts.box;

import com.vgdn1942.learn.gifts.sweet.Sweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Box {
    private List<Sweet> SweetList = new ArrayList<>();

    public Box(Sweet Sweet) {
        SweetList.add(Sweet);
    }

    public Box(List<Sweet> Sweet) {
        SweetList.addAll(Sweet);
    }

    public abstract double getMaxWeight();

    public abstract double getCost();

    public abstract String getTypeBox();

    public void showInfoGift() {
        double cost = 0;
        double weight = 0;
        for (Sweet sw : SweetList) {
            cost += sw.getCost();
            weight += sw.getWeight();
        }
        System.out.println("Общий вес подарка: " + weight + "\n" +
                "Общая стоимость: " + cost +
                ", плюс цена " + getTypeBox() + " коробка: " + getCost()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(SweetList, box.SweetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SweetList);
    }
}
