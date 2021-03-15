package com.vgdn1942.learn.gifts;

import com.vgdn1942.learn.gifts.box.*;
import com.vgdn1942.learn.gifts.sweet.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Box box;
    private static List<Sweet> sweetnessList = new ArrayList<>();

    public static void main(String[] args) {
        choosingGifts("Печенье, шоколад и конфеты");
        box = choosingBox(sweetnessList);
        box.showInfoGift();
    }

    private static void choosingGifts(String str) {
        if (str.toLowerCase().contains("печенье")) {
            sweetnessList.add(new Cake(1));
        }
        if (str.toLowerCase().contains("шоколад")) {
            sweetnessList.add(new Chocolate());
        }
        if (str.toLowerCase().contains("конфеты")) {
            sweetnessList.add(new Cake(10));
        }
    }

    private static Box choosingBox(List<Sweet> swt) {
        double weight = 0;
        for (Sweet sw : swt) {
            weight += sw.getWeight();
        }
        if (weight <= 3) {
            return new BoxSmall(swt);
        } else if (weight <= 10) {
            return new BoxMiddle(swt);
        } else {
            return new BoxBig(swt);
        }
    }
}
