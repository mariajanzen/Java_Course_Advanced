package com.company;

public class Main {

    public static void main(String[] args) {
	countdown();
    }

    public static void countdown (){
        int i=5;
        while (i>0){
            System.out.println(getNumByText(i));
            i--;
        }
        System.out.println("start");
    }

    public static String getNumByText(int num){
        switch (num){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            default: return "error";
        }
    }
}
