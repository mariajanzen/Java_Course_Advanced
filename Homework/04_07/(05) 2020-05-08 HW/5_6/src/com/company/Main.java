package com.company;

/*
5_6. * Реализовать метод, который принимает целое положительное число и выводит на экран
все положительные числа, на которые заданное число делится без остатка и отображает количество
найденных делителей.
Пример: printDivisors(32) ->    32
                                16
                                8
                                4
                                2
                                1
                Total divisors: 6
 */

public class Main {

    public static void main(String[] args) {
        int num=33;
        System.out.println("------- while -----------");
        printDivisorsWhile(num);

        System.out.println("------- for -----------");
        printDivisorsFor(num);

        System.out.println("------- do while -----------");
        printDivisorsDoWhile(num);


    }

    // 5_6 While
    public static void printDivisorsWhile(int num) {
        int i=num/2;
        int count=1;
        System.out.println(num);
        while (i>0){
           if(num%i==0){
               System.out.println(i);
               count++;
           }
           i--;
        }
        System.out.println("---------");
        System.out.println("   "+ count);
    }

    // 5_6 do while
    public static void printDivisorsDoWhile(int num) {
        int i=num/2;
        int count=1;
        System.out.println(num);
        do{
            if(num%i==0){
                System.out.println(i);
                count++;
            }
            i--;
         }while (i>0);
        System.out.println("---------");
        System.out.println("   "+ count);
    }

    // 5_6 for
    public static void printDivisorsFor(int num) {
        int i,count=1;
        System.out.println(num);
        for(i=num/2;i>0;i--) {
            if(num%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("---------");
        System.out.println("   "+ count);
    }


}
