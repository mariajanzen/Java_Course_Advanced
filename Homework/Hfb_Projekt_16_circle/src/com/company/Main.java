package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
       printLineNTimes("hello", 5);

        System.out.println("----------");

        printCountdown(0);

        System.out.println("----------");

        printCountDownWord();
    }

    public static void printLineNTimes(String string, int number) {
        int i = 1;
        do {
            System.out.println(i + ") " + string);
            ++i;
        } while (i < number);
    }

    public static void printCountdown(int number) {
        int i = 5;
        while (i > number) {
            System.out.println(i);
            --i;
             }
        System.out.println("start");
    }

    public static void printCountDownWord(){
        int i=5;
        while (i>0){
            System.out.println(countDown(i));
            --i;
        }
        System.out.println("start");
    }

    public static String countDown(int a){
        String s="";
        switch (a){
            case 1:
                s="one";
                break;
            case 2:
                s="two";
                break;
            case 3:
                s="three";
                break;
            case 4:
                s="four";
                break;
            case 5:
                s="five";
                break;
            default:
                s="error";
        }
        return s;
    }
}
