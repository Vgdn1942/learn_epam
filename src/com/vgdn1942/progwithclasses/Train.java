package com.vgdn1942.progwithclasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class RunTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Train[] train = {
                new Train("Минск", 321, "14:05"),
                new Train("Пинск", 432, "14:15"),
                new Train("Минск", 123, "13:10"),
                new Train("Брест", 789, "12:45"),
                new Train("Брест", 654, "15:15"),
                new Train("Витебск", 456, "23:15")
        };

        System.out.print("Введите номер поезда;" + "\n" + "доступные номера:" + "\n");
        for (Train value : train) {
            System.out.print(value.getNumber() + "; ");
        }
        System.out.println();
        int input = scanner.nextInt();

        // Информация о поезде по номеру
        System.out.println("Информация о поезде под номером " + input + ": ");
        for (Train value : train) {
            if (input == value.getNumber()) {
                System.out.println(value.toString() + "\n");
            }
        }

        System.out.println("Сортировка по пункту назначения и времени:");
        Arrays.sort(train, new CompareToDestAndTime());
        for (Train value : train) {
            System.out.println(value.toString());
        }
    }
}

class CompareToDestAndTime implements Comparator<Train> {
    @Override
    public int compare(Train trainLeft, Train trainRight) {
        if (trainLeft.getDestination().equals(trainRight.getDestination())) {
            return trainLeft.getTime().compareTo(trainRight.getTime());
        }
        return trainLeft.getDestination().compareTo(trainRight.getDestination());
    }
}

public class Train {
    private String destination;
    private int number;
    private String time;

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public String getTime() {
        return time;
    }

    Train(String destination, int number, String time) {
        this.setDestination(destination);
        this.setNumber(number);
        this.setTime(time);
    }

    @Override
    public String toString() {
        return "Пункт назначения: " + this.getDestination() +
                "; номер: " + this.getNumber() +
                "; время отправления: " + this.getTime();
    }
}
