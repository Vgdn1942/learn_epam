package com.vgdn1942;

import java.util.Scanner;

public class ArraysOfArrays {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        OneE one = new OneE();
        one.methodOne(matrixA);

        TwoE two = new TwoE();
        two.methodTwo(matrixA);

        ThreeE three = new ThreeE();
        three.methodThree(matrixA, 0, 2); // what: 0 - столбец; 1 - строка

        FourE four = new FourE();
        four.methodFour(6);

        FiveE five = new FiveE();
        five.methodFive(6);

        SixE six = new SixE();
        six.methodSix(10);

        SevenE seven = new SevenE();
        seven.methodSeven(8);

        EightE eight = new EightE();
        eight.methodEight(matrixA);

        NineE nine = new NineE();
        nine.methodNine(matrixA);

        TenE ten = new TenE();
        ten.methodTen();

        ElevenE eleven = new ElevenE();
        eleven.methodEleven();

        TwelveE twelve = new TwelveE();
        twelve.methodTwelve();

        ThirteenE thirteen = new ThirteenE();
        thirteen.methodThirteen();

        FourteenE fourteen = new FourteenE();
        fourteen.methodFourteen();

        FifteenE fifteen = new FifteenE();
        fifteen.methodFifteen();

        SixteenE sixteen = new SixteenE();
        sixteen.methodSixteen();
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
    void methodEight(int[][] matrixA) {
        // Печать исходной матрицы
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Какие столбцы поменять местами (счёт с 1): ");
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int buff;
        for (int i = 0; i < matrixA.length; i++) {
            buff = matrixA[i][a];
            matrixA[i][a] = matrixA[i][b];
            matrixA[i][b] = buff;
        }
        // Печать получившейся матрицы
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class NineE {
    void methodNine(int[][] matrixA) {
        int sum = 0;
        int[] col = new int[matrixA.length];
        // Печать матрицы
        for (int i = 0; i < matrixA.length; i++) {
            int buf = 0;
            for (int j = 0; j < matrixA.length; j++) {
                buf += matrixA[j][i];
                System.out.print(matrixA[i][j] + "\t");
            }
            if (buf > sum) {
                sum = buf;
            }
            col[i] = buf;
            System.out.println();
        }
        for (int ignored : col) {
            System.out.print("--\t");
        }
        System.out.println();
        for (int i : col) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("Наибольшая сумма = " + sum);
    }
}

class TenE {
    void methodTen() {
        System.out.println("Исходная матрица:");
        int[][] matrixA = new int[10][10];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                //элементу массива присваивается случайное число от -99 до 99
                matrixA[i][j] = (int) (Math.random() * (100 - (-99)) + (-99));
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Положительные элементы главной диагонали:");
        for (int i = 0; i < matrixA.length; i++) {
            if (matrixA[i][i] > 0) {
                System.out.print(matrixA[i][i] + "; ");
            }
        }
    }
}

class ElevenE {
    void methodEleven() {
        int [][] matrixA = new int [10][20];
        StringBuilder sb = new StringBuilder("Больше трех раз 5 повторяется в строках: ");
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                matrixA[i][j] = (int) (Math.random() * 15);
                System.out.print(matrixA[i][j] + "\t");
                if (matrixA[i][j] == 5) {
                    count ++;
                }
            }
            System.out.println();
            if (count >= 3) {
                sb.append(i).append("; ");
            }
        }
        System.out.println();
        System.out.println(sb);
    }
}

class TwelveE {
    void methodTwelve() {
        System.out.println("Исходная матрица:");
        int [][] matrixA = new int[10][10];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                //элементу массива присваивается случайное число от 0 до 99
                matrixA[i][j]= (int)(Math.random() * 100);
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
        System.out.println();
        sortMatrix(matrixA, true);
        System.out.println();
        sortMatrix(matrixA, false);
    }
    void sortMatrix(int[][] matrixA, boolean ascending) {
        if (ascending) {
            System.out.println("Отсортированная по возрастанию строк матрица:");
        } else { // descending
            System.out.println("Отсортированная по убыванию строк матрица:");
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = j + 1; k < matrixA.length; k++) {
                    if ((ascending && matrixA[i][j] > matrixA[i][k]) ||
                            !ascending && matrixA[i][j] < matrixA[i][k]) {
                        int temp = matrixA[i][j];
                        matrixA[i][j] = matrixA[i][k];
                        matrixA[i][k] = temp;
                    }
                }
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
    }
}

class ThirteenE {
    void methodThirteen() {
        System.out.println("Исходная матрица:");
        int [][] matrixA = new int[10][10];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                //элементу массива присваивается случайное число от 0 до 99
                matrixA[i][j]= (int)(Math.random() * 100);
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
        System.out.println();
        sortMatrix(matrixA, true);
        System.out.println();
        sortMatrix(matrixA, false);
    }
    void sortMatrix(int[][] matrixA, boolean ascending) {
        if (ascending) {
            System.out.println("Отсортированная по возрастанию столбцов матрица:");
        } else { // descending
            System.out.println("Отсортированная по убыванию столбцов матрица:");
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                for (int k = i + 1; k < matrixA.length; k++) {
                    if ((ascending && matrixA[i][j] > matrixA[k][j]) ||
                            !ascending && matrixA[i][j] < matrixA[k][j]) {
                        int temp = matrixA[i][j];
                        matrixA[i][j] = matrixA[k][j];
                        matrixA[k][j] = temp;
                    }
                }
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
    }
}

class FourteenE {
    void methodFourteen() {
        int [][] matrix;
        int m = 10;
        int n = 10;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class FifteenE {
    void methodFifteen() {
        System.out.println("Исходная матрица:");
        int [][] matrixA = new int[10][10];
        int max = matrixA[0][0];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                //элементу массива присваивается случайное число от 0 до 99
                matrixA[i][j]= (int)(Math.random() * 100);
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (max < matrixA[i][j]) {
                    max = matrixA[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Наибольший элемент матрицы = " + max + "\n");
        System.out.println("Матрица после изменений:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                if (matrixA[i][j] % 2 != 0) {
                    matrixA[i][j] = max;
                }
                System.out.print(matrixA[i][j]  + "\t");
            }
            System.out.println();
        }
    }
}

class SixteenE {
    void methodSixteen() {
        int n = 5;
        int[][] matrixA = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;
        int cur_row;
        int cur_col;
        while (num <= n * n) {
            matrixA[row][col] = num;
            num++;
            cur_row = row;
            cur_col = col;
            row -= 1;
            col += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (col == n) {
                col = 0;
            }
            if (matrixA[row][col] != 0) {
                row = cur_row + 1;
                col = cur_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
