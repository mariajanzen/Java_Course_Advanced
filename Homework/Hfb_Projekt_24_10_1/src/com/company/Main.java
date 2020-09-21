package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names= {"Lera", "Oleg", "Irina", "Katja", "Oleg", "Daniel"};

        String[] names2= {"Jack","Valeriya","Nick","Slava","Nickolaus"};
        System.out.println(countTheName(names, "Oleg"));
        System.out.println("------");
        getFibonacciInArray(10);
        int[] num={10,2,4,56,34,5,6,98,3,2,45};
        System.out.println("-------");
        int[] num2={10,2,4,56,34,5,6,98,3,2,45};
        int difference=getDiffOfNumbers(num2);
        System.out.println("the difference of ints is: "+difference);
        System.out.println("------");
        int[] num3={10, 15, 69, 190, 2, 88, 12};
        //int[] changedNum3=changePositionsOfNumbers(num3);
        changePositionsOfNumbers(num3);

    }

    public static int countTheName(String[] list, String name){
       //10_1
        int counter=0;
        for (int i=0; i<list.length; i++){
            if (list[i].equals(name)){
                counter++;
            }
        }
        return counter;
    }

    public static void getFibonacciInArray(int x){
       //10_2
        int c;
        int[] fib=new int[x];
        fib[0]=1;
        fib[1]=1;
        System.out.print(fib[0]+" ");
        System.out.print(fib[1]+" ");
       for(int i=2; i<x; i++){
           fib[i]=fib[i-1]+fib[i-2];
           System.out.print(fib[i]+" ");
        }
    }

    public static int getDiffOfNumbers(int[] numbers){
        //10_3
        return getMaxOfNumbers(numbers)-getMinOfNumbers(numbers);
    }

    public static int getMaxOfNumbers(int[] numbers){
        int max=numbers[0];
        for (int i=0; i<numbers.length; i++){
            if (max<numbers[i]){
                max=numbers[i];
            }
        }
        return max;
    }

    public static int getIndexMaxOfNumbers(int[] numbers){
        int max=numbers[0];
        int indexOfMax=0;
        for (int i=0; i<numbers.length; i++){
            if (max<numbers[i]){
                max=numbers[i];
                indexOfMax=i;
            }
        }
        return indexOfMax;
    }

    public static int getMinOfNumbers(int[] numbers){
        int min=numbers[0];
        for (int i=0; i<numbers.length; i++){

            if (min>numbers[i]){
                min=numbers[i];
            }
        }
        return min;
    }

    public static int getIndexMinOfNumbers(int[] numbers){
        int min=numbers[0];
        int indexMin=0;
        for (int i=0; i<numbers.length; i++){
            if (min>numbers[i]){
                min=numbers[i];
                indexMin=i;
            }
        }
        return indexMin;
    }

    public static void changePositionsOfNumbers(int[] numbers) {
        //10_4
        int c = numbers.length;
        for(int i=0; i<numbers.length; ++i) {
            int indexMax=getIndexMaxOfNumbers(numbers);
            int first=numbers[0];
            int indexMin=getIndexMinOfNumbers(numbers);
            int last=numbers[c - 1];
            numbers[0] = getMaxOfNumbers(numbers);
            numbers[indexMax]=first;
            numbers[c - 1] = getMinOfNumbers(numbers);
            numbers[indexMin]=last;
            System.out.print("["+numbers[i]+"]");
        }
    }

}


