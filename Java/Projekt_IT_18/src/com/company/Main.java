package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getResult(30,9));
        System.out.println(getResult(10, 30));

    }
    public static int getResult(int a, int b){
        int res;
        if (isCondition(a)&&isCondition(b)) {
            res=a+b;
        }else{
            int min=(a>b)?b:a;
            int max=(a>b)?a:b;
            res=max-min;
        }
        return res;
    }

    public static boolean isCondition(int a){

        return (a%3==0)&&(a>0)&&(a<100);
    }
}
