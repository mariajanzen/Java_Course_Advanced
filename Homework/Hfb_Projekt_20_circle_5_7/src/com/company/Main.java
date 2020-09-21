package com.company;

public class Main {

    public static void main(String[] args) {
	printSumInRub(2, 6);
        System.out.println("---------");
	printSumInRub(1,3);
        System.out.println("---------");
        printSumInRub(15, 10);
        System.out.println("---------");
        printSumInRub(25, 19);
    }

    public static void printSumInRub(int a, int b){
        int i=((a<=b)?a:b);
        int n=((a>b)?a:b);

        while (i<=n){
            String s=getRublesString(i);
            System.out.println(i +" "+ s);
            i++;
        }

    }

    public static String getRublesString(int i) {
        String ruble;

        if (i>=11&&i<=14) {
            return ruble = "рублей";
        } else {
            i=i%10;
            switch (i) {
                case 1:
                    ruble = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    ruble="рубля";
                    break;
                default:
                    return ruble="рублей";
            }
        }
        return ruble;
    }
}
