package com.vgdn1942.learn.cave.treasure;

public enum TreasureType {
    COIN("Монета"),
    CUP("Чаша"),
    SCEPTER("Скипетр"),
    SWORD("Меч"),
    ARMOR("Броня"),
    RING("Кольцо"),
    NECKLACE("Ожерелье");

    private String type;

    TreasureType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
