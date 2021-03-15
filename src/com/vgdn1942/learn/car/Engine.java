package com.vgdn1942.learn.car;

public class Engine {
    private int power;

    public Engine() {
        this.power = 250;
    }

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Двигатель {" +
                "мощность=" + power +
                '}';
    }
}
