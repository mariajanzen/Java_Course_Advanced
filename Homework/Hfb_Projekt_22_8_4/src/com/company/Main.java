package com.company;

public class Main {

    public static void main(String[] args) {
        separateTheSentence("I always do my homework");

    }

    public static void separateTheSentence(String str){
        String helper="";
        String y="";

        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch==' '){
                helper="]"+str.charAt(i)+"[";

            }
            y=str.charAt(i)+helper;
            System.out.print(y);

        }

    }
}
