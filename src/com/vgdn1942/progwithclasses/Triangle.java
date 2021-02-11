package com.vgdn1942.progwithclasses;

class DrawTriangle {
    public static void main(String[] args) {
        Point a = new Point(1, 6);
        Point b = new Point(7, 9);
        Point c = new Point(9, 6);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Площадь треугольника: " + triangle.square());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.print("Точки пересечения медиан: ");
        triangle.medianCrossing().printPoint();
    }
}

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        // формула Герона
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public double perimeter() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        return ab + bc + ac;
    }

    public Point medianCrossing() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }
}

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0d;
        this.y = 0d;
    }

    public static double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void printPoint() {
        System.out.println("x: " + x + "; y: " + y);
    }
}