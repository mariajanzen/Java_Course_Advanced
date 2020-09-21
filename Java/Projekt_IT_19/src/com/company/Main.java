package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getResult(4, 10));
        System.out.println(getResult2(4, 10));
    }

    public static String getResult(int a, int b){
        String result="";
        int i=a;
        while (i<=b){
            if (i%4==0) {
                result = result + i + " ";
            }
            i++;
        }
        return result;
    }

    public static String getResult2(int a, int b){
        String result ="";
        for (int i=a; i<=b; i++){
            result+=i+" ";
        }
        return result;
    }
}
