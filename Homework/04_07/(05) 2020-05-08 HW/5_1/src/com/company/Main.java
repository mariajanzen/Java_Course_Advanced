package com.company;

/*
5_1. Дано два числа (a и b). Написать метод, который вернет сумму всех чисел между (a и b).
Если a равно b, метод должен вернут a+b
Пример: sum(2,4) -> 9
 */

public class Main {

    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println("------- while -----------");
        System.out.println("sum numbers from "+ a +" to " + b +" is "+ sumWhile(a,b));

        System.out.println("------- for -----------");
        System.out.println("sum numbers from "+ a +" to " + b +" is "+ sumFor(a,b));

        System.out.println("------- do while -----------");
        System.out.println("sum numbers from "+ a +" to " + b +" is "+ sumDoWhile(a,b));



    }

    // 5_1 while
    private static int sumWhile(int a, int b) {
        int sum=0;
        if (a==b){
            sum = a+b;
        } else {
            int i = a;
            while (i <= b) {
                sum = sum + i;
                i++;
            }
        }
        return sum;
    }

    // 5_1 for
    private static int sumFor(int a, int b) {
        if(a==b){
            return a+b;
        }
        int sum=0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // 5_1 do..while
    private static int sumDoWhile(int a, int b) {
        int sum=0;
        if (a==b){
            sum = a+b;
        } else {
            int i = a;
            do {
                sum = sum + i;
                i++;
            } while (i <= b);
        }
        return sum;
    }


}
