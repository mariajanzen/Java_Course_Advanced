package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 16;
        String str1 = "hello Java";
        double num = 10;
        int b;
        b=13;
        System.out.println(age);
        System.out.println(age+b);
        age = 20;
        System.out.println(age);
        System.out.println(age+b);
        System.out.println(str1);
        str1 = "let's start";
        System.out.println(str1);
        System.out.println("--------------------");
        System.out.println("1) " + "age="+age + " b="+ b);


        int temp = age;
        age = b;
        b = temp;


    }
}
