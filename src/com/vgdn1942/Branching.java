package com.vgdn1942;

public class Branching {
    public static void main(String[] args) {
        OneB one = new OneB();
        one.methodOne(45, 90);

        TwoB two = new TwoB();
        System.out.println(two.methodTwo(45, 90, 60, 75));

        ThreeB three = new ThreeB();
        three.methodThree(1, 2, 3, 4, 5, 6);

        FourB four = new FourB();
        four.methodFour(40, 20, 40, 41, 21);

        FiveB five = new FiveB();
        System.out.println(five.methodFive(2));
    }
}

class OneB {
    void methodOne(int a, int b) {
        String ret = "";
        if ((a + b) < 180) {
            System.out.println("Triangle exists");
        } else {
            System.out.println("Triangle NOT exists");
            return;
        }
        if (((a + b) == 90) || (a == 90) || (b == 90)) {
            System.out.println("Triangle right");
        } else {
            System.out.println("Triangle NOT right");
        }
    }
}

class TwoB {
    int methodTwo(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}

class ThreeB {
    void methodThree(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки НЕ лежат на одной прямой");
        }
    }
}

class FourB {
    void methodFour(int a, int b, int x, int y, int z) {
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдёт");
        } else {
            System.out.println("Кирпич НЕ пройдёт");
        }
    }
}

class FiveB {
    double methodFive(double x) {
        double F;
        if (x <= 3) {
            return (x * x) - (3 * x) + 9;
        } else {
            return 1 / ((x * x * x) + 6);
        }
    }
}