package com.vgdn1942.learn.state;

public class Main {
    public static void main(String[] args) {
        State belarus = new State("Беларусь");
        City minsk = new City("Минск");

        belarus.addProvince(new Province("Минская"));
        belarus.addProvince(new Province("Брестская"));
        belarus.addProvince(new Province("Витебская"));
        belarus.addProvince(new Province("Гомельская"));
        belarus.addProvince(new Province("Гродненская"));
        belarus.addProvince(new Province("Могилёвская"));
        belarus.addProvince(new Province("Щучынщына"));

        belarus.addDistrict(new District("Минский"));
        belarus.addDistrict(new District("Брестский"));
        belarus.addDistrict(new District("Витебский"));
        belarus.addDistrict(new District("Гомельский"));
        belarus.addDistrict(new District("Гродненский"));
        belarus.addDistrict(new District("Могилёвский"));

        belarus.addCity(minsk);
        belarus.addCity(new City("Брест"));
        belarus.addCity(new City("Витебск"));
        belarus.addCity(new City("Гомель"));
        belarus.addCity(new City("Гродно"));
        belarus.addCity(new City("Могилёв"));
        belarus.addCity(new City("Шклов"));

        belarus.setCapital(minsk);
        belarus.setSquare("Перамен");

        //Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
        System.out.println("Государство: " + belarus.getName());
        System.out.print("Столица: ");
        belarus.printCapital();
        System.out.print("Количество областей: ");
        belarus.printProvinceNum();
        System.out.println("Площадь: " + belarus.getSquare());
        System.out.print("Областные центры: ");
        belarus.printCities();
    }
}
