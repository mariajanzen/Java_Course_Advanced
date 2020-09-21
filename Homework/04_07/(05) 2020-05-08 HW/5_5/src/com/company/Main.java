package com.company;

/*
5_5. Напишите метод, который выводит на экран квадрат с заданной стороной символами “*”
Пример: printSquare(4) ->   ****
                            ****
                            ****
                            ****
 */

public class Main {

    public static void main(String[] args) {
        int size=5;
        System.out.println("------- while -----------");
        printSquareWhile(size);

	    System.out.println("------- for -----------");
        printSquareFor(size);

        System.out.println("------- do while -----------");
        printSquareDoWhile(size);

        System.out.println();
        System.out.println("------- while and for -----------");
        printSquareWhileFor(size);

        System.out.println("------- separate method  -----------");
        printSquareWithMethod(size);

        System.out.println("------- without nested loop   -----------");
        printSquareWithoutNestedLoop(size);

    }

    // 5_5 While
    public static void printSquareWhile(int size) {
        int i=0;
        while (i++<size){
            int j=0;
            while (j++<size){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5_5 do while
    public static void printSquareDoWhile(int size) {
        int i=0;
        do{
            int j=0;
           do{
                System.out.print("*");
            } while (++j<size);
            System.out.println();
        }while (++i<size);
    }

    // 5_5 for
    public static void printSquareFor(int size) {
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ------------------ the nested loop may be not the same as outer loop
    //  5_5 while - for
    public static void printSquareWhileFor(int size) {
        int i=0;
        while (i++<size){
            for (int j=0;j<size;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ------------------ we can put the nested loop in a separate method
    //  5_5 separate method
    public static void printSquareWithMethod(int size) { //outer loop
        for (int i=0;i<size;i++){
            printLine(size);
        }
    }
    public static void printLine(int size) { // nested loop
        for (int i=0;i<size;i++){
            System.out.print("*");
        }
        System.out.println();
    }



    // ------------------ we can to solve the task without nested loop
    //  5_5 without nested loop

    public static void printSquareWithoutNestedLoop(int size) { // nested loop
        for (int i=1;i<=size*size;i++){
            System.out.print("*");
            if(i%size==0){
                System.out.println();
            }
        }
    }

}
