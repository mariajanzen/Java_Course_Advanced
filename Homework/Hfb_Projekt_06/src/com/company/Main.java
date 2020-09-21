package com.company;

public class Main {

    public static void main(String[] args) {

       // System.out.println(checkDebit(66667777444.999, 9999933333973.1));
       // System.out.println(checkDebit(1, 4));
       // System.out.println(checkDebit(3, 2.9));
        System.out.println("--------------------");
        System.out.println(getPercent(1000, 4));
        System.out.println("--------------------");
        System.out.println(checkDebit(300, 400, 5));
        System.out.println(checkDebit(300, 301, 5));
        System.out.println("--------------------");
        System.out.println(getAbsoluteNum(6));
        System.out.println(getAbsoluteNum(-6));
        System.out.println(getAbsoluteNum(-16));

    }
    /*
       // public static boolean checkDebit(double debitAmount, double account){
            // if (debitAmount<=account) return true;
            //return false;

        */

    public static boolean checkDebit(double debitAmount, double account, double bankInterest){

        return ((debitAmount+bankInterest)<=account);
    }

    public static double bankInterest(double debitAmount, double interest){
        return interest*debitAmount/100;
    }

    public static double getPercent (double amount, double interest){

        return interest*amount/100;
    }

    public static int getAbsoluteNum(int x){
        return Math.abs(x);
    }
}
