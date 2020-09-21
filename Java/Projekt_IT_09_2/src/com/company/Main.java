package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        whileDemo(5, "hello");
        // whileDemo(1, "hello");
    }

    public static void whileDemo(int n, String string){
        System.out.println("while demo start");

        int i=10;
        while (i>=n){
            System.out.println(i+") "+string);
            i--;
        }
        System.out.println(i);

        System.out.println("while demo finish");
    }
}
