package com.vgdn1942.learn.car;

public class Wheel {
    private int id;
    private static int ID;
    private double diameter;

    public Wheel() {
        this.id = ID++;
        this.diameter = 16.0;
    }

    public Wheel(double diameter) {
        this.id = ID++;
        this.diameter = diameter;
    }

    public double getId() {
        return id;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Колесо " + id +
                " {" +
                "диаметр=" + diameter +
                '}';
    }
}
