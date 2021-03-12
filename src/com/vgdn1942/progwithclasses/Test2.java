package com.vgdn1942.progwithclasses;

class RunTest2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println("Default varOne = " + test2.getVarOne());
        System.out.println("Default varTwo = " + test2.getVarTwo());
        test2.setVarOne(20);
        test2.setVarOne(30);
        System.out.println("After set varOne = " + test2.getVarOne());
        System.out.println("After set varTwo = " + test2.getVarTwo());
        Test2 test22 = new Test2(10, 50);
        System.out.println("After set from constructor varOne = " + test22.getVarOne());
        System.out.println("After set from constructor varOne = " + test22.getVarTwo());
    }
}

public class Test2 {
    private int varOne;
    private int varTwo;

    Test2(int varOne, int varTwo) {
        this.varOne = varOne;
        this.varTwo = varTwo;
    }

    Test2() {
        this.varOne = 5;
        this.varTwo = 15;
    }

    public int getVarOne() {
        return varOne;
    }

    public void setVarOne(int varOne) {
        this.varOne = varOne;
    }

    public int getVarTwo() {
        return varTwo;
    }

    public void setVarTwo(int varTwo) {
        this.varTwo = varTwo;
    }
}
