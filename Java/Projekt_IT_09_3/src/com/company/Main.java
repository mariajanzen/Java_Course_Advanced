package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        doWhileDemo(0, "hello");
        forDemo(5, "privet");
        // whileDemo(1, "hello");
    }

    public static void doWhileDemo(int n, String string){
        System.out.println("while demo start");

        int i=0;
        do {
            System.out.println(i + ") " + string);
            i++;
        }
        while (i<n);

        System.out.println(i);

        System.out.println("while demo finish");
    }

    public static void forDemo(int n, String string){
        System.out.println("for demo start");

        int i=0;
        for (i=0; i<n; i++) {
            System.out.println(i + ") " + string);
        }
        System.out.println(i);

        System.out.println("for demo finish");
    }
}
