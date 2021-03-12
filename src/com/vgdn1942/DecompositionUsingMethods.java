package com.vgdn1942;

import java.util.Arrays;
import java.util.Scanner;

public class DecompositionUsingMethods {
    public static void main(String[] args) {
        int[] arrayA = {23, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 12, -1, 14, 15, 16, 21, 18, 19, 11, 17};

        OneG one = new OneG();
        one.methodOne(12, 40);

        TwoG two = new TwoG();
        two.methodTwo(120, 560, 160, 180);

        ThreeG three = new ThreeG();
        three.methodThree(10);

        FourG four = new FourG();
        four.methodFour();

        FiveG five = new FiveG();
        five.methodFive(arrayA);

        SixG six = new SixG();
        six.methodSix(13, 14, 25);

        SevenG seven = new SevenG();
        seven.methodSeven();

        EightG eight = new EightG();
        eight.methodEight(arrayA);

        NineG nine = new NineG();
        nine.methodNine(10, 10, 10, 10);

        TenG ten = new TenG();
        ten.methodTen(123456789);

        ElevenG eleven = new ElevenG();
        eleven.methodEleven(12300, 9000);

        TwelveG twelve = new TwelveG();
        twelve.methodTwelve(9, 99);

        ThirteenG thirteen = new ThirteenG();
        thirteen.methodThirteen(40);

        FourteenG fourteen = new FourteenG();
        fourteen.methodFourteen(400);

        FifteenG fifteen = new FifteenG();
        fifteen.methodFifteen(4);

        SixteenG sixteen = new SixteenG();
        sixteen.methodSixteen(3);

        SeventeenG seventeen = new SeventeenG();
        seventeen.methodSeventeen(111);
    }
}

class OneG {
    void methodOne(int a, int b) {
        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + " = " + nod(a, b) + ";");
        System.out.println("Наименьшее общеее кратное чисел " + a + " и " + b + " = " + nok(a, b) + ";");
    }
    int nod (int a, int b) {
        int c = a % b;
        a = b;
        b = c;
        return (c > 0) ? nod (a, b) : a;
    }
    int nok (int a, int b) {
        return a * (b / nod(a, b));
    }
}

class TwoG {
    void methodTwo(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        System.out.println("Наибольший общий делитель чисел " + Arrays.toString(arr) + " = " + nodArr(arr) + ";");
    }
    int nod (int a, int b) {
        int c = a % b;
        a = b;
        b = c;
        return (c > 0) ? nod (a, b) : a;
    }
    int nodArr(int[] arr) {
        int nod = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nod = nod(nod, arr[i]);
        }
        return nod;
    }
}

class ThreeG {
    void methodThree(int a) {
        double square = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Площадь правильного шестиугольника со стороной " + a + " = " + square * 6 + ";");
    }
}

class FourG {
    void methodFour() {
        double max = 0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество точек: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Координаты (x y): ");
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (f(x[i], y[i], x[j], y[j]) > max) {
                    max = f(x[i], y[i], x[j], y[j]);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(f(x[i], y[i], x[j], y[j]) - max) < 0.00000001) {
                    k++;
                    System.out.println("Пары точек #" + k + " => (" + (i + 1) + ", " + (j + 1) + ")");
                }
            }
        }
    }
    double f(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

class FiveG {
    void methodFive(int[] arr) {
        int max = arr[0];
        int submax = Integer.MIN_VALUE;
        boolean found = false;
        for (int i : arr) {
            if (i > max) {
                submax = max;
                max = i;
                found = true;
            } else if (i < max && i >= submax) {
                submax = i;
                found = true;
            }
        }
        if (found) {
            System.out.println("Второе по величине число массива = " + submax);
        }
    }
}

class SixG {
    void methodSix(int a, int b, int c) {
        if (nod(nod(a, b), c) == 1)
            System.out.println("Числа " + a + ", " + b + ", " + c + " взаимно простые");
        else
            System.out.println("Числа " + a + ", " + b + ", " + c + " НЕ взаимно простые");
    }
    int nod (int a, int b) {
        int c = a % b;
        a = b;
        b = c;
        return (c > 0) ? nod (a, b) : a;
    }
}

class SevenG {
    void methodSeven() {
        int f = 1;
        int n = 9;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            f *= i;
            if (i % 2 != 0)
                sum += f;
        }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 = " + sum);
    }
}

class EightG {
    void methodEight(int[] d) {
        int s1 = sumThree(d, 1);
        int s2 = sumThree(d, 3);
        int s3 = sumThree(d, 4);
        System.out.println("Массив = " + Arrays.toString(d));
        System.out.println("Полученные суммы: D1-D3 = " + s1 + "; D3-D5 = " + s2 + "; D4-D6 = " + s3 + ";");
    }
    int sumThree(int[] d, int num) {
        int sum = 0;
        for (int i = num; i <= num + 2; i++) {
            sum = sum + d[i];
        }
        return sum;
    }
}

class NineG {
    void methodNine(double x, double y, double z, double t) {
        double d = Math.sqrt(x * x + y * y); // Диагональ напротив прямого угла, нашли по теореме Пифагора
        double s1 = x * y * 0.5; // Первая часть площади четырехугольника
        double s2 = 0.25 * Math.sqrt((d + z + t) * (d + z - t) * (d + t - z) * (z + t - d)); // Вторая часть площади четырехугольника, найдено по формуле Герона
        double s = s1 + s2;
        System.out.println("Площадь четырёхугольника со сторонами " + x + " x " + y + " x "  + z + " x "  + t + " равна " + s);
    }
}

class TenG {
    void methodTen(int num) {
        int temp;
        int count = 0;
        temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        int j = count - 1;
        while (num != 0) {
            arr[j--] = num % 10;
            num /= 10;
        }
        System.out.println("Массив = " + Arrays.toString(arr));
    }
}

class ElevenG {
    void methodEleven(int a, int b) {
        int tempA = a;
        int tempB = b;
        int countA = 0;
        int countB = 0;
        while (tempA != 0) {
            countA++;
            tempA /= 10;
        }
        while (tempB != 0) {
            countB++;
            tempB /= 10;
        }
        System.out.println("Больше цифр в числе " + (countA > countB ? a : b));
    }
}

class TwelveG {
    void methodTwelve(int k, int n) {
        int[] arr = new int[k];
        fill(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
    int sum(int n) {
        int s = 0;
        while (n != 0) {
            s = (s + n % 10);
            n /= 10;
        }
        return s;
    }
    void fill(int[]a, int n, int k) {
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (sum(i) == k) {
                if (c < a.length) {
                    a[c] = i;
                    c++;
                }
            }
        }
    }
}

class ThirteenG {
    void methodThirteen(int n) {
        System.out.println("Числами «близнецами» на отрезке " + n + "-" + n * 2 + " являются числа: ");
        for (int i = 3; i < n - 1; i += 2) {
            if (simple(i) && simple(i + 2)) {
                System.out.println(i + " и " + (i + 2));
            }
        }
    }
    boolean simple(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

class FourteenG {
    void methodFourteen(int k) {
        int n;
        int po = 0;
        int count = 0;
        double arm;
        int tempK = k;
        int countK = 0;
        while (tempK != 0) {
            countK++;
            tempK /= 10;
        }
        int[] elem = new int[countK + 1];
        for (int i = 1; i < k; i++) {
            for (n = i; n >= 1; count++) {
                elem[count] = n % 10;
                n /= 10;
                po++;
            }
            arm = Math.pow(elem[0], po) + Math.pow(elem[1], po) +
                    Math.pow(elem[2], po);
            if (arm == i) {
                System.out.println(i);
            }
            Arrays.fill(elem, 0);
            po = 0;
            count = 0;
        }
    }
}

class FifteenG {
    void methodFifteen(int n) {
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (increase(i)) {
                System.out.println(i);
            }
        }
    }
    boolean increase(int a) {
        int t = a;
        boolean flag = true;
        while (t > 0) {
            if (t % 10 <= (t /10) % 10) {
                flag = false;
                break;
            }
            t = t / 10;
        }
        return flag;
    }
}

class SixteenG {
    void methodSixteen(int n) {
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1) + 1; i < Math.pow(10, n); i += 2) {
            boolean flag = false;
            int b = i;
            for (int j = n; j > 0; j--) {
                if (b % 2 == 0) {
                    flag = true;
                    break;
                }
                b /= 10;
            }
            if (!flag) {
                sum += i;
                System.out.println(" + " + i);
            }
        }
        System.out.println(" = " + sum);
        int count = 0;
        while (sum != 0) {
            if (sum % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        System.out.println("К-во чётных цифр: " + count);
    }
}

class SeventeenG {
    void methodSeventeen(int num) {
        int k = 0;
        while (num > 0) {
            num -= f(num);
            k += 1;
        }
        System.out.println("Надо произвести " + k + " действий");
    }
    int f(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
