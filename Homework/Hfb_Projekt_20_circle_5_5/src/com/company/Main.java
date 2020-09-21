package com.company;

public class Main {

    public static void main(String[] args) {
	//printSquare(4);
	//printSquare(8);
        printSquare2();
    }

    public static String printSquare(int n){

        String str="*";
        int i=1;

        while(i<=n){
            System.out.print(str);
            i++;
        }
       System.out.println();
        return str;
    }
    public static String printSquare2(){
       return printSquare(4) + printSquare(4);
    }
}
