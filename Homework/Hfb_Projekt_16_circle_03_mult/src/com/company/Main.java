package com.company;

public class Main {

    public static void main(String[] args) {
        // 5_2
        multiplicationTable(2);

    }

    public static int multiplicationTable(int a) {
        int i = 1;
        int multiply = 1;

        while (i <= 10) {
            multiply = a * i;
            System.out.println(a+"*"+i+"="+multiply);
            ++i;

            }
            return multiply;
        }

}
