package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSumOfDigits(12345));
    }

    public static int getSumOfDigits(int n){

        int sum=0;
       int x=0;
        while (n>0){
            int i=n%10;
            n=n/10;
            sum=sum+i;
            }
        return sum;
    }
}
