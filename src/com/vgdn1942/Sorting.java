package com.vgdn1942;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arrayA = {23, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 12, -1, 14, 15, 16, 21, 18, 19, 11, 17};

        OneF one = new OneF();
        one.methodOne();

        TwoF two = new TwoF();
        two.methodTwo(arrayA);

        ThreeF three = new ThreeF();
        three.methodThree(arrayA);

        FourF four = new FourF();
        four.methodFour(arrayA);

        FiveF five = new FiveF();
        five.methodFive(arrayA);
    }
}

class OneF {
    //    1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    //    Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
    //    при этом не используя дополнительный массив.
    void methodOne() {
        int k = 5;
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] second = {22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] joint = new int[first.length + second.length];
        int i = 0;
        while (i < k) {
            joint[i] = first[i];
            i++;
        }
        for (int j : second) {
            joint[i] = j;
            i++;
        }
        for (int j = k; j < first.length; j++) {
            joint[i] = first[j];
            i++;
        }
        System.out.println("Первый массив = " + Arrays.toString(first));
        System.out.println("Второй массив = " + Arrays.toString(first));
        System.out.println("Объединённый массив = " + Arrays.toString(joint));
    }
}

class TwoF {
    // Сортировка выбором
    void methodTwo(int[] array) {
        System.out.println("Начальный массив = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }
}

class ThreeF {
    // Сортировка обменами (пузырьком)
    void methodThree(int[] array) {
        System.out.println("Начальный массив = " + Arrays.toString(array));
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }
}

class FourF {
    // Сортировка вставками
    void methodFour(int[] array) {
        System.out.println("Начальный массив = " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }
}

class FiveF {
    // Сортировка Шелла
    void methodFive(int[] array) {
        System.out.println("Начальный массив = " + Arrays.toString(array));
        int temp;
        int h = 0;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }
        for (int k = h; k > 0; k = (k - 1) / 3) {
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp < array[j - k]) {
                        array[j] = array[j - k];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }
}