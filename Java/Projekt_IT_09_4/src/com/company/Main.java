package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getSumFromAtoB(1, 3));
    }

    public static int getSumFromAtoB(int a, int b){
        int i= (a>b)?b:a;
        int sum=0;
        while (i<= ((a>b)?a:b)){
        sum=sum+i;
        i++;
        }
        return sum;
    }
}
