package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names={"Jack", "Ivan", "Nikolaus", "Aleks", "Tamara", "Ben"};
        printShortNames(names);
        System.out.println(isThereTheName(names, "Aleks"));
        System.out.println(isThereTheName(names, "Boris"));
        System.out.println("-----");
        System.out.println("The index of this name is: "+getTheIndex(names, "Jack"));
        System.out.println("The index of this name is: "+getTheIndex(names, "Ben"));
        System.out.println("The index of this name is: "+getTheIndex(names, "Oleg"));

    }

    public static void printShortNames(String[] str){
        //9_1
        for (int i=0; i<str.length; ++i){
            if (str[i].length()<5){
                System.out.println(str[i]);
            }
        }
    }

    public static boolean isThereTheName(String[] str, String name){
        //9_2
        for(int i=0; i<str.length; ++i){
            if (str[i].equals(name)){
                return true;
            }
        }
        return false;
    }

    public static int getTheIndex(String[] str, String name){
        //9_3 error in first sout
        int index=0;
        for (int i=0; i<str.length; ++i){
            if(str[i].equals(name)){
               index=i;
            }else{
                index=-1;
            }
        }
        return index;
    }



}
