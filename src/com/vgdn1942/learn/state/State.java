package com.vgdn1942.learn.state;

import java.util.ArrayList;
import java.util.List;

// Государство
public class State {
    private String name;
    private City capital;
    private String square;

    private List<Province> provinces = new ArrayList<>();
    private List<District> districts = new ArrayList<>();
    private List<City> cities = new ArrayList<>();

    public State(String name) {
        this.name = name;
    }

    public void addProvince(Province province) {
        provinces.add(province);
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public String getName() {
        return name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public List<City> getCities() {
        return cities;
    }

    public void printCities() {
        for (City city : cities) {
            System.out.print(city.getName() + "; ");
        }
        System.out.println();
    }

    public void printCapital() {
        System.out.println(capital.getName());
    }

    public void printProvinceNum() {
        System.out.println(provinces.size());
    }
}
