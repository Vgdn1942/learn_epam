package com.vgdn1942.learn.cave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("При вводе текста произошла ошибка, попробуйте ещё раз");
            return readString();
        }
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readString());
        } catch (NumberFormatException e) {
            System.out.println("При вводе числа произошла ошибка, попробуйте ещё раз");
            return readInt();
        }
    }

    public static double readDouble() {
        try {
            return Double.parseDouble(readString());
        } catch (NumberFormatException e) {
            System.out.println("При вводе числа произошла ошибка, попробуйте ещё раз");
            return readDouble();
        }
    }
}
