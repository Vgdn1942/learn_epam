package com.vgdn1942.learn.vouchers.type;

import com.vgdn1942.learn.vouchers.Vouchers;

public class Shopping extends Vouchers {
    String shopping;

    public Shopping(String transport, Food food, Integer day, String shopping) {
        super(transport, food, day);
        this.shopping = shopping;
    }

    @Override
    public String toString() {
        return "тип: 'Шопинг'" +
                ", " + super.toString() +
                " шопинг в: '" + shopping + '\'';
    }
}
