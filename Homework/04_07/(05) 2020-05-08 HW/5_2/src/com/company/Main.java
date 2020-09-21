package com.company;

/*
5_2
Реализовать метод печатающий таблицу умножения для заданного числа
Пример: multiplicationTable(3)->
3x1=3
3x2=6
....
3x10=30
 */


public class Main {

    public static void main(String[] args) {
        int num=3;

        System.out.println("------- while -----------");
        printMultiplicationTableWhile(num);

        System.out.println("------- for -----------");
        printMultiplicationTableFor(num);

        System.out.println("------- do while -----------");
        printMultiplicationTableDoWhile(num);



    }

    // 5_2 while
    public static void printMultiplicationTableWhile(int n) {
        int i=1;
        while(i <= 10)  {
            System.out.println(n + " x " + i +" = " + n * i);
            i++;
        }
        System.out.println(" ");
    }

    // 5_2 for
    public static void printMultiplicationTableFor(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i +" = " + n * i);
        }
        System.out.println(" ");
    }

    // 5_2 while
    public static void printMultiplicationTableDoWhile(int n) {
        int i=1;
         do{
            System.out.println(n + " x " + i +" = " + n * i);
            i++;
        }while(i <= 10);
        System.out.println(" ");
    }


}
