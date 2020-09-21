package com.company;

public class Main {

    public static void main(String[] args) {
	int i;
	String str="Hello";
        System.out.println(str.length());
        printStringVertical("Hello Java!");
        System.out.println("--------");
        printStringVertical2("Hello Java!");
        System.out.println("-------");
        printABC();

    }

    public static void printStringVertical(String str){
        int i=0;
        while (i<str.length()) {
            System.out.println(str.charAt(i));
            ++i;
        }
    }

    public static void printStringVertical2(String str){
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) != ' ') {
                System.out.println(str.charAt(i));

            }
        }

    }
    public static void printABC(){
        for (int i=1040; i<1072; i++){
            System.out.print((char)(i));
            if (i==1045){
                System.out.print((char)1025);
            }
        }
    }
}
