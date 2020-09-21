package com.company;

public class Main2 {
    public static void main(String[] args) {
        String[] names= {"Lera", "Oleg", "Jack", "Irina", "Katja", "Oleg", "Daniel"};
        String[] names2= {"Lera", "Oleg", "Jack", "Jack", "Irina", "Katja", "Daniel"};

        System.out.println("-------false----");
        System.out.println(checkTheSameLines(names));
        System.out.println("-------true----");
        System.out.println(checkTheSameLines(names2));

    }

    public static boolean checkTheSameLines(String[] str){
       //10_5
        for (int i=1; i<str.length; i++){
            if(str[i]==str[i-1]){
                return true;
            }
            }
        return false;
        }
    }

