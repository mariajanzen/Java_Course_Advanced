package com.company;

/*
7_3. Дано целое число. Реализовать метод, который вернет сумму его разрядов.
Обратите внимание, число может быть маленьким, а может быть большим.
Пример: getSumOfDigits(5462)->17
        getSumOfDigits(5476213)->28
 */
public class Main {

    public static void main(String[] args) {
        int num=5476213;
        System.out.println("sum of Digits is " + getSumOfDigits(num));


    }

    // 7_3
    public static int getSumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
