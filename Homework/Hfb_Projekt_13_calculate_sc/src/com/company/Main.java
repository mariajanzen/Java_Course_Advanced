package com.company;

public class Main {
    //я сначала взяла переменные int a, int b,
    // но если при делении получались дроби, то он не выдавал
    // корректный результат, поэтому я заменила переменные на double

    public static void main(String[] args) {
        System.out.println(calculate(3, 2, "+"));
        System.out.println(calculate(16, 8, "/"));
        System.out.println(calculate(1, 9, "-"));
        System.out.println(calculate(10, 2, "*"));
        System.out.println(calculate(3, 2, "%"));
        System.out.println(calculate(3, 2, "/"));
    }

    public static double calculate(double a, double b, String operation){
        double rez=0;
        switch (operation){
            case "*":
                rez=a*b;
                break;
            case "+":
                rez=a+b;
                break;
            case"/":
                rez=a/b;
                break;
            case "-":
                rez=a-b;
                break;
            default:
                rez=0;
                break;
        }
        return rez;
    }
}
