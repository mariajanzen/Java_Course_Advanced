package com.company;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public static int getSum(int a, int b) {
        return a+b;
    }

    public static int getMinus(int a, int b) {
        return a-b;
    }

    public static int getMultiply(int a, int b) {
        return a*b;
    }

    public static int getDivision(int a, int b) {
        return a/b;
    }
}
