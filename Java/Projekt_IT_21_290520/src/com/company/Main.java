package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(5));


    }

    public static double sum(int n){
        double rez=0.0;
        int pow=2;
        for (int i=1; i<=n; i++){
            double j=1.0/pow;
            rez+=j;
            pow*=2;
        }

        return rez;
    }
}
