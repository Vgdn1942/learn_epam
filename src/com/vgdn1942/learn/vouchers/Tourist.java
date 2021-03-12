package com.vgdn1942.learn.vouchers;

public class Tourist {
    String name;
    Vouchers vouchers;

    public Tourist(String name) {
        this.name = name;
    }

    public Tourist(String name, Vouchers vouchers) {
        this.name = name;
        this.vouchers = vouchers;
    }

    @Override
    public String toString() {
        return "Турист: '" + name + '\'' +
                ", путёвка: { " + vouchers + " }";
    }
}
