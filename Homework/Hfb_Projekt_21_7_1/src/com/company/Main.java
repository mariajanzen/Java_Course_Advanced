package com.company;

public class Main {

    public static void main(String[] args) {

        printReverseString("Hello!");
        printReverseString("ураураураураураА");
    }

    public static void printReverseString(String s){

        int i=s.length()-1;

        while (i>=0){
            System.out.print(s.charAt(i));
            i--;
        }
        System.out.println();
    }
}
