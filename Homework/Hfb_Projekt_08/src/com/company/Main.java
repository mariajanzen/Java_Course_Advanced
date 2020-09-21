package com.company;

public class Main {

    public static void main(String[] args) {
	// different tasks
        System.out.println(checkTheTen(1, 7));
        System.out.println(checkTheTen(3, 7));
        System.out.println(checkTheTen(8, 10));
        System.out.println(checkTheTen(-10, 20));
        System.out.println("---------------------");
        System.out.println(checkInstrument(-10, 90)); //false
        System.out.println(checkInstrument(0, 20)); //false
        System.out.println(checkInstrument(-10, 200)); //true
        System.out.println(checkInstrument(-10, 100.1));  //true
        System.out.println(checkInstrument(-0.1, 200));  //true

    }

    public static boolean checkTheTen(int a, int b){
        return (a == 10) || (b == 10) || ((a + b) == 10);
    }

    public static boolean checkInstrument(double a, double b){
        return (a<0 && b>100);
    }
}
