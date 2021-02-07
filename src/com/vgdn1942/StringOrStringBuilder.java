package com.vgdn1942;

import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOrStringBuilder {
    public static void main(String[] args) {
        String numString = " I have 22 bananas,   121       Pencils,   12 Bowls   and 32  Apples ";
        String palindrome = "qwqsqwq";
        String informatica = "информатика";
        String abcdef = "abc cde def";
        String sentence = "I have 22 bananas. 121 Pencils! 12 Bowls? And 32 Apples. I like Java!";

        OneI one = new OneI();
        one.methodOne(numString);

        TwoI two = new TwoI();
        two.methodTwo(numString);

        ThreeI three = new ThreeI();
        three.methodThree(palindrome);

        FourI four = new FourI();
        four.methodFour(informatica);

        FiveI five = new FiveI();
        five.methodFive(numString);

        SixI six = new SixI();
        six.methodSix(informatica);

        SevenI seven = new SevenI();
        seven.methodSeven(abcdef);

        EightI eight = new EightI();
        eight.methodEight(numString);

        NineI nine = new NineI();
        nine.methodNine(numString);

        TenI ten = new TenI();
        ten.methodTen(sentence);
    }
}

class OneI {
    void methodOne(String str) {
        int max = 0;
        Matcher matcher = Pattern.compile("( )\\1+").matcher(str);
        while (matcher.find()) {
            String buf = matcher.group();
            if (buf.length() > max) {
                max = buf.length();
            }
        }
        System.out.println("Наибольшее количество подряд идущих пробелов: " + max);
    }
}

class TwoI {
    void methodTwo(String str) {
        System.out.println("Строка ДО изменений = " + str);
        str = str.replace("a", "ab");
        System.out.println("Строка ПОСЛЕ изменений = " + str);
    }
}

class ThreeI {
    void methodThree(String str) {
        if (isPalindrome(str)) {
            System.out.println("Строка \"" + str + "\" палиндром");
        } else {
            System.out.println("Строка \"" + str + "\" НЕ палиндром");
        }
    }

    Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}

class FourI {
    void methodFour(String str) {
        String[] subStr = str.split("[инфмак]");
        String res = subStr[5] + subStr[3] + subStr[5];
        System.out.println("Результат = " + res);
    }
}

class FiveI {
    void methodFive(String str) {
        System.out.println("Строка = " + str);
        str = str.replaceAll("[^a]+", "");
        int count = str.length();
        System.out.println("Количество буквы \"a\" в строке = " + count);
    }
}

class SixI {
    void methodSix(String str) {
        System.out.println("Строка = " + str);
        StringBuilder sb = new StringBuilder();
        String[] buf = str.split("");
        for (String s : buf) {
            sb.append(s).append(s);
        }
        str = sb.toString();
        System.out.println("Результат = " + str);
    }
}

class SevenI {
    void methodSeven(String str) {
        System.out.println("Строка = " + str);
        StringBuilder stringBuilder = new StringBuilder();
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        str = str.replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            if (hashSet.add(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }
        str = stringBuilder.toString();
        System.out.println("Результат = " + str);
    }
}

class EightI {
    void methodEight(String str) {
        String[] buf = str.split("[\\s,.!?]+");
        String max = buf[0];
        for (int i = 1; i < buf.length; i++) {
            if (max.length() < buf[i].length())
                max = buf[i];
        }
        System.out.println("Самое длинное слово: " + max);
    }
}

class NineI {
    void methodNine(String str) {
        System.out.println("Строка = " + str);
        String tmp = str;
        str = str.replaceAll("[^a-z]+", "");
        tmp = tmp.replaceAll("[^A-Z]+", "");
        int countLower = str.length();
        int countUpper = tmp.length();
        System.out.println("Количество строчных букв в строке = " + countLower);
        System.out.println("Количество прописных букв в строке = " + countUpper);
    }
}

class TenI {
    void methodTen(String str) {
        System.out.println("Строка = " + str);
        str = str.replaceAll("[^.!?]+", "");
        int count = str.length();
        System.out.println("Количество предложений в строке: " + count);
    }
}