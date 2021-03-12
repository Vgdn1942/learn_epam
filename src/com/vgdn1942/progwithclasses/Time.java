package com.vgdn1942.progwithclasses;

class Clock {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHrs(23);
        System.out.println(time.getTime());
        time.setMin(5);
        System.out.println(time.getTime());
        time.setTime(12, 23, 45);
        System.out.println(time.getTime());
        time.incTime(2, 15, 10);
        System.out.println(time.getTime());
        time.decTime(5, 10, 15);
        System.out.println(time.getTime());
    }
}

public class Time {
    int hrs;
    int min;
    int sec;

    public void setHrs(int hrs) {
        if (hrs > 23 | hrs < 0) {
            this.hrs = 0;
        } else {
            this.hrs = hrs;
        }
    }

    public void setMin(int min) {
        if (min > 59 | min < 0) {
            this.min = 0;
        } else {
            this.min = min;
        }
    }

    public void setSec(int sec) {
        if (sec > 59 | sec < 0) {
            this.sec = 0;
        } else {
            this.sec = sec;
        }
    }

    public void setTime(int hrs, int min, int sec) {
        this.setHrs(hrs);
        this.setMin(min);
        this.setSec(sec);
    }

    public void incTime(int hrs, int min, int sec) {
        this.setHrs(this.hrs + hrs);
        this.setMin(this.min + min);
        this.setSec(this.sec + sec);
    }

    public void decTime(int hrs, int min, int sec) {
        this.setHrs(this.hrs - hrs);
        this.setMin(this.min - min);
        this.setSec(this.sec - sec);
    }

    public String getTime() {
        boolean needZeroHrs = ((int) Math.ceil(Math.log10(this.hrs + 0.5)) < 2);
        boolean needZeroMin = ((int) Math.ceil(Math.log10(this.min + 0.5)) < 2);
        boolean needZeroSec = ((int) Math.ceil(Math.log10(this.sec + 0.5)) < 2);
        String printHrs = needZeroHrs ? "0" + this.hrs : String.valueOf(this.hrs);
        String printMin = needZeroMin ? "0" + this.min : String.valueOf(this.min);
        String printSec = needZeroSec ? "0" + this.sec : String.valueOf(this.sec);
        return printHrs + ":" + printMin + ":" + printSec;
    }
}
