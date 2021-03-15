package com.vgdn1942.learn.cave;

import com.vgdn1942.learn.cave.treasure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dragon {
    private Treasure treasure;
    private List<Treasure> treasureList;

    public Dragon() {
        treasureList = new ArrayList<>();
        helpGeneratorTreasure();
    }

    public void showTreasure() {
        treasureList.forEach(System.out::println);
    }

    public void greatestTreasure() {
        double tmp = 0;
        for (Treasure treasure : treasureList) {
            if (tmp < treasure.getCost()) {
                tmp = treasure.getCost();
            }
        }
        for (Treasure treasure : treasureList) {
            if (tmp == treasure.getCost()) {
                System.out.println(treasure);
            }
        }
    }

    public void chooseTreasuresAmount(Double sum) {
        List<Treasure> treas = new ArrayList<>();
        treasureList.stream().sorted((x, y) -> (int) y.getCost() - (int) x.getCost());
        for (Treasure tr : treasureList) {
            if (tr.getCost() <= sum) {
                sum -= tr.getCost();
                treas.add(tr);
            }
            if (sum == 0) {
                break;
            }
        }
        treas.forEach(System.out::println);
    }

    private void helpGeneratorTreasure() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = "сокровище № " + i;
            if (i % 2 == 0) {
                treasureList.add(new TreasureCopper(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            } else if (i % 3 == 0) {
                treasureList.add(new TreasureSilver(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            } else {
                treasureList.add(new TreasureGold(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            }
        }
    }

    private <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
