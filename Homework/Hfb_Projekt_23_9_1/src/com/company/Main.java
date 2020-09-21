package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name={"Valeriya","Inna","Nickolaus","Jack"};
        printShortName(name);

    }

    public static void printShortName(String[] name){
        for (int i=0; i<name.length; i++){
            int n=name[i].length();
            if (n<5){
                System.out.println(name[i]);
            }
        }
    }
}
