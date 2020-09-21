package com.company;

public class Main {

    public static void main(String[] args) {
       // System.out.println(rubToString(11));
       // System.out.println(rubToString(2));
       // System.out.println(rubToString(5));
       // System.out.println(rubToString(1));
       // System.out.println("-----------");
        printRubles(5, 10);

    }

    public static void printRubles(int a, int b){
        int i=a;
        while (i<=b) {
            System.out.println(rubToString(i));
            i++;
        }
    }

    public static String rubToString(int rub) {
        int i = rub % 10;
        String rez = " ";
        if (rub % 100 >= 11 && rub % 100 <= 14) {
            rez= "рублей";
        } else {
            switch (i) {
                case 1:
                    rez="рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    rez= "рубля";
                    break;
                default:
                    rez= "рублей";
                    break;
            }
        }
        return rub+" "+rez;
    }
}
