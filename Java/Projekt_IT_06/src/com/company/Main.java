package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        b= (condition) ? meaningTrue : meaningFalse;
         */
        System.out.println(abs(-6));
        System.out.println(rnd(4.567));
        System.out.println(rnd2(4.567));
    }
    public static boolean checkAbs(int a){
        return abs(a)>20;


    }
    public static int rnd(double num){
        double a=20;
        String s="result " + a;
        int c= (int)num;
        double a2=c;
        return c;
    }

    public static int rnd2(double num){
        int c = (int)num;
        double rest = num-c;
        return (rest>=0.5)? ++c : c;

    }

    public static int abs(int a){
        if (a<0){
            return -1*a;
        }else{
            return a;
        }
    }

    public static int abs2(int a){
      return  (a<0)? -1*a : a;
    }
}
