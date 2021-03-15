package com.vgdn1942.learn.vouchers.type;

import com.vgdn1942.learn.vouchers.Vouchers;

public class Relaxation extends Vouchers {
    String relaxation;

    public Relaxation(String transport, Food food, Integer day, String relaxation) {
        super(transport, food, day);
        this.relaxation = relaxation;
    }

    @Override
    public String toString() {
        return "тип: 'Отдых'" +
                ", " + super.toString() +
                " отдых в: '" + relaxation + '\'';
    }
}
