package com.vgdn1942.learn.cave;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        int number;
        do {
            System.out.println(
                    "1 - Список сокровищ \n" +
                            "2 - Поиск самого дорогого сокровища \n" +
                            "3 - Поиск сокровищ на выбранную сумму \n" +
                            "0 - Выход");
            number = ConsoleHelper.readInt();
            switch (number) {
                case (0):
                    System.out.println("Выход");
                    break;
                case (1):
                    dragon.showTreasure();
                    break;
                case (2):
                    dragon.greatestTreasure();
                    break;
                case (3):
                    System.out.println("Введите сумму: ");
                    double sum = ConsoleHelper.readDouble();
                    dragon.chooseTreasuresAmount(sum);
                    break;
                default:
                    System.out.println("Неверное значение");
                    break;
            }
        } while (number != 0);
    }
}