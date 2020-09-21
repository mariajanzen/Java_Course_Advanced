package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names={Jack, Ivan, Nikolaus, Aleks, Tamara, Ben};
	printShortNames(names);


    }

    public static void printShortNames(String[] str){
        for (int i=0; i<str.length; ++i){
            if (str[i]<5){
                System.out.println(str[i]);
            }
        }
    }

}
