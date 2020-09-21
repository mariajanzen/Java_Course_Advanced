package com.company;

public class Main {

    public static void main(String[] args) {
	printHelloNTimes(9, "hello");
	countdown();
    }

    public static void printHelloNTimes(int n, String s){
        int i=1;
        while (i<=n){
            System.out.println(i+ ")" + s);
            i++;
        }
    }

    public static void countdown(){
        int i=5;
        while (i>0){
            System.out.println(i);
            i--;

        }
        System.out.println("start");
    }
}
