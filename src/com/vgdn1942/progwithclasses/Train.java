package com.vgdn1942.progwithclasses;

import java.util.Arrays;

class RunTrain {
    public static void main(String[] args) {
        int input = 789;

        Train[] train = {
                new Train("Минск", 321, 1405),
                new Train("Брест", 123, 1310),
                new Train("Могилёв", 789, 1245),
                new Train("Гомель", 654, 1515),
                new Train("Витебск", 456, 2315)
        };

        // Информация о поезде по номеру
        System.out.println("Информация о поезде по введённому номеру " + input + ": ");
        for (Train value : train) {
            if (input == value.getNumber()) {
                System.out.println(value.toString() + "\n");
            }
        }

        // Сортировка по номеру поезда
        System.out.println("Список поездов отсортированный по номерам:");
        int[] array = new int[train.length];
        for (int i = 0; i < train.length; i++) {
            array[i] = train[i].getNumber();
        }
        String[] strArray = new String[train.length];
        for (int i = 0; i < train.length; i++) {
            strArray[i] = train[i].getDestination();
        }
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i] == strArray[j]) {
                    System.out.println(j);
                }
            }
        }

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int k : array) {
            for (Train value : train) {
                if (k == value.getNumber()) {
                    System.out.println(value.toString());
                }
            }
        }
    }
}

// 4. Создайте класс Train, содержащий поля:
// название пункта назначения,
// номер поезда,
// время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде,
// номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

public class Train {
    private String destination;
    private int number;
    private long time;

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public long getTime() {
        return time;
    }

    Train(String destination, int number, long time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Пункт назначения: " + this.getDestination() +
                "; номер: " + this.getNumber() +
                "; время отправления (ччмм): " + this.getTime();
    }
}
