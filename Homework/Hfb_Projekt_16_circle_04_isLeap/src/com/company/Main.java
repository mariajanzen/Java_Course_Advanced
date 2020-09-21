package com.company;

public class Main {

    public static void main(String[] args) {

        printLeapYears(2000, 2020);
        System.out.println("-----");
        printAmountLeapYears(2000, 2020);
    }

    public static void printLeapYears(int year1, int year2){
        int i=((year1>year2)?year2:year1);

        do {if (isLeap(i)){
            System.out.println(i);
        }
            ++i;}
                while(i<=((year1<year2)?year2:year1)); ;

    }

    public static boolean isLeap(int year){
boolean i;
        return i=((year%100!=0 && year%4==0)||(year%400==0));
    }
   public static void printAmountLeapYears(int year1, int year2){
        int i=((year1>year2)?year2:year1);
        int y=0;

        do { if (isLeap(i))
            y=y+1;
            ++i;}
        while(i<=((year1<year2)?year2:year1)); ;
        System.out.println(y);
    }
}
