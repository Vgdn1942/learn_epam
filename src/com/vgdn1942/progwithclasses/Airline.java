package com.vgdn1942.progwithclasses;

class AirlineMain {
    public static void main(String[] args) {
        Airline[] airlines = {
                new Airline("Нью-Йорк", "12345", "Чартер",
                        "1528", "Понедельник"),
                new Airline("Москва", "54321", "Чартер",
                        "1936", "Вторник"),
                new Airline("Минск", "98765", "Лоукост",
                        "2005", "Среда"),
                new Airline("Киев", "56789", "Чартер",
                        "0023", "Воскресенье"),
                new Airline("Минск", "12378", "Лоукост",
                        "2004", "Понедельник"),
                new Airline("Москва", "78321", "Лоукост",
                        "2010", "Среда"),
                new Airline("Сочи", "45678", "Лоукост",
                        "2032", "Пятница"),
        };
        InfoAirline infoAirline = new InfoAirline(1);
        for (Airline value : airlines) {
            infoAirline.pushCustomer(value);
        }
        System.out.println("Список рейсов для заданного пункта назначения 'Москва':");
        infoAirline.printByDest("Москва");
        System.out.println("Список рейсов для заданного дня недели 'Среда':");
        infoAirline.printByDay("Среда");
        System.out.println("Список рейсов для заданного дня недели, время вылета для которых больше заданного:");
        System.out.println("'Среда, 2006'");
        infoAirline.printByDayAndTime("Среда", "2006");
    }
}

class InfoAirline {
    private Airline[] airlines;
    private int capacity;
    private int size;

    public InfoAirline(int cap) {
        size = 0;
        capacity = cap;
        airlines = new Airline[capacity];
    }

    public InfoAirline() {
        this(10);
    }

    public void pushCustomer(Airline airline) {
        if (size >= capacity) {
            Airline[] buffer = new Airline[capacity * 2];
            if (size >= 0) System.arraycopy(airlines, 0, buffer, 0, size);

            airlines = buffer;
            capacity = capacity * 2;
        }
        airlines[size] = airline;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            airlines[i].print();
        }
    }

    public void printByDest(String dest) {
        for (int i = 0; i < size; ++i) {
            if (airlines[i].getDest().equals(dest))
                airlines[i].print();
        }
    }

    public void printByDay(String day) {
        for (int i = 0; i < size; ++i) {
            if (airlines[i].getDay().equals(day))
                airlines[i].print();
        }
    }

    public void printByDayAndTime(String day, String time) {
        for (int i = 0; i < size; ++i) {
            if ((airlines[i].getDay().equals(day)) &&
                    (airlines[i].getTime().compareTo(time) >= 0))
                airlines[i].print();
        }
    }
}

public class Airline {
    private int id;
    private static int ID;
    private String dest;
    private String num;
    private String type;
    private String time;
    private String day;

    Airline(String dest, String num, String type,
         String time, String day) {
        this.id = ID++;
        this.dest = dest;
        this.num = num;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline {" +
                " ID: " + id +
                ", Пункт назначения: '" + dest + '\'' +
                ", Номер рейса: '" + num + '\'' +
                ", Тип самолёта: '" + type + '\'' +
                ", Время вылета: '" + time + '\'' +
                ", Дни недели: " + day +
                " }";
    }

    public void print() {
        System.out.println(toString());
    }
}
