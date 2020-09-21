package com.company;
/*
3_6. * Implement method “countdown” that prints numbers from 5 to 1 by text, than prints „start“
countdown() ->  five
                four
                tree
                two
                one
                start
 */
public class Main {

    public static void main(String[] args) {
        // 3_6
        System.out.println("print countdown while loop");
        printTextCountdownWhile();
        System.out.println("------------------------------------");
        System.out.println("print countdown do-while loop");
        printTextCountdownDoWhile();
        System.out.println("------------------------------------");
        System.out.println("print countdown for loop");
        printTextCountdownFor();
    }

  // 3_6 while
    public static void printTextCountdownWhile(){
        int i=5;
        while (i>=1){
            System.out.println(getNumByText(i));
            --i;
        }
        System.out.println("start");
    }

    // 3_6 do ... while
    public static void printTextCountdownDoWhile(){
        int i=5;
        do{
            System.out.println(getNumByText(i));
            --i;
        }while(i>=1);
        System.out.println("start");
    }

    // 3_6 for
    public static void printTextCountdownFor(){
        for (int i=5;i>=1;--i){
            System.out.println(getNumByText(i));
        }
        System.out.println("start");
    }
    public static String getNumByText(int num){
        String numString="";
        switch (num){
            case 1: numString="one"; break;
            case 2: numString="two"; break;
            case 3: numString="three"; break;
            case 4: numString="four"; break;
            case 5: numString="five"; break;
            default:numString="unknown numeric";
        }
        return  numString;
    }


}
