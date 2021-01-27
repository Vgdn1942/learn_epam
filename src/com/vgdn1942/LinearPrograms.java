package com.vgdn1942;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class LinearPrograms {

    public static void main(String[] args) {
        OneA one = new OneA();
        System.out.println(one.methodOne(9, 7, 5));

        TwoA two = new TwoA();
        System.out.println(two.methodTwo(2, 3, 2));

        ThreeA three = new ThreeA();
        System.out.println(three.methodThree(45, 90));

        FourA four = new FourA();
        System.out.println(four.methodFour(333.444f));

        FiveA five = new FiveA();
        System.out.println(five.methodFive(System.currentTimeMillis() / 1000L));

        SixA six = new SixA();
        System.out.println(six.methodSix(-3, 4));
    }
}

class OneA {
    float methodOne(float a, float b, float c) {
        return ((a - 3) * b / 2) + c;
    }
}

class TwoA {
    double methodTwo(double a, double b, double c) {
        return (b + Math.pow((Math.sqrt(b) + 4 * a * c), 1d/2d)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}

class ThreeA {
    double methodThree(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}

class FourA {
    float methodFour(float a) {
        String s = Float.toString(a);
        String[]output = s.split("\\.");
        return Float.parseFloat(output[1] + "." + output[0]);
    }
}

class FiveA {
    String methodFive(long time) {
        //String format = "HH" + "ч " + "mm" + "мин " + "ss" + "с";
        String format = "HHч mmмин ssс";
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(time * 1000));
    }
}

class SixA {
    boolean methodSix(int x, int y) {
        if (y <= 4 && y >= -3) {
            return (y > 0 && x >= -2 && x <= 2) ||
                    (y < 0 && x >= -4 && x <= 4);
        }
        return false;
    }
}