package com.vgdn1942.learn.vouchers;

public class Vouchers {
    private String transport;
    private Food food;
    private Integer day;

    protected enum Food {
        TWICE("Двухразовое"),
        THREE_TIMES("Трёхразовое"),
        QUADRUPLE("Четырёхразовое"),
        FIVE_TIMES("Пятиразовое"),
        SIX_TIMES("Шестиразовое");

        private String food;

        Food(String food) {
            this.food = food;
        }

        @Override
        public String toString() {
            return this.food;
        }
    }

    public Vouchers(String transport, Food food, Integer day) {
        this.transport = transport;
        this.food = food;
        this.day = day;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "транспорт: '" + transport + '\'' +
                ", питание: '" + food.toString() + '\'' +
                ", число дней: '" + day + '\'' +
                ",";
    }
}
