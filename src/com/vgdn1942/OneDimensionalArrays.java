package com.vgdn1942;

import java.util.ArrayList;
import java.util.Arrays;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] B = {1, 2, 3, 4, 5, -6, -7, -8, -9, -10, -11, 12, 13, 0, 15, 0, 17, 18, 0, 20, 0};
        int[] C = {23, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, 14, 15, 16, 17, 18, 19, 20, 21};
        int K = 4;
        int Z = 6;

        OneD one = new OneD();
        one.methodOne(A, K);

        TwoD two = new TwoD();
        two.methodTwo(A, Z);

        ThreeD three = new ThreeD();
        three.methodThree(B);

        FourD four = new FourD();
        four.methodFour(C);

        FiveD five = new FiveD();
        five.methodFive(B);

        SixD six = new SixD();
        six.methodSix(A);

        SevenD seven = new SevenD();
        seven.methodSeven(A);

        EightD eight = new EightD();
        eight.methodEight(B);

        NineD nine = new NineD();
        nine.methodNine(B);

        TenD ten = new TenD();
        ten.methodTen(A);
    }
}

class OneD {
    // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    void methodOne(int[] A, int K) {
        int res = 0;
        for (int j : A) { // Обходим массив
            if (j % K == 0) {
                System.out.println("Число  " + j + " кратно " + K);
                res = res + j;
            }
        }
        System.out.println("Сумма кратных элементов = " + res);
    }
}

class TwoD {
    // 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    //        Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
    void methodTwo(int[] A, int Z) {
        int res = 0;
        for (int i = 0; i < A.length; i++) { // Обходим массив
            if (A[i] > Z) {
                A[i] = Z;
                res++;
            }
        }
        System.out.println("Массив A = " + Arrays.toString(A));
        System.out.println("Количество замен = " + res);
    }
}


class ThreeD {
    //3. Дан массив действительных чисел, размерность которого N.
    //        Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

    void methodThree(int[] A) {
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int j : A) { // Обходим массив
            if (j == 0)
                zero++;
            if (j > 0)
                positive++;
            if (j < 0)
                negative++;
        }
        System.out.println("Отрицат. эл. = " + negative +
                ", Нулевых. эл. = " + zero + ", Положит. эл. = " + positive);
    }
}

class FourD {
    //    4. Даны действительные числа а1 ,а2 ,..., аn .
    //        Поменять местами наибольший и наименьший элементы.
    void methodFour(int[] A) {
        int max = A[0];
        int min = A[0];
        int max_var = 0;
        int min_var = 0;
        int temp = 0;
        for (int i = 0; i < A.length; i++) { // Обходим массив
            if (A[i] > max) {
                max = A[i];
                max_var = i;
            }
            if (A[i] < min) {
                min = A[i];
                min_var = i;
            }
        }
        temp = A[max_var];
        A[max_var] = A[min_var];
        A[min_var] = temp;
        System.out.println("MAX = " + max + ", MIN = " + min);
        System.out.println("Массив A = " + Arrays.toString(A));
    }
}

class FiveD {
    //5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    void methodFive(int[] A) {
        for (int i = 0; i < A.length; i++) { // Обходим массив
            if (A[i] > i) {
                System.out.println("Числа для которых а[i] > i = " + A[i] +
                        ", где i = " + i);
            }
        }
    }
}

class SixD {
    //6. Задана последовательность N вещественных чисел.
    // Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    void methodSix(int[] A) {
        int res = 0;
        for (int i = 1; i < A.length; i++) { // Обходим массив с первого номера
            boolean is_prime = true;
            for (int k = 2; k < i; k++) { // Получаем делитель от 2 до текущего номера
                if (i % k == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                System.out.println("Число " + i + " простое");
                res = res + A[i];
            }
        }
        System.out.println("Сумма чисел = " + res);
    }
}

class SevenD {
    void methodSeven(int[] A) {
        for (int i = 0; i < A.length; i++) { // Обходим массив
        }
    }
}

class EightD {
//    8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
//    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
    void methodEight(int[] A) {
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) { // Обходим массив
            int min = Math.min(A[i], A[i+1]);
            if (min == A[i]) {
                arrA.add(A[i+1]);
            } else {
                arrA.add(A[i]);
            }
            System.out.println(Math.min(A[i], A[i+1]));
        }
        System.out.println("Новый массив arrA = " + arrA.toString());
    }
}

class NineD {
//    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//    Если таких чисел несколько, то определить наименьшее из них.
    void methodNine(int[] A) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int curCount = 1;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    curCount++;
                }
            }
            if (curCount > count) {
                count = curCount;
                res = A[i];
            } else if (curCount == count) {
                res = Math.min(res, A[i]);
            }
        }
        System.out.println(res);
    }
}

class TenD {
    //10. Дан целочисленный массив с количеством элементов п.
    //Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
    void methodTen(int[] A) {
        int count = 2;
        for (int i = 1; i < A.length; i++) {
            if (count >= A.length) {
                A[i] = 0;
            } else {
                A[i] = A[count];
                count = count + 2;
                System.out.println(count + " to " + i);
            }
        }
        System.out.println("Array A" + Arrays.toString(A));
    }
}