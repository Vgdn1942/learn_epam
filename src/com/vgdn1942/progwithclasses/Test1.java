package com.vgdn1942.progwithclasses;

class RunTest1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setVarOne(5);
        test1.setVarTwo(15);
        test1.printVarOne();
        test1.printVarTwo();
        System.out.println(test1.maxVar());
        System.out.println(test1.sumVar());
    }
}

public class Test1 {
    private int varOne;
    private int varTwo;

    public void setVarOne(int varOne) {
        this.varOne = varOne;
    }

    public void printVarOne() {
        System.out.println(varOne);
    }

    public void setVarTwo(int varTwo) {
        this.varTwo = varTwo;
    }

    public void printVarTwo() {
        System.out.println(varTwo);
    }

    public int sumVar() {
        return (varOne + varTwo);
    }

    public int maxVar() {
        return Math.max(varOne, varTwo);
    }
}
