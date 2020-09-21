package com.company;

public class Main {

    public static void main(String[] args) {
	// 5_1
        System.out.println(getSumFromAtoB(1, 4));
        System.out.println(getSumFromAtoB(10, 10));

    }

    public static int getSumFromAtoB(int a, int b){
        int i=(a>b)?b:a;
        int sum=0;

        while (i<=((a<b)?b:a)){
            sum=sum+i;
            ++i;}
        return (a==b)?(sum+b):sum;
        }
}
