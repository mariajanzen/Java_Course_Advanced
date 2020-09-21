package com.company;

public class Main {

    public static void main(String[] args) {
	printDivisors(32);
    }
    public static void printDivisors(int num) {
        int i = 1;
        int y = 0;
        int x=1;
        do {
            x = num / i;
            if (num % i == 0) {
                y = y + 1;
                System.out.println(x);
            }
            i++;
        }
        while (i <= num);
        System.out.println("Total divisors: " + y);
    }
}
