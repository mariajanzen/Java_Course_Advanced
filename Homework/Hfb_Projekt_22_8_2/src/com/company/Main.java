package com.company;

public class Main {

    public static void main(String[] args) {
        printPrimeNumbers(4, 20);

    }

    public static void printPrimeNumbers(int start, int finish){
        int i=start;
        int j=2;
        while (i<=finish) {
            while (j < finish) {
                if (i % j != 0) {
                    System.out.print(i + " ");
                    j++;
                }
            }
            i++;
        }
    }
}
