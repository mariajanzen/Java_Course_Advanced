package com.company;

/*
6_1. Написать метод, который выводит на экран таблицу умножения в виде
 */
public class Main {

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    // 6_1
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j=1;j<=10;j++){
                int res=i*j;
                System.out.print(((res<10)?" "+res:""+res)+"  ");
                }
            System.out.println();
        }
    }
}
