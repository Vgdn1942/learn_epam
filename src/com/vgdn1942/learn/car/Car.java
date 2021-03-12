package com.vgdn1942.learn.car;

import java.util.Arrays;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String brand;
    private double fuel;
    private double distance;

    public Car(Wheel[] wheels, Engine engine, String brand, double fuel, double distance) {
        this.wheels = wheels;
        this.engine = engine;
        this.brand = brand;
        this.fuel = fuel;
        this.distance = distance;
    }

    public String getBrand() {
        return brand;
    }

    public void move() {
        if (fuel <= 0) {
            System.out.println("Нет бензина");
            return;
        }
        double mileage = fuel / distance;
        System.out.println("Машина проехала " + mileage * 100 + "км.");
        fuel = 0;
    }

    public void refuel(double value) {
        fuel += value;
    }

    public void changeWheel(int num, double diameter) {
        wheels[num] = new Wheel(diameter);
    }

    @Override
    public String toString() {
        return "Машина {" +
                "колёса=" + Arrays.toString(wheels) +
                ", двигатель=" + engine +
                ", марка='" + brand + '\'' +
                ", топливо=" + fuel + "л." +
                ", дистанция=" + distance + "км." +
                '}';
    }
}
