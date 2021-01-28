package com.vgdn1942;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        OneC one = new OneC();
        one.methodOne();

        TwoC two = new TwoC();
        two.methodTwo(4, 10, 2);

        ThreeC three = new ThreeC();
        three.methodThree();

        FourC four = new FourC();
        four.methodFour();

        FiveC five = new FiveC();
        five.methodFive();

        SixC six = new SixC();
        six.methodSix();

        SevenC seven = new SevenC();
        seven.methodSeven(12345, 671238);
    }
}

class OneC {
    void methodOne() {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

class TwoC {
    void methodTwo(int a, int b, double h) {
        double y;
        double x;
        for (x = a; x <= b; x += h) {
            System.out.print("x = " + x + ", ");
            if (x <= 2) {
                y = (-x);
            } else {
                y = x;
            }
            System.out.println("y = " + y);
        }
    }
}

class ThreeC {
    void methodThree() {
        int n = 100, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых ста чисел = " + sum);
    }
}

class FourC {
    void methodFour() {
        int n = 200, sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= Math.pow(i, 2);
        }
        System.out.println("Произведение квадратов первых двухсот чисел = " + sum);
    }
}

class FiveC {
    void methodFive() {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char)i);
        }
        for (int i = 161; i <= 255; i++) {
            System.out.println(i + " " + (char)i);
        }
    }
}

class SixC {
    void methodSix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int m = sc.nextInt();
        System.out.print("Введите второе число: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) { // Получаем текущее число из интервала
            boolean is_prime = true;
            for (int k = 2; k < i; k++) { // Получаем делитель от 2 до текущего числа интервала
                if (i % k == 0) {
                    is_prime = false;
                    System.out.println("Делители для числа " + i + " = " + k);
                }
            }
            if (is_prime) {
                System.out.println("Число " + i + " простое");
            }
        }
    }
}

class SevenC {
    void methodSeven(int a, int b) {
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        int i = 0;
        while(a > 0) {
            arrA.add(i,a % 10);
            a = a / 10;
            System.out.println(arrA.get(i));
            i++;
        }
        i = 0;
        while(b > 0) {
            if (arrA.contains(b % 10)) {
                System.out.println("Число " + b % 10 + " совпадает");
            }
            b = b / 10;
            i++;
        }
    }
}