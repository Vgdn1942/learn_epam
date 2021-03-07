package com.vgdn1942.learn.vouchers;

public class Main {
    public static void main(String[] args) {
//        Vouchers shopping = new Shopping("Автобус", Shopping.Food.QUADRUPLE, 14, "Евроопт");
//        Tourist tourist0 = new Tourist("Василий", shopping);
        Tours tours = new Tours();
        tours.printAvailableTours();
        tours.sortByTransport("Поезд");
        tours.sortByFood(Vouchers.Food.FIVE_TIMES);
        tours.sortByDay(5, true);
        tours.sortByDay(6, false);
        Tourist tourist1 = new Tourist("Василий", tours.vouchers[2]);
        Tourist tourist2 = new Tourist("Виктория", tours.vouchers[5]);
        System.out.println(tourist1.toString());
        System.out.println(tourist2.toString());
    }
}
