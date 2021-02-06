package com.vgdn1942;

public class ArraysOfArrays {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

//        OneE one = new OneE();
//        one.methodOne(A);

//        TwoE two = new TwoE();
//        two.methodTwo(A);

//        ThreeE three = new ThreeE();
//        three.methodThree(matrixA, 0, 2); // what: 0 - столбец; 1 - строка

//        FourE four = new FourE();
//        four.methodFour(6);

//        FiveE five = new FiveE();
//        five.methodFive(6);

//        SixE six = new SixE();
//        six.methodSix(10);

//        SevenE seven = new SevenE();
//        seven.methodSeven(8);

//        EightE eight = new EightE();
//        eight.methodEight(8);
    }
}

class OneE {
    //  1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    void methodOne(int[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 1; j < matrixA.length; j += 2) {
                if (matrixA[0][j] > matrixA[matrixA.length - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

class TwoE {
    void methodTwo(int[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            System.out.print(matrixA[i][i] + "\t");
        }
        System.out.println();
    }
}

class ThreeE {
    // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    void methodThree(int[][] matrixA, int what, int num) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (what == 0 && j == num) { // столбец
                    System.out.print(matrixA[i][j] + "\t");  // выводим строку
                } else if (what == 1 && i == num) { // строка
                    System.out.print(matrixA[i][j] + "\t");  // выводим строку
                }
            }
            if (what != 1)
            System.out.println();  // перенос на столбец
        }
    }
}

class FourE {
    void methodFour(int n) {
        int[][] matrixA;
        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    matrixA[j][i] = i + 1;
                } else {
                    matrixA[j][i] = n - i;
                }
            }
        }
        // Печать получившейся матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class FiveE {
    void methodFive(int n) {
        int[][] matrixA;
        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matrixA[i][j] = i + 1;
            }
        }
        // Печать получившейся матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class SixE {
    void methodSix(int n) {
        int[][] matrixA;
        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i <= j) && (i + j <= n - 1)) || ((i >= j) && (i + j >= n - 1))) {
                    matrixA[i][j] = 1;
                } else {
                    matrixA[i][j] = 0;
                }
            }
        }
        // Печать получившейся матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class SevenE {
    void methodSeven(int n) {
        int k = 0;
        double[][] matrixA;
        matrixA = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = Math.sin(j * j - j * j / n);
                if (matrixA[i][j] > 0 ) {
                    k++;
                }
            }
        }
        // Печать получившейся матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Положительных элементов = " + k);
    }
}

class EightE {

}