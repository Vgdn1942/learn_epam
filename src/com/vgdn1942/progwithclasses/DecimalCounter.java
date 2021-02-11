package com.vgdn1942.progwithclasses;

class StartCount {
    public static void main(String[] args) {
        DecimalCounter decimalCounter = new DecimalCounter();
        System.out.println(decimalCounter.toString());
        System.out.println(decimalCounter.getCount());
        decimalCounter.startCount();
        System.out.println(decimalCounter.getCount());
        decimalCounter.decreaseCount(10);
        System.out.println(decimalCounter.getCount());

        DecimalCounter decCounter = new DecimalCounter(20, 200);
        System.out.println(decCounter.toString());
        System.out.println(decCounter.getCount());
        decCounter.startCount();
        System.out.println(decCounter.getCount());
        decCounter.increaseCount(20);
        System.out.println(decCounter.getCount());
    }
}

public class DecimalCounter {
    private int startRange;
    private int stopRange;
    private int count;

    DecimalCounter() {
        this.startRange = 10;
        this.stopRange = 100;
        this.count = this.startRange;
    }

    DecimalCounter(int startRange, int stopRange) {
        this.count = startRange;
        this.startRange = startRange;
        this.stopRange = stopRange;
    }

    public void startCount() {
        for (int i = this.startRange; i < this.stopRange; i++) {
            this.count++;
        }
    }

    public void increaseCount(int step) {
        this.count = this.count + step;
    }

    public void decreaseCount(int step) {
        this.count = this.count - step;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DecimalCounter { " +
                "count = " + count +
                ", range = " + startRange +
                "-" + stopRange +
                " }";
    }
}
