package com.company;
/*
3_5. Implement method “countdown” that prints numbers from 5 to 1, than prints „start“
countdown() ->  5
                4
                3
                2
                1
                Start

 */
public class Main {

    public static void main(String[] args) {
        // 3_5
        System.out.println("print countdown while loop");
        printCountdownWhile();
        System.out.println("------------------------------------");
        System.out.println("print countdown do-while loop");
        printCountdownDoWhile();
        System.out.println("------------------------------------");
        System.out.println("print countdown for loop");
        printCountdownFor();
    }

  // 3_5 while
    public static void printCountdownWhile(){
        int i=5;
        while (i>=1){
            System.out.println(i);
            --i;
        }
        System.out.println("start");
    }

    // 3_5 do ... while
    public static void printCountdownDoWhile(){
        int i=5;
        do{
            System.out.println(i);
            --i;
        }while(i>=1);
        System.out.println("start");
    }

    // 3_5 for
    public static void printCountdownFor(){
        for (int i=5;i>=1;--i){
            System.out.println(i);
        }
        System.out.println("start");
    }

}
