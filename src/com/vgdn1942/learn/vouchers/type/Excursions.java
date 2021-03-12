package com.vgdn1942.learn.vouchers.type;

import com.vgdn1942.learn.vouchers.Vouchers;

public class Excursions extends Vouchers {
    String excursions;

    public Excursions(String transport, Food food, Integer day, String excursions) {
        super(transport, food, day);
        this.excursions = excursions;
    }

    @Override
    public String toString() {
        return "тип: 'Экскурсия'" +
                ", " + super.toString() +
                " экскурсия в: '" + excursions + '\'';
    }
}
