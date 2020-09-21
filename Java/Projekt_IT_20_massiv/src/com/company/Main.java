package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr={12, 10, 19, 17, 19};
      print(arr);

        double[] arr2={1.0, 1.2, 1.9};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        String[] arr3={"qwe1", "qwe2", "qwer", "qwerty3", "qwerqwer"};
        stringsToUpperCase(arr3);
        print(arr3);
    }

    public static void print(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void stringsToUpperCase(String[] strings){
        for(int i=0; i<strings.length; i++){
            strings[i]=strings[i].toUpperCase();
        }
    }

    public static void print(String[] strings){
        for (int i=0; i<strings.length; i++){
            System.out.print(strings[i] + " ");
        }
    }
}


