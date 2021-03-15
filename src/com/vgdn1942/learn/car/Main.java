package com.vgdn1942.learn.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Wheel[4], new Engine(400), "БНВ", 300, 100);
        for (int i = 0; i < 4; i++) {
            car.changeWheel(i, 16.5);
        }
        car.move();
        car.refuel(250);
        car.changeWheel(1, 16.5);
        System.out.println("Марка машины: " + car.getBrand());
        System.out.println(car.toString());
    }
}
