package com.company;

public class Main {

    public static void main(String[] args) {
        printHello( "Andrey");
        printHello( "Irina");
        printHello( "Maria");
        String n="Jack";
        printHello(n);
       int z=mult(minus(100, 20),10);
       System.out.println(z);

        minus(1000, 120);
        System.out.println(getHello() + " Jack");

        if(n=="Jack"){
            System.out.println("Jack the best");
        }  else{
            System.out.println("Where is Jack");
        };
    }

    public static void printHello(String name){
        System.out.println("Hello " + name );
    }

    public static int minus(int a, int b) {
        /*
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a-b="+(a-b));
         */
        return a-b;
    }

    public static int mult(int a, int b) {
        return a*b;
    }

    public static String getHello(){
        return "Привет!";
    }

}
