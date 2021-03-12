package com.vgdn1942;

import java.util.Arrays;

public class StringAsAnArray {
    public static void main(String[] args) {
        String[] someCase = new String[]{"someString", "camelCase", "snakeCase"};
        String someString = "Some word, hello word, first word, any word";
        String numString = " I have 22 bananas,   121     pencils,   12 bowls   and 32  apples ";

        OneH one = new OneH();
        one.methodOne(someCase);

        TwoH two = new TwoH();
        two.methodTwo(someString);

        ThreeH three = new ThreeH();
        three.methodThree(numString);

        FourH four = new FourH();
        four.methodFour(numString);

        FiveH five = new FiveH();
        five.methodFive(numString);
    }
}

class OneH {
    void methodOne(String[] str) {
        System.out.println("Массив ДО изменений = " + Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            String[] buf = str[i].split("(?=[A-Z])");
            str[i] = buf[0].toLowerCase() + "_" + buf[1].toLowerCase();
        }
        System.out.println("Массив ПОСЛЕ изменений = " + Arrays.toString(str));
    }
}

class TwoH {
    void methodTwo(String str) {
        System.out.println("Строка ДО изменений = " + str);
        str = str.replaceAll("word", "letter");
        System.out.println("Строка ПОСЛЕ изменений = " + str);
    }
}

class ThreeH {
    void methodThree(String str) {
        System.out.println("Строка = " + str);
        str = str.replaceAll("[^0-9]+", "");
        System.out.println("Цифры в строке = " + str);
        int count = str.length();
        System.out.println("Количество цифр в строке = " + count);
    }
}

class FourH {
    void methodFour(String str) {
        System.out.println("Строка = " + str);
        str = str.replaceAll("[^0-9]+", " ");
        System.out.println("Числа в строке = " + str);
        int count = str.trim().split(" ").length;
        System.out.println("Количество чисел в строке = " + count);
    }
}

class FiveH {
    void methodFive(String str) {
        System.out.println("Строка ДО изменений = " + str);
        str = str.replaceAll(" {2,}", " ");
        str = str.trim();
        System.out.println("Строка ПОСЛЕ изменений = " + str);
    }
}