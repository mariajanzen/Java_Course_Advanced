package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 14;
        int b = 13;
        int c = 18;
       // double z=minus(14, 13, 18);
        int t=multiply(14, 13, 18);

        String greetings="Hello";
        String name=" Andy";

        System.out.println(greetings + name + "!");
        System.out.println("Here is my first homework:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("a+b=" + (a + b));
        System.out.println("b+c=" + (b + c));
        System.out.println("a+c=" + (a + c));
        System.out.println("-----------------");
        //System.out.println(z);
        System.out.println("(a-b)*c=" + t);
        System.out.println("-----------------");
        minus(a, b, c);
        // write your code here
    }

    private static void minus(double a, double b, double c) {
        double rez=b-a;
        double rez2=c-a;
        System.out.println("b-a=" + rez);
        System.out.println("c-a=" + rez2); }

    /* public static int minus(int a, int b, int c) {

          return b-a+c;

      }
  */
   public static int multiply(int a, int b, int c) {

        return (a-b)*c;

    }
    

}
