package com.company;

public class Main {

    public static void main(String[] args) {
      // printTriangle(10);
       // printTriangle2(10);
        printTriangle3(5);
       // printTriangle4(6);
        //printTriangle5(5);

    }

    public static void printTriangle(int n) {
        String str = "*";
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
            str = str + "*";
        }
    }

    public static void printTriangle2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printTriangle3(int n) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j + "\t");
                j++;
            } while (j <= i);
            System.out.println(" ");
            i++;
        } while (i <= n);
    }

    public static void printTriangle4(int n) {
        String str = "1 ";
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
            flag = !flag;
            str = str + ((flag) ? " 1 " : " 0 ");
        }

    }

    public static void printTriangle5(int n) {
        boolean flag1 = true;
        for (int i = 1; i <= n; i++) {
            boolean flag = flag1;
            for (int j = 1; j <= 1; j++) {
                System.out.println((flag) ? " 1 " : " 0 ");
                flag = !flag;
            }
            System.out.println(" ");
            flag1 = !flag1;
        }
    }
}
