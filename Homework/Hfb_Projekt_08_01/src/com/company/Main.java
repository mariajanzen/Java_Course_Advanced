package com.company;

public class Main {

    public static void main(String[] args) {
        // different tasks

        System.out.println("---------------------");
        System.out.println(checkInstrument(-10, 90)); //false
        System.out.println(checkInstrument(0, 20)); //false
        System.out.println(checkInstrument(-10, 200)); //true
        System.out.println(checkInstrument(-10, 100.1));  //true
        System.out.println(checkInstrument(-0.1, 200));  //true
        System.out.println(checkInstrument(101, 200));  //false
        System.out.println(checkInstrument(101, -100));  //true

    }



    public static boolean checkInstrument(double a, double b){
        return ((a<0 && b>100) || (b<0 && a>100));
    }
}
