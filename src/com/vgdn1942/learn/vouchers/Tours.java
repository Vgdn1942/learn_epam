package com.vgdn1942.learn.vouchers;

import com.vgdn1942.learn.vouchers.type.*;

public class Tours {
    Vouchers[] vouchers = {
            new Shopping("Автобус", Shopping.Food.QUADRUPLE, 5, "Евроопт"),
            new Shopping("Поезд", Shopping.Food.FIVE_TIMES, 14, "Пятёрочка"),
            new Relaxation("Самолёт", Shopping.Food.THREE_TIMES, 7, "Сауна"),
            new Relaxation("Самолёт", Shopping.Food.QUADRUPLE, 3, "Баня"),
            new Cruise("Поезд", Shopping.Food.TWICE, 10, "Теплоход"),
            new Cruise("Поезд", Shopping.Food.SIX_TIMES, 7, "Остров"),
            new Excursions("Автобус", Shopping.Food.FIVE_TIMES, 10, "Эйфелева башня"),
            new Excursions("Автобус", Shopping.Food.QUADRUPLE, 21, "Троицкое предместье"),
            new Health("Самолёт", Shopping.Food.THREE_TIMES, 18, "Массаж"),
            new Health("Самолёт", Shopping.Food.FIVE_TIMES, 5, "Водные процедуры")
    };

    public void sortByTransport(String transport) {
        System.out.println("Сортировка по виду транспорта '" + transport + "':");
        for (Vouchers value : vouchers) {
            if (value.getTransport().equals(transport)) {
                System.out.println(value.toString());
            }
        }
    }

    public void sortByFood(Vouchers.Food food) {
        System.out.println("Сортировка по питанию '" + food.toString() + "':");
        for (Vouchers value : vouchers) {
            if (value.getFood().equals(food)) {
                System.out.println(value.toString());
            }
        }
    }

    public void sortByDay(int day, boolean dec) {
        if (dec) {
            System.out.println("Сортировка по количеству дней не менее '" + day + "':");
            for (Vouchers value : vouchers) {
                if (value.getDay() >= day) {
                    System.out.println(value.toString());
                }
            }
        } else {
            System.out.println("Сортировка по количеству дней не более '" + day + "':");
            for (Vouchers value : vouchers) {
                if (value.getDay() <= day) {
                    System.out.println(value.toString());
                }
            }
        }
    }

    public void printAvailableTours() {
        for (int i = 0; i < vouchers.length; i++) {
            System.out.print("Номер пункта " + i + " ");
            System.out.println(vouchers[i]);
        }
    }
}
