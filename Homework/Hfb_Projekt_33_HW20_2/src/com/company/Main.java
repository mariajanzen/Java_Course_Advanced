package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{12, 2, 3, -2, 17, 3, 9, 1, 3, 4, 5, 6, -5, 28, 6, 2, 3, 4, 1, 1, -9, 11, 5};

        Parser parser=new Parser(array);
        System.out.println(parser.toString());

    }


}
