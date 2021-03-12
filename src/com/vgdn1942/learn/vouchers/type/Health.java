package com.vgdn1942.learn.vouchers.type;

import com.vgdn1942.learn.vouchers.Vouchers;

public class Health extends Vouchers {
    String health;

    public Health(String transport, Food food, Integer day, String health) {
        super(transport, food, day);
        this.health = health;
    }

    @Override
    public String toString() {
        return "тип: 'Лечение'" +
                ", " + super.toString() +
                " вид лечения: '" + health + '\'';
    }
}
