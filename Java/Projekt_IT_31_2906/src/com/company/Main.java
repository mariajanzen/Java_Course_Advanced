package com.company;

public class Main {

    public static void main(String[] args) {
        method(4);
    }

    public static int method(int temp){
        System.out.println("start temp = "+temp);
        if(temp>1){
            method(temp/2);
            method(temp/4);
        }
        System.out.println("finish temp = "+ temp);
        return 1;
    }
}
