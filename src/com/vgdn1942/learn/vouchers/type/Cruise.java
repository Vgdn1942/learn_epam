package com.vgdn1942.learn.vouchers.type;

import com.vgdn1942.learn.vouchers.Vouchers;

public class Cruise extends Vouchers {
    String cruise;

    public Cruise(String transport, Food food, Integer day, String cruise) {
        super(transport, food, day);
        this.cruise = cruise;
    }

    @Override
    public String toString() {
        return "тип: 'Круиз'" +
                ", " + super.toString() +
                " круиз на: '" + cruise + '\'';
    }
}
