package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        multiplicationTable(10);
    }

    public static void multiplicationTable(int a){
        int i=1;
        //int m=1;

        for(i=1; i<=a; i++){

            System.out.print(i+"\t");
        }
    }
}
